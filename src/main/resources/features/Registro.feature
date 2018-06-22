Feature: Registro en la plataforma e ingreso de usuario

  As : comprador de la tienda
  I want: poder registrarme en la plataforma. y realizar compras atraves de internet

Scenario: Registro de usuario

  Given que ingrese a la pagina y quiero acceder al menu de usuarios
  When necesito registrarme
  When verificar que mis datos fueron almacenados correctamente
  Then aparecera para realizar mi login
