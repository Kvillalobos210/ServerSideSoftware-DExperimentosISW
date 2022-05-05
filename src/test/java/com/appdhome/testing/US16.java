package com.appdhome.testing;

import com.appdhome.GenericWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class US16 {
    public static WebDriver webDriver;

    //Constructor
    public US16(){
        webDriver = GenericWebDriver.getWebDriver();
    }

    @Given("el trabajador visualiza un listado de clientes")
    public void elTrabajadorVisualizaUnListadoDeClientes() {
        webDriver.get("https://appdhomet.netlify.app/");
        webDriver.manage().window().maximize();
        WebElement webElement;
        webElement = webDriver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]"));
        webElement.click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("julissaponteT");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("julissaponteT");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
        webDriver.findElement(By.xpath("/html/body/app-root/app-home-employee/div/div[1]/mat-toolbar")).isDisplayed();
        webDriver.findElement(By.xpath("/html/body/app-root/app-home-employee/app-header/div/mat-toolbar/mat-toolbar-row/div[1]/a[2]")).click();
    }

    @When("indique observar a detalle a un cliente")
    public void indiqueObservarADetalleAUnCliente() {
        webDriver.findElement(By.xpath("/html/body/app-root/app-view-customers/div/div[2]/div[1]/mat-card/mat-card-actions/button")).click();
    }

    @Then("se visualizará el nombre y apellido del cliente")
    public void seVisualizaráElNombreYApellidoDelCliente() {
        webDriver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-modal-detail-customer/div/mat-card")).isDisplayed();
    }

    @Then("se visualizará el distrito donde vive el cliente")
    public void seVisualizaráElDistritoDondeViveElCliente() {
        webDriver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-modal-detail-customer/div/mat-card")).isDisplayed();
    }

    @Then("se visualizará el número telefónico del cliente")
    public void seVisualizaráElNúmeroTelefónicoDelCliente() {
        webDriver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-modal-detail-customer/div/mat-card")).isDisplayed();
    }
}
