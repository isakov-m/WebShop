package Senol;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.awt.*;
import java.awt.event.KeyEvent;

public class OrderHistoryDownload extends BaseDriver {




    By loginlink= By.xpath("//a[@href='/login']");
    By email=By.cssSelector("input[id='Email']");
    By password=By.cssSelector("input[id='Password']");
    By login=By.cssSelector("input[class='button-1 login-button']");
    By account=By.cssSelector("a[class='account']");
    By orders=By.xpath("//a[@href='/customer/orders']");
    By details=By.cssSelector("input[class='button-2 order-details-button']");
    By pdfFile=By.cssSelector("[class='button-2 pdf-order-button']");





    @Test

    public void orderHistoryDownloaD() throws AWTException {

        driver.get("https://demowebshop.tricentis.com/");

        WebElement Login= driver.findElement(loginlink);
        Login.click();

        WebElement Email= driver.findElement(email);
        Email.sendKeys("senoldogan2018@gmail.com");

        WebElement Password= driver.findElement(password);
        Password.sendKeys("Senol1988++");

        WebElement LoginBtn= driver.findElement(login);
        LoginBtn.click();

        WebElement Account= driver.findElement(account);
        Account.click();

        WebElement Orders= driver.findElement(orders);
        Orders.click();

        SayfaAsagiKaydir();

        WebElement Details= driver.findElement(details);
        Details.click();

        WebElement Pdf= driver.findElement(pdfFile);
        Pdf.click();


        Robot robot=new Robot();

        for (int i = 0; i < 27; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        MyFunc.Bekle(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);




    }
}
