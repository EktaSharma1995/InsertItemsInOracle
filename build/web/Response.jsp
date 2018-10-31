<%-- 
    Document   : Response
    Created on : 31-Oct-2018, 11:13:37 AM
    Author     : ektasharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.item.ItemDetails"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<%@page import="com.database.Database_util"%>
<%

     Connection con = null;
     Statement state = null;
     ResultSet rs = null;

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table align="center" bgcolor="#E76060" border="1" width="70%" border-collapse: collapse>
           
            <tr>
                <th>Item Number</th>
                <th> Qunatity </th>                
                <th>Price Each</th>
                <th> First Name </th>
                <th> Last Name </th>
                <th> Middle initial</th>
                <th>Payment Type</th>
                <th>Shipping Address </th>                 
                <th> Credit Card Number </th>
                
            </tr>
           
             <%
            try
            {
                con = Database_util.getConnection();
                state = con.createStatement();
                String sql = "select * from items";
                rs = state.executeQuery(sql);
                
                
                while(rs.next())
                {
                    %>
                    
                    
                    <tr>
                        <td><%=rs.getString("itemnumber")%></td>
                        <td><%=rs.getInt("quantity")%></td>   
                        <td><%=rs.getDouble("priceEach")%></td>
                        <td><%=rs.getString("firstName")%></td>
                        <td><%=rs.getString("lastName")%></td>
                         <td> <%=rs.getString("middleInitial")%></td>
                         <td><%= rs.getString("shippingAddress")%></td>
                         <td><%=rs.getString("paymentMode")%></td>
                         <td><%=rs.getString("creditCardNumber")%></td>
               
                    </tr>
           
                    <%
                    
                }
                
            }
            catch(Exception e)
                    {
                        e.printStackTrace();
                    }
            %> 
        </table>

    </body>
</html>
