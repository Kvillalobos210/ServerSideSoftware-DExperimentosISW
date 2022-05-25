package com.appdhome.system.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US16 {
    WebDriver driver;

    @Given("el trabajador visualiza un listado de clientes")
    public void elTrabajadorVisualizaUnListadoDeClientes() throws Throwable {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://appdhomet.netlify.app/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]")).click();

        driver.findElement(By.id("mat-input-0")).sendKeys("julissaponteT");
        driver.findElement(By.id("mat-input-1")).sendKeys("julissaponteT");

        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();

        driver.findElement(By.xpath("/html/body/app-root/app-home-employee/app-header/div/mat-toolbar/mat-toolbar-row/div[1]/a[2]")).click();
    }

    @When("indique observar a detalle a un cliente")
    public void indiqueObservarADetalleAUnCliente() throws Throwable {
        driver.findElement(By.xpath("/html/body/app-root/app-view-customers/div/div[2]/div[1]/mat-card/mat-card-actions/button")).click();
    }

    @Then("se visualiza el nombre y apellido del cliente")
    public void seVisualizaElNombreYApellidoDelCliente() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-modal-detail-customer/div/mat-card")).isDisplayed();
    }

    @Then("se visualiza el distrito donde vive el cliente")
    public void seVisualizaElDistritoDondeViveElCliente() {
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-modal-detail-customer/div/mat-card")).isDisplayed();
    }

    @Then("se visualiza el celular del cliente")
    public void seVisualizaElCelularDelCliente() {
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-modal-detail-customer/div/mat-card")).isDisplayed();
    }
}
