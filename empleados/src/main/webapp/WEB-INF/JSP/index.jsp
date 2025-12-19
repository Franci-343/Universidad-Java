<%@ include file="comunes/cabecero.jsp" %>

<%@ include file="comunes/navegacion.jsp" %>
</div>
	<div class = "container">
		<div class = "text-center" style = "margin: 30px">
			<h3>Sistema Empleados</h3>
		</div>
		<div class = "container">
		<c:if test="${empty empleados}">
			<div class="alert alert-info text-center">No hay empleados registrados. <a href="${pageContext.request.contextPath}/agregar">Agregar el primero</a></div>
		</c:if>
		<table class="table table-striped table-hover table-bordered align-middle"> 
  <thead class="table-dark text-center">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nombre</th>
      <th scope="col">Departamento</th>
      <th scope="col">Sueldo</th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
   	<c:forEach var="empleado" items="${empleados}">
			<tr>
				<th scope="row">${empleado.idEmpleado}</th>
				<td>${empleado.nombreEmpleado}</td>
				<td>${empleado.departamento}</td>
				<td>
					<fmt:setLocale value="es_BO"/>
					<fmt:formatNumber value="${empleado.sueldo}" type="currency"/>
				</td>
				<td class="text-center">
				 	<c:set var="urlEditar">
				 		<c:url value="/editar">
				 		    <c:param name="idEmpleado" value="${empleado.idEmpleado}"/>
				 		</c:url>
				 	</c:set>
				 	<a href="${urlEditar}" class="btn btn-warning btn-sm me-3">Editar</a>
				 	
				 	<c:set var="urlEliminar">
				 		<c:url value="/eliminar">
				 		    <c:param name="idEmpleado" value="${empleado.idEmpleado}"/>
				 		</c:url>
				 	</c:set>
				 	<a href="${urlEliminar}" class="btn btn-danger btn-sm" onclick="return confirm('¿Está seguro de eliminar este empleado?');">Eliminar</a>
				</td>
			</tr>   
					
		</c:forEach>
    
  </tbody>
</table>
		</div>
	</div>
<%@ include file="comunes/pie-pagina.jsp" %>