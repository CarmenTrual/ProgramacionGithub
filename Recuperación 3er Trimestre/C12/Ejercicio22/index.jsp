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
<h1 style="text-align: center;">Nuestro menú</h1>
<form action="pedido.jsp" method="post">
  <div style="display: flex; justify-content: center;">
    <h2>Comidas:</h2>
  </div>
  <div style="display: flex; justify-content: center;">
    <div>
      <img src="imagenes/quinoa.png" width="200px" alt="Quinoa con verduras"><br>
      <input type="number" name="comida0" value="0" min="0">
      Quinoa con verduras - 6.95 €
    </div>
    <div>
      <img src="imagenes/pizza.png" width="200px" alt="Pizza Caprese"><br>
      <input type="number" name="comida1" value="0" min="0">
      Pizza Caprese - 5.50 €
    </div>
    <div>
      <img src="imagenes/pasta.png" width="200px" alt="Pasta al pesto"><br>
      <input type="number" name="comida2" value="0" min="0">
      Pasta al pesto - 4.90 €
    </div>
    <div>
      <img src="imagenes/hamburguesa.png" width="200px" alt="Hamburguesa vegetariana"><br>
      <input type="number" name="comida3" value="0" min="0">
      Hamburguesa vegetariana - 6.20 €
    </div>
  </div>
  <div style="display: flex; justify-content: center;">
    <h2>Bebidas:</h2>
  </div>
  <div style="display: flex; justify-content: center;">
    <div>
      <img src="imagenes/agua.png" width="100px" alt="Agua"><br>
      <input type="number" name="comida4" value="0" min="0">
      Agua - 1.00 €
    </div>
    <div>
      <img src="imagenes/cerveza.png" width="100px" alt="Cerveza"><br>
      <input type="number" name="comida5" value="0" min="0">
      Cerveza - 1.50 €
    </div>
    <div>
      <img src="imagenes/refresco.png" width="100px" alt="Refresco"><br>
      <input type="number" name="comida6" value="0" min="0">
      Refresco - 1.40 €
    </div>
  </div>
  <br><br>
  <div style="display: flex; justify-content: center;">
    <button style="text-align: center" type="submit">Hacer pedido</button>
  </div>
</form>
</body>
</html>


