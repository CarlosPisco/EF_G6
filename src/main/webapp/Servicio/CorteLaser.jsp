<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 29/11/2022
  Time: 01:27 p. m.
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

    <form action="<%=request.getContextPath()%>/CarteleraServlet?accion=CorteLaser" method="post"
          style="width:500px; margin-left:auto; margin-right:auto">

        <div class="mb-3">
            <label class="form-label">Grosor de linea</label>

            <select class="form-select" aria-label="Default select example" name="grosor">
                <option value="Fino">Fino</option>
                <option value="Grueso">Grueso</option>

            </select>

        </div>

        <div class="mb-3">
            <label class="form-label">Color de línea</label>

            <select class="form-select" aria-label="Default select example" name="color">
                <option value="rojo">rojo</option>
                <option value="negro">negro</option>

            </select>

        </div>

        <div class="mb-3">
            <label class="form-label">Material</label>

            <select class="form-select" aria-label="Default select example" name="material">
                <option value="acrilico">acrilico</option>
                <option value="mdf">mdf</option>
                <option value="carton">carton</option>

            </select>

        </div>



        <div class="mb-3">
            <label class="form-label">Dimensiones (alto en cm):</label>
            <input type="text" placeholder="alto" class="form-control" name="alto" required>
        </div>


        <div class="mb-3">
            <label class="form-label">Dimensiones (ancho en cm):</label>
            <input type="text" placeholder="ancho" class="form-control" name="ancho" required>
        </div>


        <div class="mb-3">
            <label class="form-label">URL de la imagen:</label>
            <input type="text" placeholder="urlImagen" class="form-control" name="urlImagen" required>
        </div>

        <%--        <input type="text" class="form-control" value="<%=e==null?"":e.getDepartment().getDepartmentId()%>">--%>


        <a class="btn btn-secondary" href="<%=request.getContextPath()%>/Servicio/Registrar.jsp">Atras</a>
        <button type="submit" class="btn btn-primary">Submit</button>

    </form>
</div>




</body>
</html>
