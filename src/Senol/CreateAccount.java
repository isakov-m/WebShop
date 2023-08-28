package Senol;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccount extends BaseDriver {

    @Test

    public void createAccount(){

        driver.get("https://demowebshop.tricentis.com/");
        WebElement register= driver.findElement(By.cssSelector("a[href='/register']"));
        register.click();

        SayfaAsagiKaydir();

        WebElement genger=driver.findElement(By.cssSelector("input[id='gender-male']"));
        genger.click();

        WebElement firstName= driver.findElement(By.cssSelector("input[id='FirstName']"));
        firstName.sendKeys("Senol");

        WebElement lastName= driver.findElement(By.cssSelector("input[id='LastName']"));
        lastName.sendKeys("Dogan");

        WebElement eMail=driver.findElement(By.cssSelector("input[id='Email']"));
        eMail.sendKeys("senoldogan2018@gmail.com");

        WebElement password= driver.findElement(By.cssSelector("input[id='Password']"));
        password.sendKeys("Senol1988++");

        WebElement Confirmpassword= driver.findElement(By.cssSelector("input[id='ConfirmPassword']"));
        Confirmpassword.sendKeys("Senol1988++");

        WebElement registerButton= driver.findElement(By.cssSelector("input[id='register-button']"));
        registerButton.click();





        BekleVeKapat();
    }
}
