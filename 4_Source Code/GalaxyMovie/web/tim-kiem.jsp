<%-- 
    Document   : tim-kiem
    Created on : Jul 21, 2018, 10:43:18 AM
    Author     : HANG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

