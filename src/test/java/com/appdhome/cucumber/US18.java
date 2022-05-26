package com.appdhome.cucumber;

import com.appdhome.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US18 {
    WebDriver driver;

    @Given("el trabajador se encuentra en la sección de inicio")
    public void elTrabajadorSeEncuentraEnLaSecciónDeInicio() {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir + "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://appdhomet.netlify.app/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]")).click();
    }

    @When("complete su nombre de usuario y su contraseña")
    public void completeSuNombreDeUsuarioYSuContraseña() {
        driver.findElement(By.id("mat-input-0")).sendKeys("julissaponteT");
        driver.findElement(By.id("mat-input-1")).sendKeys("julissaponteT");

        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }

    @Then("se iniciará sesión en su cuenta")
    public void seIniciaráSesiónEnSuCuenta() {
        driver.findElement(By.xpath("/html/body/app-root/app-home-employee/div/div[1]/mat-toolbar")).isDisplayed();
    }

    @When("complete un nombre de usuario incorrecto y su contraseña")
    public void completeUnNombreDeUsuarioIncorrectoYSuContraseña() {
        driver.findElement(By.id("mat-input-0")).sendKeys("julissaponte");
        driver.findElement(By.id("mat-input-1")).sendKeys("julissaponteT");

        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }

    @Then("no se iniciará sesión en su cuenta")
    public void noSeIniciaráSesiónEnSuCuenta() {
        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/div[1]/mat-toolbar")).isDisplayed();
    }

    @When("complete su nombre de usuario y una contraseña incorrecta")
    public void completeSuNombreDeUsuarioYUnaContraseñaIncorrecta() {
        driver.findElement(By.id("mat-input-0")).sendKeys("julissaponteT");
        driver.findElement(By.id("mat-input-1")).sendKeys("julissaponte");

        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }
}