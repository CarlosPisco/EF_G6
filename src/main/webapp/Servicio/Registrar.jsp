<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 29/11/2022
  Time: 12:49 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registrar Servicio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>

<form action="<%=request.getContextPath()%>/ServicioServlet?accion=registrar" method="post"
      style="width:500px; margin-left:auto; margin-right:auto">

    <div class="mb-3">
        <label class="form-label">Tipo Usuario</label>

        <select class="form-select" aria-label="Default select example" name="tipoServicio">
            <option value="Impresion3D">Impresion 3D</option>
            <option value="CorteLaser">Corte Laser</option>
            <option value="EscaneoDigital">Escaneo Digital 3D</option>
        </select>

    </div>

    <button type="submit" class="btn btn-primary">Siguiente</button>




</form>




</body>
</html>
