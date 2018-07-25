<%-- 
    Document   : thongtin
    Created on : Jul 15, 2018, 11:21:21 AM
    Author     : HANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> GALAXY MOVIES Thông tin phim </title>
        <meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/style.css">
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <div class="container-fluid" style="background-color:lightgray; border-radius:5px;">
                        <img class="img-responsive" id="preview-img" src=""  style="margin-top:5px;" alt="">
                        <div class="text-center">
                            <a href="<%
                                if (request.getParameter("id") != null) {
                                    if (request.getParameter("id") != "") {
                                        out.print("/web/xemphim.jsp?id=" + request.getParameter("id"));
                                    }
                                }

                               %>"><button class="btn btn-danger btn-lg">Xem phim</button></a>
                        </div>
                    </div>					
                </div>
                <div class="col-md-7">
                    <div class="container-fluid" style="font-size:25px; background-color:lightgray; border-radius:5px;" id="movie-info">
                        <p class="text-center" style="font-size:35px;"><span class="label label-info">Thông tin phim</span></p>
                        <!--
                        <p>Tên phim: Liệt hỏa như ca Liehuo Ruge (2018)</p>
                        <p>Đạo diễn: Lý Vĩ Cơ</p>
                        <p>Diễn viên: ĐLNBa, Châu Du Dân</p>
                        <p>Thể loại: Phiêu lưu - hành động, Cổ trang - thần thoại</p>
                        <p>Quốc gia: Trung Quốc</p>
                        <p>Thời lượng: 120 phút</p>
                        <p>Lượt xem: 12000</p>
                        <p>Điểm bình luận: 120</p>
                        <p> Đánh giá: (8đ/100 lượt) <span class="glyphicon" style="color:yellow;">&#xe006;&#xe006;&#xe006;&#xe006;&#xe006;&#xe006;&#xe006;&#xe006;</span><span class="glyphicon" style="color:yellow;">&#xe007;&#xe007;</span></p>
                        -->
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div>
                        <div class="form-group">
                            <label for="usr" style="color:white;">Email:</label>
                            <input type="email" class="form-control" id="mail">
                        </div>
                        <div class="form-group" style="font-size:20px;">
                            <label style="color:white;">Nội dung: </label>
                            <textarea class="form-control" rows="5" id="commentvalue"></textarea>
                        </div>
                        <div class="text-right">
                            <button class="btn btn-default" id="submitcomment">Đăng bình luận</button>
                        </div>
                    </div> 
                </div>
                <div class="col-md-12" style="font-size:20px;" id="comment">
                    <p style="font-size:35px;"><span class="label label-info">Bình luận</span></p>
                </div>
            </div>
        </div>
        <script>
            $(document).ready(function () {
                var movieId = '<%                    if (request.getParameter("id") != null) {
                        if (request.getParameter("id") != "") {
                            out.print(request.getParameter("id"));
                        }
                    }

            %>';
                if (movieId != '') {
                    $.get("http://localhost:3000/movie-info?id=" + movieId, function (data, status) {
                        var resData = JSON.parse(data);
                        document.getElementById("preview-img").src = resData.phim.hinhanh;
                        document.getElementsByTagName("title")[0].innerHTML += resData.phim.tenphim;
                        var totalScore = 0;
                        for (var j = 0; j < resData.phim.danhgia.length; j++) {
                            totalScore += Number(resData.phim.danhgia[j].diem);
                        }
                        var ratedScore = Math.round(totalScore / resData.phim.danhgia.length);
                        var ratingHTML = '(' + ratedScore + 'đ/' + resData.phim.danhgia.length + ' lượt)';
                        var star = '';
                        var emptyStar = '';
                        for (var i = 0; i < 10; i++) {
                            if (i < ratedScore) {
                                star += '&#xe006;';
                            } else {
                                emptyStar += '&#xe007;';
                            }
                        }
                        ratingHTML = '<p>' + ratingHTML + ' <span class="glyphicon" style="color:yellow;">' + star + '</span><span class="glyphicon" style="color:yellow;">' + emptyStar + '</span>' + '</p>';
                        var commentHTML = '';
                        for (var i = 0; i < resData.phim.binhluan.length; i++) {
                            commentHTML += '<div class="well well-sm"><p>'
                                    + resData.phim.binhluan[i].email + ':'
                                    + resData.phim.binhluan[i].noidung + '</p><p class="text-right">Đăng lúc '
                                    + resData.phim.binhluan[i].thoigian + '</p></div>';
                        }
                        document.getElementById("comment").innerHTML += commentHTML;
                        var infoHTML = '<p>Tên phim: ' + resData.phim.tenphim + '</p><p>Đạo diễn: '
                                + resData.phim.daodien + '</p><p>Diễn viên: '
                                + resData.phim.dienvien + '</p><p>Thể loại: '
                                + resData.phim.theloai + '</p><p>Quốc gia: '
                                + resData.phim.quocgia + '</p><p>Thời lượng: '
                                + resData.phim.thoiluong + '</p><p>Lượt xem: '
                                + resData.phim.luotxem + '</p>' + ratingHTML;
                        document.getElementById("movie-info").innerHTML += infoHTML;
                    });
                }
            });
            //binhluan
            $('#submitcomment').click(function (){
                var movieId = '<%                    if (request.getParameter("id") != null) {
                        if (request.getParameter("id") != "") {
                            out.print(request.getParameter("id"));
                        }
                    }

                %>';
                if(movieId !== ''){
                   var commentvalue = document.getElementById('commentvalue').value;
                   var email= document.getElementById('mail').value;
                   if(commentvalue !== '' && email !== ''){
                       $.get("http://localhost:3000/add-comment",
                                {
                                    id: movieId,
                                    email: email,
                                    noidung: commentvalue
                                 },
                            function(data, status){
                                var resData = JSON.parse(data);
                                alert(resData.message);
                        });
                   }
                }
            });
        </script>
    </body>
</html>