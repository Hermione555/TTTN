<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <li class="active"><a href="index.jsp"><span class="glyphicon glyphicon-home"></span></a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Thể loại
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="theloai-khoahocvientuong.jsp">Khoa học - viễn tưởng</a></li>
                        <li><a href="theloai-phieuluuhanhdong.jsp">Phiêu lưu - Hành động</a></li>
                        <li><a href="theloai-tamlytinhcam.jsp">Tâm lý - Tình cảm</a></li>
                        <li><a href="theloai-kinhdima.jsp">Kinh dị - Ma</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Quốc gia
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="quocgia-my.jsp">Mỹ</a></li>
                        <li><a href="quocgia-hanquoc.jsp">Hàn quốc</a></li>
                        <li><a href="quocgia-trungquoc.jsp">Trung Quốc</a></li>
                        <li><a href="quocgia-thailan.jsp">Thái Lan</a></li>
                    </ul>
                </li>
                <li><a href="#"><span class="glyphicon glyphicon-star"></span> TOP PHIM</a></li> 
            </ul>
            <%@include file="tim-kiem.jsp" %>
        </div>
    </div>
</nav>