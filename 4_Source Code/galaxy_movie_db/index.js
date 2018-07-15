var express = require('express');
var app = express();
var MongoClient = require('mongodb').MongoClient;
var ObjectID = require('mongodb').ObjectID;
var url = "mongodb://localhost:27017/";

app.set('view engine', 'ejs');

app.use(function (req, res, next) {
  res.header("Access-Control-Allow-Origin", "*");
  res.header('Access-Control-Allow-Methods', 'DELETE, PUT, GET, POST');
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});

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


app.listen(3000);
console.log('3000 is the magic port');