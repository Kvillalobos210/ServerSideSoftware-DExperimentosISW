package com.appdhome.testing;

import com.appdhome.GenericWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class US06 {

    public static WebDriver webDriver;

    //Constructor
    public US06(){
        webDriver = GenericWebDriver.getWebDriver();
    }

    @When("el cliente se encuentre en la sección de inicio")
    public void elClienteSeEncuentreEnLaSecciónDeInicio() {
    }

    @Then("el cliente visualiza sus citas")
    public void elClienteVisualizaSusCitas() {
    }

    @And("el cliente no tenga citas hechas")
    public void elClienteNoTengaCitasHechas() {
    }

    @Then("el cliente no visualiza sus citas")
    public void elClienteNoVisualizaSusCitas() {
    }
}
