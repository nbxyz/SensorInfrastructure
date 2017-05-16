package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import javax.xml.ws.Service;
import javax.xml.namespace.QName;
import javax.xml.namespace.QName;
import java.net.URL;

public final class requestData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    // Create an ArrayList with test data
    ArrayList<String> databaseArrayList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        databaseArrayList.add("" + i);
        System.out.println(databaseArrayList.get(i));
    }

    pageContext.setAttribute("authors", databaseArrayList);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Request Data</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"img/background.png\">\r\n");
      out.write("        <ul class=\"nav\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"login\">\r\n");
      out.write("                <a href=\"logout.jsp\"> LOGOUT </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <li> <a href=\"index.html\"> Home </a></li>\r\n");
      out.write("            <li> <a href=\"about.jsp\"> About </a></li>\r\n");
      out.write("            <li> <a href=\"requestData.jsp\"> Services </a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <script>\r\n");
      out.write("            function openCity(evt, cityName) {\r\n");
      out.write("                var i, tabcontent, tablinks;\r\n");
      out.write("                tabcontent = document.getElementsByClassName(\"tabcontent\");\r\n");
      out.write("                for (i = 0; i < tabcontent.length; i++) {\r\n");
      out.write("                    tabcontent[i].style.display = \"none\";\r\n");
      out.write("                }\r\n");
      out.write("                tablinks = document.getElementsByClassName(\"tablinks\");\r\n");
      out.write("                for (i = 0; i < tablinks.length; i++) {\r\n");
      out.write("                    tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\r\n");
      out.write("                }\r\n");
      out.write("                document.getElementById(cityName).style.display = \"block\";\r\n");
      out.write("                evt.currentTarget.className += \" active\";\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            // Get the element with id=\"defaultOpen\" and click on it\r\n");
      out.write("            document.getElementById(\"defaultOpen\").click();\r\n");
      out.write("        </script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $(\"select\").change(function () {\r\n");
      out.write("                    $(this).find(\"option:selected\").each(function () {\r\n");
      out.write("                        var optionValue = $(this).attr(\"value\");\r\n");
      out.write("                        if (optionValue) {\r\n");
      out.write("                            $(\".box\").not(\".\" + optionValue).hide();\r\n");
      out.write("                            $(\".\" + optionValue).show();\r\n");
      out.write("                        } else {\r\n");
      out.write("                            $(\".box\").hide();\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                }).change();\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"heading\">Services </div>\r\n");
      out.write("        <table align=\"center\" border=\"0\" width=\"3\" cellspacing=\"4\" cellpadding=\"6\">\r\n");
      out.write("            <tbody class=\"table1\">\r\n");
      out.write("            <div class=\"tab\">\r\n");
      out.write("                <button class=\"tablinks\" onclick=\"openCity(event, 'Sensor')\" id=\"defaultOpen\">Sensor</button>\r\n");
      out.write("                <button class=\"tablinks\" onclick=\"openCity(event, 'Location')\">Location</button>\r\n");
      out.write("                <button class=\"tablinks\" onclick=\"openCity(event, 'Date')\">Date</button>\r\n");
      out.write("                <button class=\"tablinks\" onclick=\"openCity(event, 'Type')\">Type</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"Sensor\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\"></span>\r\n");
      out.write("                <div class=\"tab\">\r\n");
      out.write("                    <button class=\"tablinks\" onclick=\"openCity(event, 'SensorByID')\" id=\"defaultOpen\">Sensor ID</button>\r\n");
      out.write("                    <button class=\"tablinks\" onclick=\"openCity(event, 'SensorByDate')\">Date Interval</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"Location\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\">x</span>\r\n");
      out.write("                <div class=\"tab\">\r\n");
      out.write("\r\n");
      out.write("                    <button class=\"tablinks\" onclick=\"openCity(event, 'LocationByID')\" id=\"defaultOpen\">Location ID</button>\r\n");
      out.write("                    <button class=\"tablinks\" onclick=\"openCity(event, 'LocationByDate')\">Date Interval</button>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"Date\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\">x</span>\r\n");
      out.write("                <div class=\"tab\">\r\n");
      out.write("                    <button class=\"tablinks\" onclick=\"openCity(event, 'DateByID')\" id=\"defaultOpen\">Date ID</button>\r\n");
      out.write("                    <button class=\"tablinks\" onclick=\"openCity(event, 'DateByDate')\">Date Interval</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"Type\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\">x</span>\r\n");
      out.write("                <div class=\"tab\">\r\n");
      out.write("                    <button class=\"tablinks\" onclick=\"openCity(event, 'TypeByID')\" id=\"defaultOpen\">Type ID</button>\r\n");
      out.write("                    <button class=\"tablinks\" onclick=\"openCity(event, 'TypeByDate')\">Date Interval</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"SensorByID\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\">x</span>\r\n");
      out.write("                <h3>Sensor By ID</h3>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form method=\"post\" action=\"myServlet\">\r\n");
      out.write("                        <select name=\"SensorByIDdatabase\">\r\n");
      out.write("                            <option selected=\"selected\" required>Choose Database</option>\r\n");
      out.write("                            <option value=\"offdata\">Main</option>\r\n");
      out.write("                            <option value=\"expdata\">Exp</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"number\" name=\"sensorID2\" placeholder=\"Sensor ID\" required>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <!--This is a comment. Comments are not displayed in the browser\r\n");
      out.write("                        <select name=\"sensorID\" id=\"SensorID\">\r\n");
      out.write("                            <option selected=\"selected\"  value=\"Select ID\">Select ID - Online</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                        -->\r\n");
      out.write("                        <input type=\"submit\" name=\"requestSensorByID\" value=\"Send Request\" />\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"SensorByDate\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\"></span>\r\n");
      out.write("                <h3>Sensor By Interval</h3>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form method=\"post\" action=\"myServlet\">\r\n");
      out.write("                        <select name=\"SensorByDatedatabase\">\r\n");
      out.write("                            <option selected=\"selected\">Choose Database</option>\r\n");
      out.write("                            <option value=\"offdata\">Main</option>\r\n");
      out.write("                            <option value=\"expdata\">Exp</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <input type=\"number\" name=\"SensorByDatesensorID2\" placeholder=\"Sensor ID\" required>\r\n");
      out.write("\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <input type=\"text\" name=\"SensorByDateFrom\" placeholder=\"YYYY-MM-DD\">\r\n");
      out.write("                        <input type=\"text\" name=\"SensorByDateTo\" placeholder=\"YYYY-MM-DD\">\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <input type=\"submit\" name=\"requestSensorByDate\" value=\"Send Request \" />\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"LocationByID\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\"></span>\r\n");
      out.write("                <h3>Location By ID</h3>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form method=\"Post\" action=\"myServlet\">\r\n");
      out.write("                        <select name=\"LocationByIDdatabase\">\r\n");
      out.write("                            <option>Choose Database</option>\r\n");
      out.write("                            <option value=\"offdata\">Main</option>\r\n");
      out.write("                            <option value=\"expdata\">Exp</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <select name=\"LocationByIDLocationID\">\r\n");
      out.write("                            <option value=\"Lyngby\">Lyngby</option>\r\n");
      out.write("                            <option value=\"Stue\">Stue</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <input type=\"submit\" name=\"requestLocationByID\" value=\"Send Request \" />\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"LocationByDate\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\"></span>\r\n");
      out.write("                <h3>Location By Interval</h3>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form method=\"Post\" action=\"myServlet\">\r\n");
      out.write("                        <select name=\"LocationByDatedatabase\">\r\n");
      out.write("                            <option>Choose Database</option>\r\n");
      out.write("                            <option value=\"offdata\">Main</option>\r\n");
      out.write("                            <option value=\"expdata\">Exp</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <select name=\"LocationByDateLocationID\">\r\n");
      out.write("                            <option value=\"Lyngby\">Lyngby</option>\r\n");
      out.write("                            <option value=\"Stue\">Stue</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <input type=\"text\" name=\"LocationByDateTo\" placeholder=\"YYYY-MM-DD\">\r\n");
      out.write("                        <input type=\"text\" name=\"LocationByDateFrom\" placeholder=\"YYYY-MM-DD\">\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <input type=\"submit\" name=\"requestLocationByDate\" value=\"Send Request \" />\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"DateByID\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\"></span>\r\n");
      out.write("                <h3>Date By ID</h3>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form method=\"Post\" action=\"myServlet\">\r\n");
      out.write("                        <select name=\"DateByIDdatabase\">\r\n");
      out.write("                            <option>Choose Database</option>\r\n");
      out.write("                            <option value=\"offdata\">Main</option>\r\n");
      out.write("                            <option value=\"expdata\">Exp</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <input type=\"text\" name=\"DateByIDTo\" placeholder=\"YYYY-MM-DD\">\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <input type=\"submit\" name=\"requestDateByID\" value=\"Send Request \" />\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"DateByDate\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\"></span>\r\n");
      out.write("                <h3>Date By Interval</h3>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form method=\"Post\" action=\"myServlet\">\r\n");
      out.write("                        <select name=\"DateByDatedatabase\">\r\n");
      out.write("                            <option>Choose Database</option>\r\n");
      out.write("                            <option value=\"offdata\">Main</option>\r\n");
      out.write("                            <option value=\"expdata\">Exp</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <input type=\"text\" name=\"DateByDateFrom\" placeholder=\"YYYY-MM-DD\">\r\n");
      out.write("                        <input type=\"text\" name=\"DateByDateTo\" placeholder=\"YYYY-MM-DD\">\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <input type=\"submit\" name=\"requestDateByDate\" value=\"Send Request \" />\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"TypeByID\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\"></span>\r\n");
      out.write("                <h3>Type By ID</h3>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form method=\"post\" action=\"myServlet\">\r\n");
      out.write("                        <select name=\"TypeByIDdatabase\">\r\n");
      out.write("                            <option selected=\"selected\">Choose Database</option>\r\n");
      out.write("                            <option value=\"offdata\">Main</option>\r\n");
      out.write("                            <option value=\"expdata\">Exp</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <input type=\"number\" name=\"TypeByIDID\" placeholder=\"Type ID\" required>\r\n");
      out.write("\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <input type=\"submit\" name=\"requestTypeByID\" value=\"Send Request \" />\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"TypeByDate\" class=\"tabcontent\">\r\n");
      out.write("                <span onclick=\"this.parentElement.style.display = 'none'\" class=\"topright\"></span>\r\n");
      out.write("                <h3>Type By interval</h3>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <form method=\"post\" action=\"myServlet\">\r\n");
      out.write("                        <select name=\"TypeByDatedatabase\">\r\n");
      out.write("                            <option selected=\"selected\">Choose Database</option>\r\n");
      out.write("                            <option value=\"offdata\">Main</option>\r\n");
      out.write("                            <option value=\"expdata\">Exp</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"number\" name=\"TypeByDateID\" placeholder=\"Type ID\" required>\r\n");
      out.write("\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <input type=\"text\" name=\"TypeByDateFrom\" placeholder=\"YYYY-MM-DD\">\r\n");
      out.write("                        <input type=\"text\" name=\"TypeByDateTo\" placeholder=\"YYYY-MM-DD\">\r\n");
      out.write("                        <br><br><br>\r\n");
      out.write("                        <input type=\"submit\" name=\"requestTypeByDate\" value=\"Send Request \" />\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("databaseValue");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${databaseList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${databaseValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${databaseValue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                        </option>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
