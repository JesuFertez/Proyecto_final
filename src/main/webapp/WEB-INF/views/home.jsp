<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <!-- Cabecera -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    
    	<%@ include file='navbar.jsp'%>
    <head>
        <!-- Cofigicación de caracteres -->
        <meta charset="UTF-8">

        <!-- Configuración de ancho y escala inicial para los dispositivos -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Título de la página -->
        <title>Bienvenidos</title>

        <!-- Hojas de Estilo -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/estilo.css">
    </head>
    <!-- /Cabecera -->

    <!-- Cuerpo -->
    <body style = background-color:#74ADA2>
    <div class="Container-flex">
        <img class="container" src="res/img/scout.png"></div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" 
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" 
        crossorigin="anonymous"></script>
        
    </body>
    <!-- /Cuerpo -->
</html>
