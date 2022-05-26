package com.appdhome.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US10 {
    WebDriver driver;
    @Given("el cliente ingresa a la aplicacion")
    public void elClienteIngresaALaAplicacion() {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir + "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://appdhomet.netlify.app/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]")).click();

        driver.findElement(By.id("mat-input-0")).sendKeys("julissapontei");
        driver.findElement(By.id("mat-input-1")).sendKeys("julissapontei");

        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }

    @When("el cliente se encuentre en la seccion de su perfil")
    public void elClienteSeEncuentreEnLaSeccionDeSuPerfil() {
        driver.findElement(By.xpath("/html/body/app-root/app-home-customer/app-header/div/mat-toolbar/mat-toolbar-row/div[1]/a[3]")).click();
    }

    @Then("el cliente visualiza sus datos")
    public void elClienteVisualizaSusDatos() {
        driver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card")).isDisplayed();
    }

    @And("el cliente ha ingresado informacion erronea")
    public void elClienteHaIngresadoInformacionErronea() {
        System.out.print("data erronea");
    }

    @Then("el cliente visualiza datos incorrectos")
    public void elClienteVisualizaDatosIncorrectos() {
        driver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card")).isDisplayed();
    }

    @And("el cliente no cuenta con conexion a internet")
    public void elClienteNoCuentaConConexionAInternet() {
        System.out.print("sin conexion");
    }

    @Then("el cliente no visualiza sus datos")
    public void elClienteNoVisualizaSusDatos() {
        System.out.print("sin data");
    }
}
