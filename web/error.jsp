<%-- 
    Document   : error
    Created on : 25/09/2021, 08:25:34 PM
    Author     : Ignacio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: sans-serif;
            
        }   
        
        body{
            background: #1a84d3;
            width:100%;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .container-404{
            text-align: center;
            width: 100%;
            max-width: 400px;
            background: #fff;
            padding: 20px;
            box-shadow: 0px 1px 10px
                rgba(0,0,0,0.3);
            border-radius: 5px;
            line-height: 1.7;
            
        }
        
        .boton{
            display: inline-block;
            margin-top: 15px;
            text-decoration: none;
            background: #1a84d3;
            color: #fff;
            padding: 10px 15px;
            border-radius: 5px;
         
           
        } 
        
       
        
    </style>
    
    </head>
    <body>       
        <div class="container-404">
         <h1>Eror 404</h1>
         <p>Esta pagina no se encuentra disponible
         en estos momentos . Disculpa la molestia</p>
         <a href="./InicioPa.jsp" class="boton">
             Pagina Principal
             </a>
        </div>
    </body>
