<%-- 
    Document   : index
    Created on : 30/09/2021, 02:52:24 PM
    Author     : Ignacio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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

