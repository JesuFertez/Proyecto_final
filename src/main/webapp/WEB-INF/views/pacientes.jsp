<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<head>
<meta charset="UTF-8">
<%@ include file='navbar.jsp'%>

<title>Pacientes</title>
</head>
<body>
	<section>
		<div class="container" style="text-align: center">
			<h1>Listado de Pacientes</h1>
			<table class="table table-striped table-bordered">
				<thead class="table-dark">
					<tr>
						<th>Id</th>
						<th>Nombre de Paciente</th>
						<th>Fecha Nacimiento</th>
						<th>Editar Paciente</th>
						<th>Historial Paciente</th>

					</tr>
				</thead>
				<tbody>
					<!-- Ciclo forEach con JSTL para imprimir datos de la lista -->
					<c:forEach var="pac" items="${listaPacientes}">
						<tr>
							<td><c:out value="${pac.id}"></c:out></td>
							<td><c:out value="${pac.nombre}"></c:out></td>
							<td><c:out value="${pac.fechaNacimiento}"></c:out></td>
							<td>
								<form action="Editar" method="POST">
									<input type="hidden" name="id_paciente" value="${pac.id}">
									<button type="submit" class="btn btn-outline-dark btn-sm">
										<i class="bi bi-pencil-square"></i>Editar
									</button>
								</form>
							</td>
							<td>
								<form action="Historial" method="POST">
									<input type="hidden" name="id_paciente" value="${pac.id}">
									<button type="submit" class="btn btn-outline-dark btn-sm">
										<i class="bi bi-pencil-square"></i>Historial
									</button>
								</form>
							</td>
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