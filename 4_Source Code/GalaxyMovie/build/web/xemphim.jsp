<%-- 
    Document   : xemphim
    Created on : Jul 15, 2018, 10:02:04 AM
    Author     : HANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.lang.String" %>
<!DOCTYPE html>
<html>
    <head>
        <title> GALAXY MOVIES </title>
        <meta  http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/style.css">
        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#hangNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span> 
                    </button>
                </div>
                <div class="collapse navbar-collapse" id="hangNavbar">
                    <ul class="nav navbar-nav navbar-left">
                        <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Thể loại
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Khoa học - viễn tưởng</a></li>
                                <li><a href="#">Phiêu lưu - Hành động</a></li>
                                <li><a href="#">Tâm lý - Tình cảm</a></li>
                                <li><a href="#">Kinh dị - Ma</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">Quốc gia
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Mỹ</a></li>
                                <li><a href="#">Hàn quốc</a></li>
                                <li><a href="#">Trung Quốc</a></li>
                                <li><a href="#">Singapore</a></li>
                            </ul>
                        </li>
                        <li><a href="#">Phim chiếu rạp</a></li> 
                        <li><a href="#"><span class="glyphicon glyphicon-star"></span> TOP PHIM</a></li> 
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <form class="form-inline" action="" method="GET" style="position: relative; margin-top:8px;">
                                <div class="form-group">
                                    <input type="text" id="timphim" name="timphim" class="form-control" placeholder="Tìm phim...">
                                </div>
                                <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
                                <div class="list-group" id="suggestbox" style="position: absolute; z-index: 1;"></div>
                            </form>
                        </li>
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Đăng ký</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Đăng nhập</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="container-fluid text-center">
                        <video id="movie-player" controls>
                            <!--
                            <source src="phim/liehuo ruge.mp4" type="video/mp4">
                            -->
                        </video> 
                    </div>
                    <p style="font-size:25px;"><span class="label label-info" id="rating"> Đánh giá: </span></p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <form action="">
                        <div class="form-group" style="font-size:20px;">
                            <label style="color:white;">Thêm bình luận mới về phim này: </label>
                            <textarea class="form-control" rows="5" name="comment"></textarea>
                        </div>
                        <div class="text-right">
                            <button type="submit" class="btn btn-default">Đăng bình luận</button>
                        </div>
                    </form> 
                </div>
                <div class="col-md-12" style="font-size:20px;" id="comment">
                    <p style="font-size:35px;"><span class="label label-info">Bình luận</span></p>
                    
                    <!--
                    <div class="well well-sm">
                        <p>Quốc Anh: Phim dở òm.</p>
                        <p class="text-right">Đăng lúc 9:38 05-04-2018</p>
                    </div>
                    <div class="well well-sm">
                        <p>Chế Hằng: Thấy chưa chế bảo mà.</p>
                        <p class="text-right">Đăng lúc 9:35 05-04-2018</p>
                    </div>
                    <div class="well well-sm">
                        <p>Thái: Phim này hay dữ.</p>
                        <p class="text-right">Đăng lúc 9:30 05-04-2018</p>
                    </div>
                    -->
                </div>
            </div>
        </div>
        <script>
            $(document).ready(function () {
                var movieId = '<%
                    if (request.getParameter("id") != null) {
                        if (request.getParameter("id") != "") {
                            out.print(request.getParameter("id"));
                        }
                    }

            %>';
                if (movieId != '') {
                    $.get("http://localhost:3000/movie-info?id=" + movieId, function (data, status) {
                        var resData = JSON.parse(data);
                        document.getElementById("movie-player").src = resData.phim.linkphim;
                        document.getElementsByTagName("title")[0].innerHTML += resData.phim.tenphim;
                        var totalScore = 0;
                        for(var j = 0; j < resData.phim.danhgia.length; j++){
                            totalScore += Number(resData.phim.danhgia[j].diem);
                        }
                        var ratedScore = Math.round(totalScore/resData.phim.danhgia.length);
                        var ratingHTML = '('+ ratedScore +'đ/'+ resData.phim.danhgia.length +' lượt)';
                        var star = '';
                        var emptyStar = '';
                        for(var i = 0; i < 10; i++){
                            if(i < ratedScore){
                                star += '&#xe006;';
                            }
                            else{
                                emptyStar += '&#xe007;';
                            }
                        }
                        document.getElementById("rating").innerHTML += ratingHTML + ' <span class="glyphicon" style="color:yellow;">'+ star +'</span><span class="glyphicon" style="color:yellow;">'+ emptyStar +'</span>';
                        var commentHTML = '';
                        for(var i = 0; i < resData.phim.binhluan.length; i++){
                            commentHTML += '<div class="well well-sm"><p>' 
                                    + resData.phim.binhluan[i].email + ':'
                                    + resData.phim.binhluan[i].noidung +'</p><p class="text-right">Đăng lúc ' 
                                    + resData.phim.binhluan[i].thoigian +'</p></div>';
                        }
                        document.getElementById("comment").innerHTML += commentHTML;
                    });
                }
            });
        </script>
    </body>
</html>
