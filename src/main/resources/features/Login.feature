Feature: Login como usuario
  As: comprador de la tienda
  I want: autentificarme e ingresar a la pagina como usuario

  Scenario: Login

    Given Ya me registre en la pagina
    Given verifique estar registrado correctamente
    When aparece  para ingresar mis datos
    Then ingresare satisfactoriamente a mi cuenta