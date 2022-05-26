package com.appdhome.cucumber;

import com.appdhome.GenericWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US01 {

    public static WebDriver webDriver;

    //Constructor
    public US01(){
        webDriver = GenericWebDriver.getWebDriver();
    }

    @Given("el cliente navega por la aplicación")
    public void elClienteNavegaPorLaAplicación() {
        webDriver.get("https://appdhomet.netlify.app/");
        webDriver.manage().window().maximize();
    }

    @When("el cliente busque la sección de trabajadores")
    public void elClienteBusqueLaSecciónDeTrabajadores() {
        WebElement webElement;
        webElement = webDriver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]"));
        webElement.click();

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("julissapontei");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[2]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("julissapontei");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }

    @Then("el cliente visualiza la lista de los trabajadores")
    public void elClienteVisualizaLaListaDeLosTrabajadores() {

    }

    @And("no exista ningún registro de trabajadores")
    public void noExistaNingúnRegistroDeTrabajadores() {
    }

    @Then("el cliente no visualiza ningún resultado de búsqueda")
    public void elClienteNoVisualizaNingúnResultadoDeBúsqueda() {
    }

    @And("el cliente no cuente con conexión a internet")
    public void elClienteNoCuenteConConexiónAInternet() {
    }

    @Then("el cliente no visualiza ningún dato")
    public void elClienteNoVisualizaNingúnDato() {
    }
}
