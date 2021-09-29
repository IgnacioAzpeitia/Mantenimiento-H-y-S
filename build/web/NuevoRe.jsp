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
                     <form action="Inventario" method="POST" autocomplete="off">
                         
                    <p> 
                           Numero de Control:
                           <input id="Numero_Control_Bienes" name="Numero_Control_Bienes" type="text"/>
                      </p>  
                      
                      <p> 
                           Descripcion del bien:
                           <input id="Descripcion_Bienes" name="Numero del Dispositivo" type="text"/>
                      </p>
                      
                      <p> 
                           Cantidad:
                           <input id="Cantidad_Bienes" name="Cantidad_Bienes" type="text"/>
                      </p>

                      <p> 
                           Modelo y Numero de Serie:
                           <input id="Modelo__Serie_Bienes" name="Modelo__Serie_Bienes" type="text"/>
                      </p>
                      
                      <p> 
                           Numero Aula o laboratorio:
                           <input id="TipoAL_Escuela" name="TipoAL_Escuela" type="text"/>
                      </p>
                      
                      <p> 
                           Fecha de Ingreso:
                           <input id="Fecha_Ingreso_Bienes" name="Fecha_Ingreso_Bienes" type="text"/>
                      </p>
                      
                      <p> 
                           Estado:
                           <input id="Estado_Bienes" name="Tipo de Bien" type="text"/>
                      </p>
                      
                      <p> 
                           Bienes no localizados Fisicamente:
                           <input id="Bienes_No_Localizados_Bienes" name="Bienes_No_Localizados_Bienes" type="text"/>
                      </p>
                      
                      <p> 
                           Observaciones:
                           <input id="Observaciones_Bienes" name="Observaciones_Bienes" type="text"/>
                      </p>
                      
                      
                      <button id="Guardar" name="Guardar" type="submit">Guardar</button>
                         
                     </form>


        
    </body>
</html>