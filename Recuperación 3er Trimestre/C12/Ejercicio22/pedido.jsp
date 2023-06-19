<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pedido</title>
</head>
<body>
<%
int[] cantidades = new int[7];
double[] precios = {6.20, 5.50, 4.90, 6.95, 1.00, 1.50, 1.40};
String[] descripciones = {"Hamburguesa vegetariana", "Pasta al pesto", "Pizza caprese", "Quinoa con verdura", "Agua", "Cerveza", "Refresco"};

for (int i = 0; i < 7; i++) {
    cantidades[i] = Integer.parseInt(request.getParameter("comida" + i));
}
%>
<div style="text-align: center; margin: 0 auto; padding: 10px">
    <h1>Detalles del pedido</h1>
    <hr>
    <div class="row">
        <div class="col">Comida/bebida</div>
        <div class="col">PVP</div>
        <div class="col">Cantidad</div>
        <div class="col">Subtotal</div>
    </div>
    <%
    double total = 0;
    for (int i = 0; i < 7; i++) {
        if (cantidades[i] > 0) {
            double subtotal = cantidades[i] * precios[i];
            total += subtotal;
    %>
    <div class="row">
        <div class="col"><%= descripciones[i] %></div>
        <div class="col"><%= precios[i] %></div>
        <div class="col"><%= cantidades[i] %></div>
        <div class="col"><%= subtotal %></div>
    </div>
    <%
        } // if
    } // for
    %>
    <div class="row">
        <div class="col">
            <b>Total: <%= String.format("%.2f", total) %> €</b>
        </div>
        <div class="col"></div>
        <div class="col"></div>
        <div class="col"></div>
    </div>
</div>
</body>
</html>
