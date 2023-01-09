
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Número</h1>
        <%
            int x = 0;
            for(int i=1; i<=10; i++){
                if(i%2==0)
                    x++;
        }
            %>
            <h2><%= x %></h2>
            <table border="1">
                <%for(int i=1; i<=15; i++){%>
                
                <tr>
                    <%for(int j=1; j<=3; j++){%>
                    <td><%=i %>, <%= j %></td>
                    <%}%>
                </tr>
                <%}%>
            </table>
            
    </body>
</html>

