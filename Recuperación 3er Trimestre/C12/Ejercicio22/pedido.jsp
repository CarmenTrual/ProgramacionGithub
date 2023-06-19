<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
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
    <div>
        <div>Comida/bebida</div>
        <div>PVP</div>
        <div>Cantidad</div>
        <div>Subtotal</div>
    </div>
    <%
    double total = 0;
    for (int i = 0; i < 7; i++) {
        if (cantidades[i] > 0) {
            double subtotal = cantidades[i] * precios[i];
            total += subtotal;
    %>
    <div>
        <div><%= descripciones[i] %></div>
        <div><%= precios[i] %></div>
        <div><%= cantidades[i] %></div>
        <div><%= subtotal %></div>
    </div>
    <%
        } // if
    } // for
    %>
    <div>
        <div>
            <b>Total: <%= String.format("%.2f", total) %> €</b>
        </div>
        <div></div>
        <div></div>
        <div></div>
    </div>
</div>
</body>
</html>
