package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title> GALAXY MOVIES Trang chủ </title>\r\n");
      out.write("        <meta  http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col\" style=\"position:relative;\">\r\n");
      out.write("                    <a href=\"\" style=\"position:absolute; z-index:1; top:0px; left:0px;\"><img class=\"img-responsive\" src=\"src/img/galaxylogo.png\"></img></a>\r\n");
      out.write("                    <div id=\"hangCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                        <!-- Indicators -->\r\n");
      out.write("                        <ol class=\"carousel-indicators\" id='imgslidesize'>\r\n");
      out.write("                            <li data-target=\"#hangCarousel\" data-slide-to=\"0\" class=\"active\" ></li>\r\n");
      out.write("                            <li data-target=\"#hangCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("                            <li data-target=\"#hangCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("                            <li data-target=\"#hangCarousel\" data-slide-to=\"3\"></li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Wrapper for slides -->\r\n");
      out.write("                        <div class=\"carousel-inner\" role=\"listbox\" id='imgslide'>\r\n");
      out.write("                            <!--\r\n");
      out.write("                            <div class=\"item active\">\r\n");
      out.write("                                <img class=\"img-responsive center-block\" src=\"src/img/testimg.jpg\" alt=\"avenger\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            -->\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Left and right controls -->\r\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#hangCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Trước</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a class=\"right carousel-control\" href=\"#hangCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                            <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("                            <span class=\"sr-only\">Tiếp</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <p style=\"font-size:25px; color:white;\"><span class=\"glyphicon glyphicon-menu-hamburger\"></span>Phim lẻ\r\n");
      out.write("                        <span style=\"font-size:25px; float:right;\">Xem tất cả</span>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\" id=\"movielist\">\r\n");
      out.write("                <!--\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"container-fluid grayhover\">\r\n");
      out.write("                        <a href=\"#\"><img class=\"img-responsive\" src=\"src/img/liehuoruge.jpg\"  style=\"margin-top:5px;\" alt=\"liehouruge\"></a>\r\n");
      out.write("                        <p>Liệt hỏa như ca - Liehuo Ruge(2018)</p>\r\n");
      out.write("                        <p>Đánh giá:(8/10<span class=\"glyphicon glyphicon-star\"></span>) 100 lượt</p>\r\n");
      out.write("                        <p><span class=\"glyphicon glyphicon-eye-open\" style=\"color:red\"></span>12000  <span class=\"glyphicon glyphicon-comment\" style=\"color:red\"></span> 200</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("               -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                var preparedImgSlideHtml = '';\r\n");
      out.write("                var preparedImgSlideSizeHtml = '';\r\n");
      out.write("                $.get(\"http://localhost:3000/movie-list\", function (data, status) {\r\n");
      out.write("                    var resData = JSON.parse(data);\r\n");
      out.write("                    for(var i = 0; i < resData.length; i++){\r\n");
      out.write("                        var totalScore = 0;\r\n");
      out.write("                        for(var j = 0; j < resData[i].phim.danhgia.length; j++){\r\n");
      out.write("                            totalScore += Number(resData[i].phim.danhgia[j].diem);\r\n");
      out.write("                        }\r\n");
      out.write("                        var ratedScore = Math.round(totalScore/resData[i].phim.danhgia.length);\r\n");
      out.write("                        var preparedHtml = '<div class=\"col-md-3\"><div class=\"container-fluid grayhover\"><a href=\"/web/thongtin.jsp?id='+ resData[i]._id +'\"><img class=\"img-responsive\" src=\"' + resData[i].phim.hinhanh + '\"  style=\"margin-top:5px;\" alt=\" + resData[i].phim.tenphim + \"></a><p>'\r\n");
      out.write("                                + resData[i].phim.tenphim + '</p><p>Đánh giá:('\r\n");
      out.write("                                + ratedScore + '/10<span class=\"glyphicon glyphicon-star\"></span>) '\r\n");
      out.write("                                + resData[i].phim.danhgia.length + ' lượt</p><p><span class=\"glyphicon glyphicon-eye-open\" style=\"color:red\"></span>'\r\n");
      out.write("                                + resData[i].phim.luotxem + '  <span class=\"glyphicon glyphicon-comment\" style=\"color:red\"></span> '\r\n");
      out.write("                                + resData[i].phim.binhluan.length + '</p></div></div>';\r\n");
      out.write("                        document.getElementById('movielist').innerHTML += preparedHtml;\r\n");
      out.write("                        if(i === 0){\r\n");
      out.write("                            preparedImgSlideSizeHtml += '<li data-target=\"#hangCarousel\" data-slide-to=\"' + i + '\" class=\"active\"></li>';\r\n");
      out.write("                            //poster\r\n");
      out.write("                            preparedImgSlideHtml += '<div class=\"item active\"><img class=\"img-responsive center-block\" src=\"'\r\n");
      out.write("                                + resData[i].phim.poster + '\" alt=\"' + resData[i].phim.tenphim + '\"></div>';\r\n");
      out.write("                        }\r\n");
      out.write("                        else{\r\n");
      out.write("                            preparedImgSlideSizeHtml += '<li data-target=\"#hangCarousel\" data-slide-to=\"' + i + '\"></li>';\r\n");
      out.write("                            //poster\r\n");
      out.write("                            preparedImgSlideHtml += '<div class=\"item\"><img class=\"img-responsive center-block\" src=\"'\r\n");
      out.write("                                + resData[i].phim.poster + '\" alt=\"' + resData[i].phim.tenphim + '\"></div>';\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    document.getElementById('imgslidesize').innerHTML = preparedImgSlideSizeHtml;\r\n");
      out.write("                    document.getElementById('imgslide').innerHTML = preparedImgSlideHtml;\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
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
