<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Historial</title>
</head>
<body>
	<section>
		<div class="container">
			<h1>Historial de Pacientes</h1>
			<table class="table table-striped table-bordered">
				<thead class="table-dark">
					<tr>
						<th>ID Historial</th>
						<th>Paciente Id</th>
						<th>Doctor ID</th>
						<th>Fecha Cita</th>
						<th>Sintomas</th>
						<th>Diagnóstico</th>
						<th>Tratamiento</th>
					</tr>
				</thead>
				<tbody>
					<!-- Ciclo forEach con JSTL para imprimir datos de la lista -->
					<c:forEach var="historial" items="${historialPaciente}">
						<tr>
							<td><c:out value="${historial.id}"></c:out></td>
							<td><c:out value="${historial.paciente}"></c:out></td>
							<td><c:out value="${historial.doctor}"></c:out></td>
							<td><c:out value="${historial.fechaCita}"></c:out></td>
							<td><c:out value="${historial.sintomas}"></c:out></td>
							<td><c:out value="${historial.diagnostico}"></c:out></td>
							<td><c:out value="${historial.tratamiento}"></c:out></td>
						</tr>
					</c:forEach>
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