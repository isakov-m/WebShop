package onury;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class secimsizoylama extends BaseDriver {

    @Test

    public void test2 (){

        driver.get("https://demowebshop.tricentis.com");

        MyFunc.Bekle(2);
        WebElement vote= driver.findElement(By.cssSelector("input[id=\"vote-poll-1\"]"));
        vote.click();

        MyFunc.Bekle(2);

        driver.quit();

        // secim yapmadan oy gönderme











    }
}
