package com.appdhome.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US13 {
    WebDriver driver;
    @Given("el trabajador se encuentra en la sección de inicio")
    public void elTrabajadorSeEncuentraEnLaDeInicio()  {
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

    @When("indique observar a detalle una solicitud")
    public void indiqueObservarADetalleUnaSolicitud() {
        driver.findElement(By.xpath("/html/body/app-root/app-home-employee/div/div[2]/table/tbody/tr/td[6]/button/span/span")).click();
    }

    @Then("observará el método de pago de la cita")
    public void observaraElMetodoDePagoDeLaCita() {
        driver.findElement(By.xpath("/html/body/app-root/app-home-employee/div/div[2]/table/tbody/tr/td[6]/button")).click();
    }


}
