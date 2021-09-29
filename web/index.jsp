<%-- 
    Document   : index
    Created on : 25/09/2021, 08:34:13 PM
    Author     : Ignacio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href ="css/login.css">
        <link rel="stylesheet" href ="css/cabecera.css">
    </head>
    <body>
        <form action="VerificarUsuario" method="post"> 
            <h1>Iniciar Sesion</h1>
            <p> Correo Electrónico <input type="text" placeholder="Ingresar correo" name="Usuario_usuario"></p>
            <p> Contraseña <input type="password" placeholder="Ingresar contraseña" name="Pass_usuario"></p>
            <input type="submit" value="Ingresar" >
            <input type="submit" value="Registrarse">
        
        </form>
    </body>
</html>

