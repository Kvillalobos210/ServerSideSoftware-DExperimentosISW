package com.appdhome.testing;

import com.appdhome.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US19 {
    public static WebDriver webDriver;

    //Constructor
    public US19(){
        webDriver = GenericWebDriver.getWebDriver();
    }

    @Given("el trabajador se encuentra en la sección principal")
    public void elTrabajadorSeEncuentraEnLaSecciónPrincipal() {
        webDriver.get("https://appdhomet.netlify.app/");
        webDriver.manage().window().maximize();
        WebElement webElement;
        webElement = webDriver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]"));
        webElement.click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("julissaponteT");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("julissaponteT");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-home-employee/div/div[1]/mat-toolbar")).isDisplayed();
    }

    @When("ingrese a la sección de su perfil")
    public void ingreseALaSecciónDeSuPerfil() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-home-employee/app-header/div/mat-toolbar/mat-toolbar-row/div[1]/a[3]")).click();
    }

    @Then("se visualizará su perfil completo")
    public void seVisualizaráSuPerfilCompleto() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card")).isDisplayed();
    }

    @Then("se visualizará su perfil con datos incorrectos")
    public void seVisualizaráSuPerfilConDatosIncorrectos() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card")).isDisplayed();
        webDriver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card/div[2]")).isDisplayed();
    }

    @Then("se visualizará su perfil con datos incompletos")
    public void seVisualizaráSuPerfilConDatosIncompletos() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card")).isDisplayed();
        webDriver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card/div[2]")).isDisplayed();
    }
}
