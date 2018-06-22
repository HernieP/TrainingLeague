Feature: Seccion de computadores
  As: Comprador de la tienda
  I want: poder realizar la visualizacion de computadores que venden en un sitio web para no ir a la tienda.

 Scenario: Seccion de computadores

   Given Ya me encuentro logeado en la pagina como usuario
   When ingreso a la seccion de computadores
   When Ingreso a sus categorias y pruebo las opciones que ofrece
   Then Limpiare mi carrito de compras
   Then Y mi lista de deseos para hacer log out