<!--
    Una empresa que sirve comida vegetariana a domicilio necesita una aplicación
    para que los clientes puedan hacer sus pedidos por internet. La primera versión
    incluirá cuatro comidas y tres bebidas. A continuación se muestra una tabla con
    las diferentes opciones y precios.

    Un pedido puede contener varias comidas del mismo o de distinto
    tipo y también varias bebidas.

    @CarmenTrual
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menú</title>
</head>
<body>
<%
String[] comidas = {"Quinoa con verduras", "Pizza Caprese", "Pasta al pesto", "Hamburguesa vegetariana"};
double[] preciosComidas = {6.95, 5.50, 4.90, 6.20};
String[] bebidas = {"Agua", "Cerveza", "Refresco"};
double[] preciosBebidas = {1.00, 1.50, 1.40};
%>
<h1>Nuestro menú</h1>
<form action="pedido.jsp" method="post">
  <h2>Comidas:</h2>
  <%
  for (int i = 0; i < comidas.length; i++) {
  %>
  <div>
    <img src="imagenes/<%= i %>.png" alt="<%= comidas[i] %>">
    <input type="number" name="comida<%= i %>" value="0" min="0">
    <%= comidas[i] %> - <%= preciosComidas[i] %> €
  </div>
  <%
  }
  %>
  <h2>Bebidas:</h2>
  <%
  for (int i = 0; i < bebidas.length; i++) {
  %>
  <div>
    <img src="imagenes/<%= comidas.length + i %>.png" alt="<%= bebidas[i] %>">
    <input type="number" name="comida<%= comidas.length + i %>" value="0" min="0">
    <%= bebidas[i] %> - <%= preciosBebidas[i] %> €
  </div>
  <%
  }
  %>
  <br><br>
  <button type="submit">Hacer pedido</button>
</form>
</body>
</html>



