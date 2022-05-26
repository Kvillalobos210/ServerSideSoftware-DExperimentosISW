package com.appdhome.cucumber;

import com.appdhome.GenericWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US06 {

    public static WebDriver webDriver;

    //Constructor
    public US06(){
        webDriver = GenericWebDriver.getWebDriver();
    }

    @When("el cliente se encuentre en la sección de inicio")
    public void elClienteSeEncuentreEnLaSecciónDeInicio() {
        WebElement webElement1;
        webElement1 = webDriver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]"));
        webElement1.click();

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("julissapontei");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[2]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("julissapontei");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }

    @Then("el cliente visualiza sus citas")
    public void elClienteVisualizaSusCitas() {
        //throw new io.cucumber.java.PendingException();
    }

    @And("el cliente no tenga citas hechas")
    public void elClienteNoTengaCitasHechas() {
        //throw new io.cucumber.java.PendingException();
    }

    @Then("el cliente no visualiza sus citas")
    public void elClienteNoVisualizaSusCitas() {
        //throw new io.cucumber.java.PendingException();
    }
}
