package com.appdhome;

//US05: Como cliente quiero contratar a un trabajador para arreglar
//      el desperfecto de mi hogar.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US05 {
    public static void main(String[] args) throws InterruptedException {
        String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://appdhomet.netlify.app/");
        driver.manage().window().maximize();

        //El cliente se encuentra en la página de inicio
        driver.findElement(By.xpath("/html/body/app-root/app-landing/html/body/nav/a[5]")).click();
        //El cliente completa su usuario y contraseña
        driver.findElement(By.id("mat-input-0")).sendKeys("julissapontei");
        driver.findElement(By.id("mat-input-1")).sendKeys("julissapontei");
        driver.findElement(By.xpath("/html/body/app-root/app-login/mat-card/form/button")).click();


        //El cliente se dirige a la lista de los trabajadores
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/app-home-customer/app-header/div/mat-toolbar/mat-toolbar-row/div[1]/a[2]")).click();

        //El cliente da click en el botón de contratar
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/app-view-employees/div/div[2]/div[1]/mat-card/mat-card-actions/button[2]")).click();

        //El cliente rellena todos los campos
        Thread.sleep(1000);
        driver.findElement(By.id("mat-input-3")).sendKeys("Avenida Brasil 751");

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/mat-dialog-container/app-modal-create-appointment/div/div/form/mat-form-field[2]/div/div[1]/div[2]/mat-datepicker-toggle/button")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/mat-datepicker-content/mat-calendar/div/mat-month-view/table/tbody/tr[4]/td[6]")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("mat-input-5")).sendKeys("Problemas con mi plancha");

        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/mat-dialog-container/app-modal-create-appointment/div/div/form/mat-form-field[4]/div/div[1]/div/mat-select")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("mat-option-1")).click();

        //El cliente le da click al botón de Crear
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/mat-dialog-container/app-modal-create-appointment/div/div/form/button")).click();

        Thread.sleep(10000);
        driver.close();

    }
}
