<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 29/11/2022
  Time: 12:51 p. m.
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

    <form action="<%=request.getContextPath()%>/CarteleraServlet?accion=Impresion3D" method="post"
          style="width:500px; margin-left:auto; margin-right:auto">

        <div class="mb-3">
            <label class="form-label">Densidad</label>

            <select class="form-select" aria-label="Default select example" name="densidad">
                <option value="10">10</option>
                <option value="15">15</option>
                <option value="20">20</option>
                <option value="30">30</option>
                <option value="50">50</option>
                <option value="90">90</option>
            </select>

        </div>

        <div class="mb-3">
            <label class="form-label">Grosor</label>

            <select class="form-select" aria-label="Default select example" name="grosor">
                <option value="fino">fino</option>
                <option value="normal">normal</option>
                <option value="grueso">grueso</option>
            </select>

        </div>

        <div class="mb-3">
            <label class="form-label">Altura de la Capa</label>

            <select class="form-select" aria-label="Default select example" name="alturaCapa">
                <option value="0.1">0.1</option>
                <option value="0.2">0.2</option>
                <option value="0.3">0.3</option>
                <option value="0.4">0.4</option>
            </select>

        </div>


        <div class="mb-3">
            <label class="form-label">Material</label>

            <select class="form-select" aria-label="Default select example" name="Material">
                <option value="abs">abs</option>
                <option value="pla">pla</option>
                <option value="flexible">flexible</option>
            </select>

        </div>


        <div class="mb-3">
            <label class="form-label">URL de la imagen:</label>
            <input type="text" placeholder="Nombre" class="form-control" name="urlImagen" required>
        </div>



        <div class="mb-3">
            <label class="form-label">Autoservicio</label>

            <select class="form-select" aria-label="Default select example" name="tipoUsuario">
                <option value="si">si</option>
                <option value="no">no</option>
            </select>

        </div>



        <%--        <input type="text" class="form-control" value="<%=e==null?"":e.getDepartment().getDepartmentId()%>">--%>


        <a class="btn btn-secondary" href="<%=request.getContextPath()%>/Servicio/Registrar.jsp">Atras</a>
        <button type="submit" class="btn btn-primary">Submit</button>

    </form>
</div>





</body>
</html>
