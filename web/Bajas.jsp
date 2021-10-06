<%-- 
    Document   : Bajas
    Created on : 27/09/2021, 08:42:29 PM
    Author     : Ignacio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title> Bajas </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href ="css/EstiloBienesF.css">
    </head>
    <body>
        <header class ="header">
            <div class ="container logo-nav-container">
                <a href="./InicioAdministrador.jsp" class ="logo">Mantenimiento H y S</a>
                <nav class ="menuSuperior">
                    <ul>
                        <li><a href="./Bajas.jsp">Historial de Bajas</a></li>
                        <li><a href="./Inventario.jsp">Inventario</a></li>
                        <li><a href="./Contraturno.jsp">Contraturno</a></li>
            </ul>
                </nav>
            </div>
        </header>
        <div class ="container">
            <br><br><br><br><br>
            </br>
                <div style="text-align: center;"><h2><p style ="color: #1f1f7a" >Historial De Bajas</p></h2></div>
            </div>

    
        <a href="./NuevoRe.jsp" >Nuevo Registro </a>
        
                <br /><br />
                
        <table border="1" width="80%">
        
            <thead> 
                <tr>
                    <th>N.P<th/>
                    <th>Descripcion Del Bien<th/>
                    <th>Fecha de Salida<th/>
                    <th>Observaciones<th/>
                    
                    
                    
                </tr>
                  </thead>
                  
        </table>
</html>
