var express = require('express');
var app = express();
var MongoClient = require('mongodb').MongoClient;
var ObjectID = require('mongodb').ObjectID;
var url = "mongodb://localhost:27017/";
var bodyParser = require('body-parser')
var dateTime = require('node-datetime');

app.set('view engine', 'ejs');

app.use(function (req, res, next) {
  res.header("Access-Control-Allow-Origin", "*");
  res.header('Access-Control-Allow-Methods', 'DELETE, PUT, GET, POST');
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});
app.use(bodyParser.json())
app.use(bodyParser.urlencoded({'extended':'false'}))

//LAY HET PHIM
app.get('/movie-list', function (req, res) {
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    //var query = { address: "Park Lane 38" };
    dbo.collection("movie").find({}).toArray(function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
});

//LAY THONG TIN PHIM
app.get('/movie-info', function (req, res) {
  var movieIdObj = new ObjectID(req.query.id);
  //console.log(movieId);
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    var query = { "_id": movieIdObj };
    dbo.collection("movie").findOne(query, function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
});
//Them binh luan
app.get('/add-comment', function (req, res) {
  var movieIdObj = new ObjectID(req.query.id);
  var dt = dateTime.create();
  var currentTime = dt.format('Y-m-d H:M:S');
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    var myquery = { "_id": movieIdObj };
    var newvalues = { $push: {"phim.binhluan":{email: req.query.email, noidung: req.query.noidung, thoigian: currentTime}}};
    dbo.collection("movie").updateOne(myquery, newvalues, function(err, addresult) {
      resultmsg = {};
     if (err){
      resultmsg = {message: "Failed new comment"};
      throw err;
     }
     else{
      resultmsg = {message: "Added new comment"}
     }
      res.render('output', { result: resultmsg });
      db.close();
    });
  });
});
//-------THELOAI----------
//KHOA-HOC-VIEN-TUONG
app.get('/movie-list/khoa-hoc-vien-tuong',function (req, res) {
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    dbo.collection("movie").find({"phim.theloai":"Khoa học - viễn tưởng"}).toArray(function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
})
//PHIEU-LUU-HANH-DONG
app.get('/movie-list/phieu-luu-hanh-dong',function (req, res) {
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    dbo.collection("movie").find({"phim.theloai":"Phiêu lưu - Hành động"}).toArray(function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
})

//TAM-LY-TINH-CAM
app.get('/movie-list/tam-ly-tinh-cam',function (req, res) {
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    dbo.collection("movie").find({"phim.theloai":"Tâm lý - Tình cảm"}).toArray(function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
})
//KINH-DI-MA
app.get('/movie-list/kinh-di-ma',function (req, res) {
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    dbo.collection("movie").find({"phim.theloai":"Kinh dị - Ma"}).toArray(function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
})
//-------------THELOAI
//MY
app.get('/movie-list/quoc-gia/my',function (req, res) {
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    dbo.collection("movie").find({"phim.quocgia":"Mỹ"}).toArray(function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
})
//TRUNGQUOC
app.get('/movie-list/quoc-gia/trung-quoc',function (req, res) {
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    dbo.collection("movie").find({"phim.quocgia":"Trung Quốc"}).toArray(function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
})
//HANQUOC
app.get('/movie-list/quoc-gia/han-quoc',function (req, res) {
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    dbo.collection("movie").find({"phim.quocgia":"Hàn Quốc"}).toArray(function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
})
//THAILAN
app.get('/movie-list/quoc-gia/thai-lan',function (req, res) {
  MongoClient.connect(url, function (err, db) {
    if (err) throw err;
    var dbo = db.db("galaxy_movie");
    dbo.collection("movie").find({"phim.quocgia":"Thái Lan"}).toArray(function (err, result) {
      if (err) throw err;
      res.render('output', { result: result });
      db.close();
    });
  });
})
// //TIM KIEM THEOTEN
// app.get('/movie-list/tim-kiem/:ten',function (req, res) {
//   MongoClient.connect(url, function (err, db) {
//     if (err) throw err;
//     var dbo = db.db("galaxy_movie");
//     dbo.collection("movie").find({"phim.tenphim":req.params.ten}).toArray(function (err, result) {
//       if (err) throw err;
//       res.render('output', { result: result });
//       db.close();
//     });
//   });
// })


app.listen(3000);
console.log('3000 is the magic port');