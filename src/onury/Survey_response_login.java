package onury;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Survey_response_login extends BaseDriver {

    @Test
    public void test1 ()
    {

        driver.get("https://demowebshop.tricentis.com");

        // SECIM YAPMADAN OY GÖNDERME



        WebElement rdy1= driver.findElement(By.id("pollanswers-1"));
        rdy1.click();

        MyFunc.Bekle(1);

        WebElement rdy2= driver.findElement(By.id("pollanswers-2"));
        rdy2.click();

        MyFunc.Bekle(1);

        WebElement rdy3= driver.findElement(By.id("pollanswers-3"));
        rdy3.click();

        MyFunc.Bekle(1);

        WebElement rdy4= driver.findElement(By.id("pollanswers-4"));
        rdy4.click();

        WebElement voteE= driver.findElement(By.cssSelector("input[id=\"vote-poll-1\"]"));
        voteE.click();
// giris
        WebElement login=driver.findElement(By.linkText("Log in"));
        login.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("1a@mail.ru");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("Bishkek2023");

        WebElement loginBtn=driver.findElement(By.cssSelector("[value='Log in']"));
        loginBtn.click();

        MyFunc.Bekle(2);

        // BU KISIM SITEDE 1 DEN COK COK OYLAMA MÜMKUN OLDUGU ZAMAN CALISTIRILACAK
        //WebElement rdy1a= driver.findElement(By.id("pollanswers-1"));
        //rdy1a.click();

        //MyFunc.Bekle(1);

        //WebElement rdy2a= driver.findElement(By.id("pollanswers-2"));
        //rdy2a.click();

        //MyFunc.Bekle(1);

        //WebElement rdy3a= driver.findElement(By.id("pollanswers-3"));
        //rdy3a.click();



        //WebElement rdy4a= driver.findElement(By.id("pollanswers-4"));
        //rdy4a.click();

        //WebElement votea= driver.findElement(By.cssSelector("input[id=\"vote-poll-1\"]"));
        //votea.click();


//
        WebElement point= driver.findElement(By.xpath("//*[@id=\"poll-block-1\"]/ul/li[2]"));


        Assert.assertTrue("Aranılan mesaj bulunamadı",point.getText().contains("Good "));

        driver.quit();









    }
}
