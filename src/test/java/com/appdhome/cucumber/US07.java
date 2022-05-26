package com.appdhome.cucumber;

import com.appdhome.GenericWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US07 {

    public static WebDriver webDriver;

    //Constructor
    public US07(){
        webDriver = GenericWebDriver.getWebDriver();
    }

    @When("el cliente se encuentre en la sección de descripción de una cita")
    public void elClienteSeEncuentreEnLaSecciónDeDescripciónDeUnaCita() {
        WebElement webElement;
        webElement = webDriver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]"));
        webElement.click();

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("julissapontei");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[2]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("julissapontei");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }

    @Then("el cliente visualiza detalles de esa cita")
    public void elClienteVisualizaDetallesDeEsaCita() {
    }

    @And("el cliente no tenga una cita hecha")
    public void elClienteNoTengaUnaCitaHecha() {
    }

    @Then("el cliente no visualiza detalles de esa cita")
    public void elClienteNoVisualizaDetallesDeEsaCita() {
    }

    @Then("el cliente no detalles de su cita")
    public void elClienteNoDetallesDeSuCita() {
    }
}
