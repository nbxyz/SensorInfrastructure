<%-- 
    Document   : login
    Created on : Mar 10, 2017, 10:12:26 PM
    Author     : Mustafa
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="javax.xml.ws.Service"%>
<%@page import="javax.xml.namespace.QName"%>
<%@page import="javax.xml.namespace.QName"%>
<%@page import="java.net.URL"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    /*
    // Create an ArrayList with test data
    ArrayList<String> databaseArrayList = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        databaseArrayList.add("" + i);
        System.out.println(databaseArrayList.get(i));
    }

    pageContext.setAttribute("authors", databaseArrayList);
   
    
                        <!--This is a comment. Comments are not displayed in the browser
                        <select name="sensorID" id="SensorID">
                            <option selected="selected"  value="Select ID">Select ID - Online</option>
                        <c:forEach var="databaseValue" items="${databaseList}" >
                            <option value="${databaseValue}">
                            ${databaseValue}
                        </option>
                        </c:forEach>
                    </select>
                        --> 
    
     */
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Request Data</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
        <script type="text/javascript">
        </script>
    </head>
    <body background="img/background.png">
        <ul class="nav">

            <div class="login">
                <a href="logout.jsp"> LOGOUT </a>
            </div>
            <li> <a href="index.html"> Home </a></li>
            <li> <a href="about.jsp"> About </a></li>
            <li> <a href="requestData.jsp"> Services </a></li>
        </ul>
        <script>
            function openCity(evt, cityName) {
                var i, tabcontent, tablinks;
                tabcontent = document.getElementsByClassName("tabcontent");
                for (i = 0; i < tabcontent.length; i++) {
                    tabcontent[i].style.display = "none";
                }
                tablinks = document.getElementsByClassName("tablinks");
                for (i = 0; i < tablinks.length; i++) {
                    tablinks[i].className = tablinks[i].className.replace(" active", "");
                }
                document.getElementById(cityName).style.display = "block";
                evt.currentTarget.className += " active";
            }

            // Get the element with id="defaultOpen" and click on it
            document.getElementById("defaultOpen").click();
        </script>
        <script type="text/javascript">
            $(document).ready(function () {
                $("select").change(function () {
                    $(this).find("option:selected").each(function () {
                        var optionValue = $(this).attr("value");
                        if (optionValue) {
                            $(".box").not("." + optionValue).hide();
                            $("." + optionValue).show();
                        } else {
                            $(".box").hide();
                        }
                    });
                }).change();
            });
        </script>

        <div class="heading">Services </div>
        <table align="center" border="0" width="3" cellspacing="4" cellpadding="6">
            <tbody class="table1">
            <div class="tab">
                <button class="tablinks" onclick="openCity(event, 'Sensor')" id="defaultOpen">Sensor</button>
                <button class="tablinks" onclick="openCity(event, 'Location')">Location</button>
                <button class="tablinks" onclick="openCity(event, 'Date')">Date</button>
                <button class="tablinks" onclick="openCity(event, 'Type')">Type</button>
            </div>
            <div id="Sensor" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright"></span>
                <div class="tab">
                    <button class="tablinks" onclick="openCity(event, 'SensorByID')" id="defaultOpen">Sensor ID</button>
                    <button class="tablinks" onclick="openCity(event, 'SensorByDate')">Date Interval</button>
                </div>
            </div>

            <div id="Location" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright">x</span>
                <div class="tab">

                    <button class="tablinks" onclick="openCity(event, 'LocationByID')" id="defaultOpen">Location ID</button>
                    <button class="tablinks" onclick="openCity(event, 'LocationByDate')">Date Interval</button>

                </div>
            </div>

            <div id="Date" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright">x</span>
                <div class="tab">
                    <button class="tablinks" onclick="openCity(event, 'DateByID')" id="defaultOpen">Date ID</button>
                    <button class="tablinks" onclick="openCity(event, 'DateByDate')">Date Interval</button>
                </div>
            </div>

            <div id="Type" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright">x</span>
                <div class="tab">
                    <button class="tablinks" onclick="openCity(event, 'TypeByID')" id="defaultOpen">Type ID</button>
                    <button class="tablinks" onclick="openCity(event, 'TypeByDate')">Date Interval</button>
                </div>
            </div>

            <div id="SensorByID" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright">x</span>
                <h3>Sensor By ID</h3>
                <div>
                    <form method="post" action="myServlet">
                        <select name="SensorByIDdatabase">
                            <option selected="selected" required>Choose Database</option>
                            <option value="offdata">Main</option>
                            <option value="expdata">Exp</option>
                        </select>
                        <br>
                        <br>

                        <input type="number" name="sensorID2" placeholder="Sensor ID" required>
                        <br>
                        <br>
                        <input type="submit" name="requestSensorByID" value="Send Request" />
                    </form>
                </div>

            </div>
            <div id="SensorByDate" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright"></span>
                <h3>Sensor By Interval</h3>
                <div>
                    <form method="post" action="myServlet">
                        <select name="SensorByDatedatabase">
                            <option selected="selected">Choose Database</option>
                            <option value="offdata">Main</option>
                            <option value="expdata">Exp</option>
                        </select>
                        <br>
                        <br>
                        <input type="number" name="SensorByDatesensorID2" placeholder="Sensor ID" required>

                        <br>
                        <br>
                        <input type="text" name="SensorByDateFrom" placeholder="YYYY-MM-DD">
                        <input type="text" name="SensorByDateTo" placeholder="YYYY-MM-DD">
                        <br><br><br>
                        <input type="submit" name="requestSensorByDate" value="Send Request " />
                    </form>
                </div>
                <br>

            </div>
            <div id="LocationByID" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright"></span>
                <h3>Location By ID</h3>
                <div>
                    <form method="Post" action="myServlet">
                        <select name="LocationByIDdatabase">
                            <option>Choose Database</option>
                            <option value="offdata">Main</option>
                            <option value="expdata">Exp</option>
                        </select>
                        <br>
                        <br>
                        <input type="text" name="LocationByIDLocationID" placeholder="Location">
                        <br>
                        <br>
                        <input type="submit" name="requestLocationByID" value="Send Request " />
                    </form>
                </div>
                <br>

            </div>

            <div id="LocationByDate" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright"></span>
                <h3>Location By Interval</h3>
                <div>
                    <form method="Post" action="myServlet">
                        <select name="LocationByDatedatabase">
                            <option>Choose Database</option>
                            <option value="offdata">Main</option>
                            <option value="expdata">Exp</option>
                        </select>
                        <br>
                        <br>
                        <input type="text" name="LocationByDateLocationID" placeholder="Location">
                        <br>
                        <br>
                        <input type="text" name="LocationByDateTo" placeholder="YYYY-MM-DD">
                        <input type="text" name="LocationByDateFrom" placeholder="YYYY-MM-DD">
                        <br><br><br>
                        <input type="submit" name="requestLocationByDate" value="Send Request " />
                    </form>
                </div>
                <br>

            </div>

            <div id="DateByID" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright"></span>
                <h3>Date By ID</h3>
                <div>
                    <form method="Post" action="myServlet">
                        <select name="DateByIDdatabase">
                            <option>Choose Database</option>
                            <option value="offdata">Main</option>
                            <option value="expdata">Exp</option>
                        </select>
                        <br>
                        <br>
                        <input type="text" name="DateByIDTo" placeholder="YYYY-MM-DD">
                        <br><br><br>
                        <input type="submit" name="requestDateByID" value="Send Request " />
                    </form>
                </div>
                <br>

            </div>

            <div id="DateByDate" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright"></span>
                <h3>Date By Interval</h3>
                <div>
                    <form method="Post" action="myServlet">
                        <select name="DateByDatedatabase">
                            <option>Choose Database</option>
                            <option value="offdata">Main</option>
                            <option value="expdata">Exp</option>
                        </select>
                        <br>
                        <br>
                        <input type="text" name="DateByDateFrom" placeholder="YYYY-MM-DD">
                        <input type="text" name="DateByDateTo" placeholder="YYYY-MM-DD">
                        <br><br><br>
                        <input type="submit" name="requestDateByDate" value="Send Request " />
                    </form>
                </div>
                <br>

            </div>

            <div id="TypeByID" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright"></span>
                <h3>Type By ID</h3>
                <div>
                    <form method="post" action="myServlet">
                        <select name="TypeByIDdatabase">
                            <option selected="selected">Choose Database</option>
                            <option value="offdata">Main</option>
                            <option value="expdata">Exp</option>
                        </select>
                        <br>
                        <br>
                        <input type="number" name="TypeByIDID" placeholder="Type ID" required>

                        <br><br><br>
                        <input type="submit" name="requestTypeByID" value="Send Request " />
                    </form>
                </div>
                <br>

            </div>

            <div id="TypeByDate" class="tabcontent">
                <span onclick="this.parentElement.style.display = 'none'" class="topright"></span>
                <h3>Type By interval</h3>
                <div>
                    <form method="post" action="myServlet">
                        <select name="TypeByDatedatabase">
                            <option selected="selected">Choose Database</option>
                            <option value="offdata">Main</option>
                            <option value="expdata">Exp</option>
                        </select>
                        <br>
                        <br>

                        <input type="number" name="TypeByDateID" placeholder="Type ID" required>

                        <br>
                        <br>
                        <input type="text" name="TypeByDateFrom" placeholder="YYYY-MM-DD">
                        <input type="text" name="TypeByDateTo" placeholder="YYYY-MM-DD">
                        <br><br><br>
                        <input type="submit" name="requestTypeByDate" value="Send Request " />
                    </form>
                </div>
                <br>

            </div>
        </tbody>
    </table>
</form>

</body>
</html>


