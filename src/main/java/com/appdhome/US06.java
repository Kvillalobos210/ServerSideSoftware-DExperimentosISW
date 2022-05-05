package com.appdhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//US06: Como cliente quiero visualizar las citas que he reservado
//      para tener un control de ellas.

public class US06 {
    public static void main(String[] args){
        String pathDriver = System.getProperty("user.dir") + "\\driver\\chromedriver_101.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);

        String urlPage = "https://appdhomet.netlify.app/";
        WebDriver webDriver = new ChromeDriver();
        webDriver.get(urlPage);

        WebElement webElement;

        webElement = webDriver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]"));
        webElement.click();

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[1]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("julissapontei");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/mat-form-field[2]")).click();
        webDriver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("julissapontei");

        webDriver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();
    }
}

