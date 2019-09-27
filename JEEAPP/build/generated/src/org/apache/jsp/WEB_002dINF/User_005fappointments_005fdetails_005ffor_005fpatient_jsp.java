package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import Beans_DB_Package.DBConnection;
import java.sql.Connection;
import java.util.Date;
import Beans_DB_Package.LoginBean;

public final class User_005fappointments_005fdetails_005ffor_005fpatient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/logHeader.jsp");
    _jspx_dependants.add("/WEB-INF/logFooter.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"Bootbusiness | Short description about company\">\n");
      out.write("        <meta name=\"author\" content=\"Your name\">\n");
      out.write("        <title>E-Medihelp Medical Center</title>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap responsive -->\n");
      out.write("        <link href=\"css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Font awesome - iconic font with IE7 support --> \n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome-ie7.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootbusiness theme -->\n");
      out.write("        <link href=\"css/boot-business.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Include Header -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap responsive -->\n");
      out.write("        <link href=\"css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Font awesome - iconic font with IE7 support --> \n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome-ie7.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootbusiness theme -->\n");
      out.write("        <link href=\"css/boot-business.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Start: HEADER -->\n");
      out.write("        <header>\n");
      out.write("            <!-- Start: Navigation wrapper -->\n");
      out.write("            <div class=\"navbar navbar-fixed-top\">\n");
      out.write("                <div class=\"navbar-inner\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <a href=\"#\" class=\"brand brand-bootbus\"><img src=\"img/logo.png\" alt=\"logo\"></a>\n");
      out.write("                        <!-- Below button used for responsive navigation -->\n");
      out.write("                        <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <!-- Start: Primary navigation -->\n");
      out.write("                        <div class=\"nav-collapse collapse\">  \n");
      out.write("                            <ul class=\"nav pull-right\">\n");
      out.write("                                <li><a href=\"about_us.jsp\">About us</a></li>\n");
      out.write("                                <li><a href=\"faq.jsp\">FAQ</a></li>\n");
      out.write("                                <li><a href=\"contact_us.jsp\">Contact us</a></li>\n");
      out.write("                                <li>\n");
      out.write("                                    <form action=\"Log_Out\" method=\"post\" name=\"LogOut_Form\">\n");
      out.write("                                        <button type=\"Submit\" class=\"btn btn-small\">Sign out</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- End: Navigation wrapper -->   \n");
      out.write("        </header>\n");
      out.write("        <!-- End: HEADER -->\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/boot-business.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <!---->\n");
      out.write("         \n");
      out.write("        <!-- Start: MAIN CONTENT -->\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <!-- Start: Heading -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"page-header\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"pull-right\">\n");
      out.write("                        ");

                            LoginBean bean = (LoginBean) request.getAttribute("logBean");
                            int uID=bean.getUserID();
                            String fnme = bean.getFirstName();
                            String gender= bean.getGender();
                            String path;
                              if(null == application.getResource("/img/users/-'"+fnme+"'.png"))
                                  {
                                      if(gender.equals("Male"))
                                      {
                                         path = "img/users/defaultboy.png"; 
                                      }
                                      else
                                      {
                                          path = "img/users/defaultgirl.png";  
                                      }
                                      
                                  }     
                                    else
                                      
                                  { 
                                      path = "img/users/-'"+fnme+"'.png";
                                  }
                                 
                        
      out.write(" \n");
      out.write("                           \n");
      out.write("                        <table>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                 \n");
      out.write("                                <td rowspan=\"2\">\n");
      out.write("                                   <div class=\"span1 offset1\">\n");
      out.write("                                    <div>\n");
      out.write("                                         <img class=\"img-circle\" src=\"");
      out.print(path);
      out.write("\"/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                </td>\n");
      out.write("                               \n");
      out.write("                                <th>User :</th>\n");
      out.write("                                <td>\n");
      out.write("                                    ");

                                        
                                        out.print(fnme);
        
                                    
      out.write(" \n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Last visit :</th>\n");
      out.write("                                <td>");
      out.print( new Date(session.getLastAccessedTime()));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                             \n");
      out.write("                        </table>\n");
      out.write("                             \n");
      out.write("                    </div>\n");
      out.write("                            \n");
      out.write("                                <h1>User appointments details</h1>\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                                <br> \n");
      out.write("                </div>\n");
      out.write("                                   \n");
      out.write("            </div>\n");
      out.write("            <!-- End: Heading -->\n");
      out.write("            \n");
      out.write("            <!-- Start: CURRENT USER-->\n");
      out.write("            <div class = \"container\">\n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    <div class=\"span10 offset1\">\n");
      out.write("                        <div class=\"page-header \">\n");
      out.write("                            <h2>Current Appointments</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <div align =\"center\" >\n");
      out.write("                                            ");

                                                Object AppointmentSuccessAlert = request.getAttribute("Appointment_success");
                                                if (AppointmentSuccessAlert != null) {
                                                    out.print("<b ><h3>" + request.getAttribute("Appointment_success") + "</h3></b>");
                                                }
                                                Object AppointmentFailedAlert = request.getAttribute("Appointment_Fail");
                                                    if (AppointmentFailedAlert != null) {
                                                out.print("<b>" + request.getAttribute("Appointment_Fail") + "</b>");
                                                } 
                                            
      out.write("\n");
      out.write("                                        </div>    \n");
      out.write("                                        \n");
      out.write("                                           \n");
      out.write("                        <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"10\">\n");
      out.write("                            <tr bgcolor=\"#BDBDBD\">\n");
      out.write("                                <td align=\"center\"><b>Doctor</b></td>\n");
      out.write("                                <td align=\"center\"><b>Medical Center</b></td>\n");
      out.write("                                <td align=\"center\"><b>Address</b></td>\n");
      out.write("                                <td align=\"center\"><b>Email or Mobile</b></td>\n");
      out.write("                                <td align=\"center\"><b>Appointment Date</b></td>\n");
      out.write("                                <td align=\"center\"><b>Appointment Time</b></td>\n");
      out.write("                                <td align=\"center\"><b>Appointment Number</b></td>\n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                try {
                                    Connection connection = DBConnection.connection();
                                    Statement statement = connection.createStatement();
                                    String sql = "SELECT dr.first_name,dr.medical_center_name,dr.medical_center_address,dr.mobile_or_email,pa.appointment_date,pa.appointment_time,pa.appointment_number from patient_appointment AS pa INNER JOIN doctor_registered AS dr on pa.medical_center_id = dr.id where pa.patient_id = '"+uID+"'order by pa.id  desc ";

                                    ResultSet resultSet = statement.executeQuery(sql);
                                    while (resultSet.next()) {
                            
      out.write("\n");
      out.write("                            <tr bgcolor=\"#F2F2F2\">\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getString("first_name"));
      out.write("</td>\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getString("medical_center_name"));
      out.write("</td>\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getString("medical_center_address"));
      out.write("</td>\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getString("mobile_or_email"));
      out.write("</td>\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getDate("appointment_date"));
      out.write("</td>\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getTime("appointment_time"));
      out.write("</td>\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getInt("appointment_number"));
      out.write("</td>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                    }

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }                               
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--End: CURRENT USER-->\n");
      out.write("            <br\n");
      out.write("                <br\n");
      out.write("             <!-- Start: past appointments-->\n");
      out.write("            <div class = \"container\">\n");
      out.write("                <div class=\"row-fluid\">\n");
      out.write("                    <div class=\"span10 offset1\">\n");
      out.write("                        <div class=\"page-header \">\n");
      out.write("                            <h2>Past Disease/Treatment Details</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <table align=\"center\" cellpadding=\"5\" cellspacing=\"5\" border=\"10\">\n");
      out.write("                            <tr bgcolor=\"#BDBDBD\">\n");
      out.write("                                <td align=\"center\"><b>Medical Center</b></td>\n");
      out.write("                                 <td align=\"center\"><b>Date Treated</b></td>\n");
      out.write("                                 <td align=\"center\"><b>Disease Details</b></td>\n");
      out.write("                                 <td align=\"center\"><b>Treatments</b></td>\n");
      out.write("                                  <td align=\"center\"><b>Reports</b></td>\n");
      out.write("                                  \n");
      out.write("                                \n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                try {
                                    Connection connection = DBConnection.connection();
                                    Statement statement = connection.createStatement();
                                    String sql = "select id,medical_center,date,disease_details,treatments,filename,report_files from past_disease_details where patient_id='"+uID+"' order by date DESC";

                                    ResultSet resultSet = statement.executeQuery(sql);
                                    while (resultSet.next()) {
                            
      out.write("\n");
      out.write("                            <tr bgcolor=\"#F2F2F2\">\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getString("medical_center"));
      out.write("</td>\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getDate("date"));
      out.write("</td>\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getString("disease_details"));
      out.write("</td>\n");
      out.write("                                 <td align=\"center\">");
      out.print(resultSet.getString("treatments"));
      out.write("</td>\n");
      out.write("                                   <form   action=\"PDFReader\" method=\"get\" >\n");
      out.write("                                     <input type=\"hidden\" name=\"filename\"  value=\"");
      out.print(resultSet.getString("filename"));
      out.write("\">   \n");
      out.write("                                    <td align=\"center\"> <button type=\"Submit\" class=\"btn btn-link\" name=\"paaid\" value=");
      out.print(resultSet.getString("id"));
      out.write('>');
      out.write(' ');
      out.print(resultSet.getString("filename"));
      out.write("</button> </td> \n");
      out.write("                                                                                                                                                                                                     \n");
      out.write("                                 </form>\n");
      out.write("                                   \n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                    }

                                } catch (Exception e) {
                                    e.printStackTrace();
                                }                               
                            
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--End: CURRENT USER-->\n");
      out.write("             <tr>\n");
      out.write("                            <form action=\"patient_backto_Dashboard\" method=\"post\" name=\"profile_Form\">   \n");
      out.write("                                  <input type=\"hidden\" name=\"latis\" id=\"latis\" > \n");
      out.write("                                  <input type=\"hidden\" name=\"longts\" id=\"longts\" > \n");
      out.write("                              <button  type=\"Submit\" class=\"btn btn-large\" style=\"float:right; margin-right: 20px;margin-top: 10px;\" name=\"User_Profile\" value=\"");
      out.print(uID);
      out.write("\"> << Back to Dashboard</button>\n");
      out.write("                               </form> \n");
      out.write("                            </tr>\n");
      out.write("        </div>\n");
      out.write("        <!-- End: MAIN CONTENT -->\n");
      out.write("          <script type=\"text/javascript\" src=\"//maps.googleapis.com/maps/api/js?key=AIzaSyA0rFV9dmi2F1Zzs5w7CrJ_1MtC_Zp18o4\"></script>\n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("      \n");
      out.write("                              \n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                              \n");
      out.write("                            //var LATITUDE_ELEMENT_ID = \"medicalCenterLatitude\";\n");
      out.write("                            // var LONGITUDE_ELEMENT_ID = \"medicalCenterLongitude\";\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                           function initialize() {\n");
      out.write("                                                  \n");
      out.write("                               if (\"geolocation\" in navigator){\n");
      out.write("\t\t        navigator.geolocation.getCurrentPosition(function(position){ \n");
      out.write("\t\t\t currentLatitude = position.coords.latitude;\n");
      out.write("\t\t\t currentLongitude = position.coords.longitude;\n");
      out.write("                          document.getElementById(\"latis\").value=currentLatitude;\n");
      out.write("                          document.getElementById(\"longts\").value= currentLongitude;\n");
      out.write("                        \n");
      out.write("                         //document.getElementById(\"get_coordinates_Form\").submit();\n");
      out.write("                           });}                         \n");
      out.write("                        \n");
      out.write("}              \n");
      out.write(" \n");
      out.write("                           \n");
      out.write("                             google.maps.event.addDomListener(window, 'load', initialize);\n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("        </script>\n");
      out.write("        <!-- Include Footer -->\n");
      out.write("         \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap responsive -->\n");
      out.write("        <link href=\"css/bootstrap-responsive.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Font awesome - iconic font with IE7 support --> \n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome-ie7.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootbusiness theme -->\n");
      out.write("        <link href=\"css/boot-business.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Start: FOOTER -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"span2\">\n");
      out.write("                        <h4><i class=\"icon-beaker icon-white\"></i> About</h4>\n");
      out.write("                        <nav>\n");
      out.write("                            <ul class=\"quick-links\">\n");
      out.write("                                <li><a href=\"about_us.jsp\">Our works</a></li>\n");
      out.write("                                <li><a href=\"about_us.jsp\">Patnerships</a></li>\n");
      out.write("                                <li><a href=\"about_us.jsp\">Leadership</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>          \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span2\">\n");
      out.write("                        <h4><i class=\"icon-thumbs-up icon-white\"></i> Support</h4>\n");
      out.write("                        <nav>\n");
      out.write("                            <ul class=\"quick-links\">\n");
      out.write("                                <li><a href=\"faq.jsp\">FAQ</a></li>\n");
      out.write("                                <li><a href=\"contact_us.jsp\">Contact us</a></li>            \n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span2\">\n");
      out.write("                        <h4><i class=\"icon-legal icon-white\"></i> Legal</h4>\n");
      out.write("                        <nav>\n");
      out.write("                            <ul class=\"quick-links\">\n");
      out.write("                                <li><a href=\"#\">License</a></li>\n");
      out.write("                                <li><a href=\"#\">Terms of Use</a></li>\n");
      out.write("                                <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                                <li><a href=\"#\">Security</a></li>      \n");
      out.write("                            </ul>\n");
      out.write("                        </nav>            \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"span3\">\n");
      out.write("                        <h4>Get in touch</h4>\n");
      out.write("                        <div class=\"social-icons-row\">\n");
      out.write("                            <a href=\"https://twitter.com/login?lang=en\" target=\"blank\"><i class=\"icon-twitter\"></i></a>\n");
      out.write("                            <a href=\"https://www.facebook.com/\" target=\"blank\"><i class=\"icon-facebook\"></i></a>\n");
      out.write("                            <a href=\"https://lk.linkedin.com/\" target=\"blank\"><i class=\"icon-linkedin\"></i></a>                                         \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"social-icons-row\">\n");
      out.write("                            <i class=\"icon-phone icon-large phone-number\"></i> +778722297\n");
      out.write("                        </div>\n");
      out.write("                    </div>      \n");
      out.write("                    <div class=\"span3\">\n");
      out.write("                        <h4>Get updated by email</h4>\n");
      out.write("                        <form name=\"subscribeForm\" action=\"Subscribe\" method=\"Post\">\n");
      out.write("                            <input type=\"text\" name=\"email\" placeholder=\"Email address\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-primary\" value=\"Subscribe\" onclick=\"return ValidatelogSubscribe();\">\n");
      out.write("                        </form>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr class=\"footer-divider\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p>\n");
      out.write("                    &copy; 2018 ClamaXSoft, Inc. All Rights Reserved.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- End: FOOTER -->\n");
      out.write("        \n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("            function ValidatelogSubscribe() {\n");
      out.write("                var emailAddress = document.subscribeForm.email.value;\n");
      out.write("                filter = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("                \n");
      out.write("                if (filter.test(emailAddress)) {\n");
      out.write("                    alert(\"We will send our update and new features.\");                             \n");
      out.write("                    return true;\n");
      out.write("                }else{\n");
      out.write("                    alert(\"Invalied email address.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script> \n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/boot-business.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <!---->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/boot-business.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
