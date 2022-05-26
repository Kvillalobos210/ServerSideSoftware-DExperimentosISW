package com.appdhome.cucumber;

import com.appdhome.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US12 {

    public static WebDriver webDriver;

    //Constructor
    public US12(){
        webDriver = GenericWebDriver.getWebDriver();
    }

    @Given("el trabajador inició sesión en la aplicación")
    public void elTrabajadorInicióSesiónEnLaAplicación() {
        webDriver.get("https://appdhomet.netlify.app/");
        webDriver.manage().window().maximize();
    }

    @When("se encuentre en la sección principal")
    public void seEncuentreEnLaSecciónPrincipal() {
        WebElement webElement12;
        webElement12 = webDriver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]"));
        webElement12.click();

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("julissapontet");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[2]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("julissapontet");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }

    @Then("visualizará un listado de solicitudes de trabajo")
    public void visualizaráUnListadoDeSolicitudesDeTrabajo() {
    }

    @Then("no visualizará solicitudes de trabajo")
    public void noVisualizaráSolicitudesDeTrabajo() {
    }

    @When("actualice la aplicación")
    public void actualiceLaAplicación() {
    }

    @Then("visualizará nuevas solicitudes de trabajo")
    public void visualizaráNuevasSolicitudesDeTrabajo() {
    }
}
