package Murat;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NegativeCreateAccount extends BaseDriver {
    @Test
    public  void NegativeTest(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();
        MyFunc.Bekle(2);
        WebElement gender=driver.findElement(By.cssSelector("[id='gender-male']"));
        gender.click();
        MyFunc.Bekle(2);
        WebElement ad=driver.findElement(By.id("FirstName"));
        ad.sendKeys("Murat");
        MyFunc.Bekle(2);
        WebElement soyad=driver.findElement(By.id("LastName"));
        soyad.sendKeys("Yagmur");
        MyFunc.Bekle(2);
        WebElement mail=driver.findElement(By.id("Email"));
        mail.sendKeys("senoldogan2018@gmail.com");
        MyFunc.Bekle(2);
        WebElement sifre=driver.findElement(By.id("Password"));
        sifre.sendKeys("Senol1988++");
        MyFunc.Bekle(2);
        WebElement sifreTekrar=driver.findElement(By.id("ConfirmPassword"));
        sifreTekrar.sendKeys("Senol1988++");
        MyFunc.Bekle(2);
        WebElement registerBtn=driver.findElement(By.id("register-button"));
        registerBtn.click();
        MyFunc.Bekle(2);
        WebElement msj=driver.findElement(By.xpath("//*[text()='The specified email already exists']"));

        Assert.assertTrue(msj.getText().contains("The specified email already exists"));

        //'The specified email already exists'



       // BekleVeKapat();





    }
}
