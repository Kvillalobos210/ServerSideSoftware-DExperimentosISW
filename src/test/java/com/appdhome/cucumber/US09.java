package com.appdhome.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US09 {
    WebDriver driver;
    @Given("el cliente navega por la aplicación")
    public void elClienteNavegaPorLaAplicacion() throws Throwable {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir + "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://appdhomet.netlify.app/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]")).click();
    }
    @When("el cliente se encuentre en la sección de inicio")
    public void elClienteSeEncuentraEnLaSeccionDeInicio() throws Throwable{

        driver.findElement(By.id("mat-input-0")).sendKeys("julissapontei");
        driver.findElement(By.id("mat-input-1")).sendKeys("julissapontei");
    }
    @Then("el cliente inicia sesión en su cuenta")
    public void elClienteIniciaSesionEnSuCuenta() throws Throwable{
        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-home-employee/app-header/div/mat-toolbar/mat-toolbar-row/div[1]/a[2]")).click();
    }



}
