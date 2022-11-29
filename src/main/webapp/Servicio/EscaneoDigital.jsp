<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 29/11/2022
  Time: 01:34 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Impresion 3D</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>

<div class="container">

  <form action="<%=request.getContextPath()%>/CarteleraServlet?accion=EscaneoDigital" method="post"
        style="width:500px; margin-left:auto; margin-right:auto">

    <div class="mb-3">
      <label class="form-label">Largo en cm:</label>
      <input type="text" placeholder="largo en cm" class="form-control" name="largo" required>
    </div>

    <div class="mb-3">
      <label class="form-label">Ancho en cm:</label>
      <input type="text" placeholder="ancho en cm" class="form-control" name="ancho" required>
    </div>

    <div class="mb-3">
      <label class="form-label">Altura en cm:</label>
      <input type="text" placeholder="altura en cm" class="form-control" name="altura" required>
    </div>



    <div class="mb-3">
      <label class="form-label">Resolucion</label>

      <select class="form-select" aria-label="Default select example" name="resolucion">
        <option value="Alta">Alta</option>
        <option value="Media">Media</option>
        <option value="Baja">Baja</option>

      </select>

    </div>


    <%--        <input type="text" class="form-control" value="<%=e==null?"":e.getDepartment().getDepartmentId()%>">--%>


    <a class="btn btn-secondary" href="<%=request.getContextPath()%>/Servicio/Registrar.jsp">Atras</a>
    <button type="submit" class="btn btn-primary">Submit</button>

  </form>
</div>


</body>
</html>
