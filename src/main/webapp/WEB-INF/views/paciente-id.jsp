<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<meta charset="UTF-8">
<%@ include file='navbar.jsp'%>
<title>Paciente</title>

</head>
<body style = background-color:#74ADA2>
	<section>
		<div class="container">
			<h1>Detalle Paciente</h1>
			<table class="table table-striped table-bordered">
				<thead class="table-dark">
					<tr>
						<th>Id</th>
						<th>Nombre de Paciente</th>
						<th>Fecha Nacimiento</th>
						<th>Ver Historial</th>
					</tr>
				</thead>
				<tbody>
					<!-- Ciclo forEach con JSTL para imprimir datos de la lista -->
					<c:set var="paciente" value="${paciente}" />
					<tr>
						<td><c:out value="${paciente.id}"></c:out></td>
						<td><c:out value="${paciente.nombre}"></c:out></td>
						<td><c:out value="${paciente.fechaNacimiento}"></c:out></td>
						<!-- Enviar el ID del usuario al servlet EditarUsuario al hacer clic en el botÃ³n "Editar" -->
						<td>
							<form action="Historial" method="POST">
								<input type="hidden" name="id_paciente" value="${paciente.id}">
								<button type="submit" class="btn btn-outline-dark btn-sm">
									<i class="bi bi-pencil-square"></i>Historial
								</button>
							</form>
						</td>
					</tr>

				</tbody>
			</table>
		</div>
	</section>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>