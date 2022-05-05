package com.appdhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US19 {
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

        //Clic en el boton "Profile"
        webDriver.findElement(By.xpath("/html/body/app-root/app-home-employee/app-header/div/mat-toolbar/mat-toolbar-row/div[1]/a[3]")).click();

        //Visualizacion de la informacion del trabajador
        webDriver.findElement(By.xpath("/html/body/app-root/app-profile/div/div/mat-card")).isDisplayed();

    }
}
