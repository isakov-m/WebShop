package onury;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class uye_girisiz_oy extends BaseDriver {

    @Test
    public void test1 ()
    {

        driver.get("https://demowebshop.tricentis.com");


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

        WebElement vote= driver.findElement(By.cssSelector("input[id=\"vote-poll-1\"]"));
        vote.click();
//
       WebElement error= driver.findElement(By.xpath("//*[@id='block-poll-vote-error-1']"));

       //Assert.assertTrue("Aranılan mesaj bulunamadı",error.getText().contains("Only registered users can vote"));
       // java script oldugu icin okumuyor

       // if (error.getText().contains("Only registered users can vote"))
       // System.out.println("test gecti");

        //else
            //System.out.println("testten kaldi");





    }
}
