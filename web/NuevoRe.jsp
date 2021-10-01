<%-- 
    Document   : NuevoRe
    Created on : 25/09/2021, 08:23:58 PM
    Author     : Ignacio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <body>
        <h2>NUEVO REGISTRO</h2> 
                     <br />         <br /> 
                     <form action="NuevoBien" method="POST" autocomplete="off">
                         
                    <p> 
                           Numero de Control:
                           <input id="Numero_Control_Bienes" name="Numero_Control_Bienes" type="text"/>
                      </p>  
                      
                      <p> 
                           Nombre:
                           <input id="Nombre_Bienes" name="Nombre_Bienes" type="text"/>
                      </p>
                      
                      <p> 
                           Descripcion del Bien:
                           <input id="Descripcion_Bienes" name="Descripcion_Bienes" type="text"/>
                      </p>

                      <p> 
                           Modelo:
                           <input id="Modelo_Bienes" name="Modelo_Bienes" type="text"/>
                      </p>
                      
                      <p> 
                           Numero de Serie:
                           <input id="Num_Serie_Bienes" name="Num_Serie_Bienes" type="text"/>
                      </p>
                      
                      <p> 
                           Cantidad:
                           <input id="Cantidad_Bienes" name="Cantidad_Bienes" type="text"/>
                      </p>
                      
                      <p> 
                           Num Aula/Laboratorio:
                           <input id="Escuela_Id_Escuela" name="Escuela_Id_Escuela" type="text"/>
                      </p>
                      
                      <p> 
                           Fecha de Ingreso:
                           <input id="Fecha_Ingreso_Bienes" name="Fecha_Ingreso_Bienes" type="text"/>
                      </p>
                      
                      <p> 
                           Estado:
                           <input id="Estado_Bienes" name="Estado_Bienes" type="text"/>
                      </p>
                      
                      <p> 
                           Observaciones:
                           <input id="Observaciones_Bienes" name="Observaciones_Bienes" type="text"/>
                      </p>
                      
                      
                      
                      
                      <button id="Guardar" name="Guardar" type="submit">Guardar</button>
                         
                     </form>


        
    </body>
</html>