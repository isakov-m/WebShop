package Senol;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateAccount extends BaseDriver {

    By rgs = By.cssSelector("a[href='/register']");
    By gnd = By.cssSelector("input[id='gender-male']");
    By fName = By.cssSelector("input[id='FirstName']");
    By lName = By.cssSelector("input[id='LastName']");
    By mail = By.cssSelector("input[id='Email']");
    By pswd = By.cssSelector("input[id='Password']");
    By Cpswd = By.cssSelector("input[id='ConfirmPassword']");
    By RgBtn = By.cssSelector("input[id='register-button']");


    @Test

    public void createAccount() {

        driver.get("https://demowebshop.tricentis.com/");
        WebElement register = driver.findElement(rgs);
        register.click();

        SayfaAsagiKaydir();

        WebElement gender = driver.findElement(gnd);
        gender.click();

        WebElement firstName = driver.findElement(fName);
        firstName.sendKeys("Senol");

        WebElement lastName = driver.findElement(lName);
        lastName.sendKeys("Dogan");

        WebElement eMail = driver.findElement(mail);
        eMail.sendKeys("senoldogan2018@gmail.com");

        WebElement password = driver.findElement(pswd);
        password.sendKeys("Senol1988++");

        WebElement Confirmpassword = driver.findElement(Cpswd);
        Confirmpassword.sendKeys("Senol1988++");

        WebElement registerButton = driver.findElement(RgBtn);
        registerButton.click();



    }
}
