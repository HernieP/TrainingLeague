package co.com.cliente.proyecto.test.stepdefinition;

import co.com.cliente.proyecto.test.business.BusinessController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsTestingLeague {

    public BusinessController businessController = new BusinessController();


    //FEATURE REGISTRO-----------------------------------------------------------------------------------------------------------------------------------

    @Given("^que ingrese a la pagina y quiero acceder al menu de usuarios$")
    public void que_ingrese_a_la_pagina_y_quiero_acceder_al_menu_de_usuarios() throws Throwable {
        businessController.iniciarAplicacion(0, "http://demo.nopcommerce.com", "EjemploPrueba", "Funcionalidad_001");
    }

    @When("^necesito registrarme$")
    public void necesito_registrarme() throws Throwable {
        businessController.autenticacion("manuel.salas@sofka.com.co", "12345");
    }

    @And("^verificar que mis datos fueron almacenados correctamente$")
    public void verificar_que_mis_datos_fueron_almacenados_correctamente() throws Throwable {

    }


    @Then("^aparecera para realizar mi login$")
    public void aparecera_para_realizar_mi_login() throws Throwable {
    }

    //----------------------------------------------------------------------------------------------------------------------------------------------------

    //FEATURE LOGIN----------------------------------------------------------------------------------------------------------------------------------------

    @Given("^Ya me registre en la pagina$")
    public void ya_me_registre_en_la_pagina() throws Throwable {

    }

    @Given("^verifique estar registrado correctamente$")
    public void verifique_estar_registrado_correctamente() throws Throwable {

    }

    @When("^aparece  para ingresar mis datos$")
    public void aparece_para_ingresar_mis_datos() throws Throwable {

    }

    @Then("^ingresare satisfactoriamente a mi cuenta$")
    public void ingresare_satisfactoriamente_a_mi_cuenta() throws Throwable {

    }

    //-------------------------------------------------------------------------------------------------------------------------------------------------------

    //FEATURE SECCION COMPUS---------------------------------------------------------------------------------------------------------------------------------

    @Given("^Ya me encuentro logeado en la pagina como usuario$")
    public void ya_me_encuentro_logeado_en_la_pagina_como_usuario() throws Throwable {

    }

    @When("^ingreso a la seccion de computadores$")
    public void ingreso_a_la_seccion_de_computadores() throws Throwable {

    }

    @And("^Ingreso a sus categorias y pruebo las opciones que ofrece$")
    public void ingreso_a_sus_categorias_y_pruebo_las_opciones_que_ofrece() throws Throwable {

    }

    @Then("^Limpiare mi carrito de compras$")
    public void limpiare_mi_carrito_de_compras() throws Throwable {

    }

    @And("^Y mi lista de deseos para hacer log out$")
    public void y_mi_lista_de_deseos_para_hacer_log_out() throws Throwable {

    }
}
