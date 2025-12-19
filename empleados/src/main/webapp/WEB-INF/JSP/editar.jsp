<%@ include file="comunes/cabecero.jsp" %>

<%@ include file="comunes/navegacion.jsp" %>

<div class="container">
	<div class="text-center" style="margin: 30px">
        <h3>Editar Empleado</h3>
	</div>
	<div>
	<form action="${pageContext.request.contextPath}/editar" method="post">
	<input type="hidden" name="idEmpleado" value="${empleadoForma.idEmpleado}" />
	
  <div class="mb-3">
    <label for="nombreEmpleado" class="form-label">Nombre</label>
    <input type="text" class="form-control" id="nombreEmpleado" name="nombreEmpleado" required="true" value="${empleadoForma.nombreEmpleado}">
  </div>
  <div class="mb-3">
    <label for="departamento" class="form-label">Departamento</label>
    <input type="text" class="form-control" id="departamento" name="departamento" required="true" value="${empleadoForma.departamento}">
  </div>
  <div class="mb-3">
    <label for="sueldo" class="form-label">sueldo</label>
    <input type="number" step="any" class="form-control" id="sueldo" name="sueldo" required="true" value="${empleadoForma.sueldo}">
  </div>
  <button type="submit" class="btn btn-warning btn-sm me-3">Editar</button>
  <a href="${pageContext.request.contextPath}/" class="btn btn-danger btn-sm">Cancelar</a>
</form>
	</div>
</div>
<%@ include file="comunes/pie-pagina.jsp" %>