<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 29/11/2022
  Time: 11:57 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>

<body>
<div class="container">
  <h1>Registrar nuevo Usuario
  </h1>
  <form action="<%=request.getContextPath()%>/CarteleraServlet?registrar" method="post"
        style="width:500px; margin-left:auto; margin-right:auto">

    <div class="mb-3">
      <label class="form-label">Nombre:</label>
      <input type="text" placeholder="Nombre" class="form-control" name="nombre" required>
    </div>

    <div class="mb-3">
      <label class="form-label">Apellido:</label>
      <input type="text" placeholder="Apellido" class="form-control" name="apellido" required>
    </div>

    <div class="mb-3">
      <label class="form-label">Correo:</label>
      <input type="text" placeholder="Correo" class="form-control" name="correo" required>
    </div>


    <div class="mb-3">
      <label class="form-label">Contraseña:</label>
      <input type="password" class="form-control" placeholder="Contraseña " id="password" required>

    </div>


    <div class="mb-3">
      <label class="form-label">Contraseña:</label>
      <input type="password" class="form-control" placeholder="Confirmar Contraseña" id="confirm_password" required>

    </div>










    <div class="mb-3">
      <label class="form-label">Tipo Usuario</label>

      <select class="form-select" aria-label="Default select example" name="tipoUsuario">
        <option value="externo">externo</option>
        <option value="interno">interno</option>
      </select>

    </div>


    <%--        <input type="text" class="form-control" value="<%=e==null?"":e.getDepartment().getDepartmentId()%>">--%>


    <a class="btn btn-secondary" href="<%=request.getContextPath()%>/SessionServlet?registrar">Atras</a>
    <button type="submit" class="btn btn-primary">Submit</button>

  </form>
</div>


<script src="../Scripts.js" type="text/javascript"></script>

</body>
</html>
