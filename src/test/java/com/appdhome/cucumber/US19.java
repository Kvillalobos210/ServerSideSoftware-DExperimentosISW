package com.appdhome.cucumber;

import com.appdhome.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US19 {
    WebDriver driver;

    @Given("el trabajador se encuentra en la sección principal")
    public void elTrabajadorSeEncuentraEnLaSecciónPrincipal() {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir + "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://appdhomet.netlify.app/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]")).click();

        driver.findElement(By.id("mat-input-0")).sendKeys("julissaponteT");
        driver.findElement(By.id("mat-input-1")).sendKeys("julissaponteT");

        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }

    @When("ingrese a la sección de su perfil")
    public void ingreseALaSecciónDeSuPerfil() {
        driver.findElement(By.xpath("/html/body/app-root/app-home-employee/app-header/div/mat-toolbar/mat-toolbar-row/div[1]/a[3]")).click();
    }

    @Then("se visualizará su perfil completo")
    public void seVisualizaráSuPerfilCompleto() {
        driver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card")).isDisplayed();
    }

    @Then("se visualizará su perfil con datos incorrectos")
    public void seVisualizaráSuPerfilConDatosIncorrectos() {
        driver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card")).isDisplayed();
    }

    @Then("se visualizará su perfil con datos incompletos")
    public void seVisualizaráSuPerfilConDatosIncompletos() {
        driver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card")).isDisplayed();
    }
}
