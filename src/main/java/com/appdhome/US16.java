package com.appdhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US16 {
    public static void main(String[] args){

        String pathDriver = System.getProperty("user.dir") + "\\driver\\chromedriver_101.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);

        String urlPage = "https://appdhomet.netlify.app/";
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(urlPage);

        WebElement webElement;

        //Inicio de sesión del trabajador
        webElement = webDriver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]"));
        webElement.click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("julissaponteT");
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("julissaponteT");
        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();

        //Home del Trabajador
        webDriver.findElement(By.xpath("/html/body/app-root/app-home-employee/div/div[1]/mat-toolbar")).isDisplayed();

        //Clic en el boton "Customers"
        webDriver.findElement(By.xpath("/html/body/app-root/app-home-employee/app-header/div/mat-toolbar/mat-toolbar-row/div[1]/a[2]")).click();

        //Clic en el boton "Detalles" de un cliente
        webDriver.findElement(By.xpath("/html/body/app-root/app-view-customers/div/div[2]/div[1]/mat-card/mat-card-actions/button")).click();

        //Vizializacion de la informacion del cliente
        webDriver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-modal-detail-customer/div/mat-card")).isDisplayed();
    }
}
