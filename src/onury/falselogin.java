package onury;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import Utlity.passgenarator;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class falselogin extends BaseDriver {
    @Test
    public void test3 ()
    {

        driver.get("https://demowebshop.tricentis.com/login");

        WebElement emailbox = driver.findElement(By.name("Email"));
        emailbox.sendKeys("testertes20_23@outlook.com");

        MyFunc.Bekle(2);

        WebElement pass = driver.findElement(By.name("Password"));
        String generatedPassword =passgenarator.generateRandomPassword(8); // Generate a random password
        pass.sendKeys(generatedPassword);

        System.out.println("generatedPassword = "+generatedPassword);

        MyFunc.Bekle(2);

        WebElement log= driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        log.click();

        WebElement point= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span"));


        Assert.assertTrue("Aranılan mesaj bulunamadı",point.getText().contains("Login was unsuccessful. Please correct the errors and try again."));

        MyFunc.Bekle(2);
        driver.quit();




    }
}
