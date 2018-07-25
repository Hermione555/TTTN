package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class thongtin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/tim-kiem.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> GALAXY MOVIES Thông tin phim </title>\n");
      out.write("        <meta  http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#hangNavbar\">\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span> \n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"hangNavbar\">\n");
      out.write("            <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                <li class=\"active\"><a href=\"index.jsp\"><span class=\"glyphicon glyphicon-home\"></span></a></li>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Thể loại\n");
      out.write("                        <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"theloai-khoahocvientuong.jsp\">Khoa học - viễn tưởng</a></li>\n");
      out.write("                        <li><a href=\"theloai-phieuluuhanhdong.jsp\">Phiêu lưu - Hành động</a></li>\n");
      out.write("                        <li><a href=\"theloai-tamlytinhcam.jsp\">Tâm lý - Tình cảm</a></li>\n");
      out.write("                        <li><a href=\"theloai-kinhdima.jsp\">Kinh dị - Ma</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Quốc gia\n");
      out.write("                        <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                        <li><a href=\"quocgia-my.jsp\">Mỹ</a></li>\n");
      out.write("                        <li><a href=\"quocgia-hanquoc.jsp\">Hàn quốc</a></li>\n");
      out.write("                        <li><a href=\"quocgia-trungquoc.jsp\">Trung Quốc</a></li>\n");
      out.write("                        <li><a href=\"quocgia-thailan.jsp\">Thái Lan</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\"><span class=\"glyphicon glyphicon-star\"></span> TOP PHIM</a></li> \n");
      out.write("            </ul>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("    <li>\n");
      out.write("        <form class=\"form-inline\" action=\"\" method=\"GET\" style=\"position: relative; margin-top:8px;\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"text\" id=\"timphim\" name=\"timphim\" class=\"form-control\" placeholder=\"Tìm phim...\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-search\"></span></button>\n");
      out.write("            <div class=\"list-group\" id=\"suggestbox\" style=\"position: absolute; z-index: 1;\"></div>\n");
      out.write("        </form>\n");
      out.write("    </li>\n");
      out.write("    <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Đăng ký</a></li>\n");
      out.write("    <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Đăng nhập</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-5\">\n");
      out.write("                    <div class=\"container-fluid\" style=\"background-color:lightgray; border-radius:5px;\">\n");
      out.write("                        <img class=\"img-responsive\" id=\"preview-img\" src=\"\"  style=\"margin-top:5px;\" alt=\"\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <a href=\"");

                                if (request.getParameter("id") != null) {
                                    if (request.getParameter("id") != "") {
                                        out.print("/web/xemphim.jsp?id=" + request.getParameter("id"));
                                    }
                                }

                               
      out.write("\"><button class=\"btn btn-danger btn-lg\">Xem phim</button></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-7\">\n");
      out.write("                    <div class=\"container-fluid\" style=\"font-size:25px; background-color:lightgray; border-radius:5px;\" id=\"movie-info\">\n");
      out.write("                        <p class=\"text-center\" style=\"font-size:35px;\"><span class=\"label label-info\">Thông tin phim</span></p>\n");
      out.write("                        <!--\n");
      out.write("                        <p>Tên phim: Liệt hỏa như ca Liehuo Ruge (2018)</p>\n");
      out.write("                        <p>Đạo diễn: Lý Vĩ Cơ</p>\n");
      out.write("                        <p>Diễn viên: ĐLNBa, Châu Du Dân</p>\n");
      out.write("                        <p>Thể loại: Phiêu lưu - hành động, Cổ trang - thần thoại</p>\n");
      out.write("                        <p>Quốc gia: Trung Quốc</p>\n");
      out.write("                        <p>Thời lượng: 120 phút</p>\n");
      out.write("                        <p>Lượt xem: 12000</p>\n");
      out.write("                        <p>Điểm bình luận: 120</p>\n");
      out.write("                        <p> Đánh giá: (8đ/100 lượt) <span class=\"glyphicon\" style=\"color:yellow;\">&#xe006;&#xe006;&#xe006;&#xe006;&#xe006;&#xe006;&#xe006;&#xe006;</span><span class=\"glyphicon\" style=\"color:yellow;\">&#xe007;&#xe007;</span></p>\n");
      out.write("                        -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"usr\" style=\"color:white;\">Email:</label>\n");
      out.write("                            <input type=\"email\" class=\"form-control\" id=\"mail\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\" style=\"font-size:20px;\">\n");
      out.write("                            <label style=\"color:white;\">Nội dung: </label>\n");
      out.write("                            <textarea class=\"form-control\" rows=\"5\" id=\"commentvalue\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"text-right\">\n");
      out.write("                            <button class=\"btn btn-default\" id=\"submitcomment\">Đăng bình luận</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12\" style=\"font-size:20px;\" id=\"comment\">\n");
      out.write("                    <p style=\"font-size:35px;\"><span class=\"label label-info\">Bình luận</span></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var movieId = '");
                    if (request.getParameter("id") != null) {
                        if (request.getParameter("id") != "") {
                            out.print(request.getParameter("id"));
                        }
                    }

            
      out.write("';\n");
      out.write("                if (movieId != '') {\n");
      out.write("                    $.get(\"http://localhost:3000/movie-info?id=\" + movieId, function (data, status) {\n");
      out.write("                        var resData = JSON.parse(data);\n");
      out.write("                        document.getElementById(\"preview-img\").src = resData.phim.hinhanh;\n");
      out.write("                        document.getElementsByTagName(\"title\")[0].innerHTML += resData.phim.tenphim;\n");
      out.write("                        var totalScore = 0;\n");
      out.write("                        for (var j = 0; j < resData.phim.danhgia.length; j++) {\n");
      out.write("                            totalScore += Number(resData.phim.danhgia[j].diem);\n");
      out.write("                        }\n");
      out.write("                        var ratedScore = Math.round(totalScore / resData.phim.danhgia.length);\n");
      out.write("                        var ratingHTML = '(' + ratedScore + 'đ/' + resData.phim.danhgia.length + ' lượt)';\n");
      out.write("                        var star = '';\n");
      out.write("                        var emptyStar = '';\n");
      out.write("                        for (var i = 0; i < 10; i++) {\n");
      out.write("                            if (i < ratedScore) {\n");
      out.write("                                star += '&#xe006;';\n");
      out.write("                            } else {\n");
      out.write("                                emptyStar += '&#xe007;';\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                        ratingHTML = '<p>' + ratingHTML + ' <span class=\"glyphicon\" style=\"color:yellow;\">' + star + '</span><span class=\"glyphicon\" style=\"color:yellow;\">' + emptyStar + '</span>' + '</p>';\n");
      out.write("                        var commentHTML = '';\n");
      out.write("                        for (var i = 0; i < resData.phim.binhluan.length; i++) {\n");
      out.write("                            commentHTML += '<div class=\"well well-sm\"><p>'\n");
      out.write("                                    + resData.phim.binhluan[i].email + ':'\n");
      out.write("                                    + resData.phim.binhluan[i].noidung + '</p><p class=\"text-right\">Đăng lúc '\n");
      out.write("                                    + resData.phim.binhluan[i].thoigian + '</p></div>';\n");
      out.write("                        }\n");
      out.write("                        document.getElementById(\"comment\").innerHTML += commentHTML;\n");
      out.write("                        var infoHTML = '<p>Tên phim: ' + resData.phim.tenphim + '</p><p>Đạo diễn: '\n");
      out.write("                                + resData.phim.daodien + '</p><p>Diễn viên: '\n");
      out.write("                                + resData.phim.dienvien + '</p><p>Thể loại: '\n");
      out.write("                                + resData.phim.theloai + '</p><p>Quốc gia: '\n");
      out.write("                                + resData.phim.quocgia + '</p><p>Thời lượng: '\n");
      out.write("                                + resData.phim.thoiluong + '</p><p>Lượt xem: '\n");
      out.write("                                + resData.phim.luotxem + '</p>' + ratingHTML;\n");
      out.write("                        document.getElementById(\"movie-info\").innerHTML += infoHTML;\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            $('#submitcomment').click(function (){\n");
      out.write("                var movieId = '");
                    if (request.getParameter("id") != null) {
                        if (request.getParameter("id") != "") {
                            out.print(request.getParameter("id"));
                        }
                    }

                
      out.write("';\n");
      out.write("                if(movieId !== ''){\n");
      out.write("                   var commentvalue = document.getElementById('commentvalue').value;\n");
      out.write("                   var email= document.getElementById('mail').value;\n");
      out.write("                   if(commentvalue !== '' && email !== ''){\n");
      out.write("                       $.get(\"http://localhost:3000/add-comment\",\n");
      out.write("                                {\n");
      out.write("                                    id: movieId,\n");
      out.write("                                    email: email,\n");
      out.write("                                    noidung: commentvalue\n");
      out.write("                                 },\n");
      out.write("                            function(data, status){\n");
      out.write("                                var resData = JSON.parse(data);\n");
      out.write("                                alert(resData.message);\n");
      out.write("                        });\n");
      out.write("                   }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
