package com.appdhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US18 {
    public static void main(String[] args) throws InterruptedException {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://appdhomet.netlify.app/");
        driver.manage().window().maximize();

        //El usuario se encuentra en la página de inicio
        driver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]")).click();
        //El usuario completa su usuario y contraseña
        driver.findElement(By.id("mat-input-0")).sendKeys("julissaponteT");
        driver.findElement(By.id("mat-input-1")).sendKeys("julissaponteT");
        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();

        Thread.sleep(10000);
        driver.close();
    }
}