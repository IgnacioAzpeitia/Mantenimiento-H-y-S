<%-- 
    Document   : Inventario
    Created on : 27/09/2021, 08:43:00 PM
    Author     : Ignacio
--%>
<%@page import="Conexion.Inventario"%>
<%@page import="Modelo.Bienes"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title> Inventario </title>
    <link rel="stylesheet" href ="css/EstiloBienesF.css">
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
        <div class ="containe">
            <br><br><br><br><br>
            </br>
                <div style="text-align: center;"><h2><p style="color:#1f1f7a" >Inventario</p></h2></div>
            </div>

    
        <a href="./NuevoRe.jsp" >Nuevo Registro </a>
        
                <br /><br />
                
        <table border="1" width="80%">
            
        
            <thead> 
                
                <tr>
                   
                    <th>Num Control</th>
                    <th>Nombre</th>
                    <th>Descripcion</th>
                    <th>Modelo</th>
                    <th>Num Serie</th>
                    <th>Cantidad</th>
                    <th>Aula/Laboratorio</th>
                    <th>Fecha de Ingreso</th>
                    <th>Estado</th>
                    <th>Observaciones</th>
                    
                </tr>
                  </thead>
              <tbody>
                <%
                List<Bienes> lista = Inventario.consultarbienes();
                for(Bienes a : lista){
                %>
                
                    <tr>
                    <td><%=a.getNumero_Control_Bienes()%></td>
                    <td><%=a.getNombre_Bienes()%></td>
                    <td><%=a.getDescripcion_Bienes()%></td>
                    <td><%=a.getModelo_Bienes()%></td>
                    <td><%=a.getNum_Serie_Bienes()%></td>
                    <td><%=a.getCantidad_Bienes()%></td>
                    <td><%=a.getTipo_Escuela()%></td>
                    <td><%=a.getFecha_Ingreso_Bienes()%></td>
                    <td><%=a.getEstado_Bienes()%></td>
                    <td><%=a.getObservaciones_Bienes()%></td>
                    
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
    </body> 

</html>
