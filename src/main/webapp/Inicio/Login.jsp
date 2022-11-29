<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 29/11/2022
  Time: 11:47 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <style>
        .gradient-custom {
            /* fallback for old browsers */
            background: #6a11cb;
            /* Chrome 10-25, Safari 5.1-6 */
            background: -webkit-linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));
            /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            background: linear-gradient(to right, rgba(106, 17, 203, 1), rgba(37, 117, 252, 1));
        }
        html,
        body {
            height: 100%;
        }
        body {
            display: flex;
            align-items: center;
            padding-top: 40px;
            padding-bottom: 40px;
        }
        .form-signin {
            max-width: 330px;
            padding: 15px;
        }
        .form-signin .form-floating:focus-within {
            z-index: 2;
        }
        .form-signin input[type="email"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }
        .form-signin input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }
    </style>
</head>
<body class="gradient-custom text-center">
<main class="form-signin w-100 m-auto">
    <form method="post" action="<%=request.getContextPath()%>/SessionServlet">
        <h1 class="h3 mb-3 fw-normal">Logueo</h1>

        <div class="form-floating" style="margin-bottom: 10px">
            <input type="text" class="form-control" id="floatingInput" name="usuario">
            <label for="floatingInput">Usuario</label>
        </div>
        <div class="form-floating" style="margin-top: 10px">
            <input type="password" class="form-control" id="floatingPassword" name="password">
            <label for="floatingPassword">Contraseña</label>
        </div>
        <%if(session.getAttribute("msg")!=null){%>
        <div id="validation" class="invalid-feedback" style="display: block; margin-bottom: 10px">
            <%=session.getAttribute("msg")%>
        </div>
        <% session.removeAttribute("msg"); %>
        <%}%>
        <button type="submit" class="w-100 btn btn-lg btn-primary" >Aceptar</button>
        <div class="col-sm-3">
            <p style="font-family: Arial; font-size: 13px; margin: 5px 0px 0px 0px">¿Aún no está registrado?</p>
        </div>
        <div class="col-sm-2">
            <a style="color: #3c6eb7; margin: 0px 0px 0px 0px; font-size: 13px; font-family: 'Arial';" href="<%=request.getContextPath()%>/SessionServlet?accion=registrar">Registrarse</a>
        </div>
    </form>
</main>
</body>
</html>