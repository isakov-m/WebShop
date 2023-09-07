package Tuba;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Using_coupons_and_gift_cards extends BaseDriver {

    @Test
    public void urun(){
        driver.get("https://demowebshop.tricentis.com/2");

        WebElement urunKategorie=driver.findElement(By.xpath("//*[@href='/computers']"));
        urunKategorie.click();
        MyFunc.Bekle(1);

        WebElement urun=driver.findElement(By.xpath("//*[@class='sub-category-item']"));
        urun.click();
        MyFunc.Bekle(1);


        WebElement secim1=driver.findElement(By.xpath("(//*[@class='picture'])[1]"));
        secim1.click();
        MyFunc.Bekle(1);

        WebElement addOn=driver.findElement(By.xpath("//*[@id='add-to-cart-button-72']"));
        addOn.click();
        MyFunc.Bekle(1);

        WebElement Sepet=driver.findElement(By.xpath("//*[@class='cart-label']"));
        Sepet.click();
        MyFunc.Bekle(1);

        WebElement giftCard=driver.findElement(By.xpath("//*[@class='button-2 apply-gift-card-coupon-code-button']"));
        giftCard.click();
        MyFunc.Bekle(1);

        WebElement applyCoupon=driver.findElement(By.xpath("//*[@class='button-2 apply-discount-coupon-code-button']"));
        applyCoupon.click();
        MyFunc.Bekle(1);

        WebElement urunOnayla = driver.findElement(By.xpath("//*[@name='removefromcart']"));
        urunOnayla.click();
        MyFunc.Bekle(1);

        WebElement Agree = driver.findElement(By.xpath("//*[@id='termsofservice']"));
        Agree.click();
        MyFunc.Bekle(1);

        WebElement checkoutButton = driver.findElement(By.xpath("//*[@class='button-1 checkout-button']"));
        checkoutButton.click();
        MyFunc.Bekle(1);


        WebElement Email = driver.findElement(By.cssSelector("input[id='Email']"));
        Email.sendKeys("senoldogan2018@gmail.com");

        WebElement Password = driver.findElement(By.cssSelector("input[id='Password']"));
        Password.sendKeys("Senol1988++");

        WebElement LoginBtn = driver.findElement(By.cssSelector("input[class='button-1 login-button']"));
        LoginBtn.click();
        MyFunc.Bekle(1);

        WebElement Agree1 = driver.findElement(By.xpath("//*[@id='termsofservice']"));
        Agree1.click();
        MyFunc.Bekle(1);

        WebElement checkoutButton1 = driver.findElement(By.xpath("//*[@class='button-1 checkout-button']"));
        checkoutButton1.click();
        MyFunc.Bekle(1);

        WebElement continue1= driver.findElement(By.xpath("//*[@class='button-1 new-address-next-step-button']"));
        continue1.click();

        WebElement InStorePickup= driver.findElement(By.xpath("//*[@id='PickUpInStore']"));
        InStorePickup.click();

        WebElement continue2= driver.findElement(By.xpath("//*[@onclick='Shipping.save()']"));
        continue2.click();

        WebElement PaymentMethod= driver.findElement(By.xpath("//*[@class='section payment-method']"));
        PaymentMethod.click();

        WebElement continue3= driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']"));
        continue3.click();

        WebElement PaymentInformation= driver.findElement(By.xpath("//*[@class='section payment-method']"));
        PaymentInformation.click();

        WebElement continue4= driver.findElement(By.xpath("//*[@class='button-1 payment-info-next-step-button']"));
        continue4.click();

        WebElement confirmOrderButton = driver.findElement(By.xpath("//*[@class='button-1 confirm-order-next-step-button']"));
        confirmOrderButton.click();
        MyFunc.Bekle(1);

        WebElement successMessage = driver.findElement(By.xpath("//*[@class='title']"));

        Assert.assertTrue(successMessage.getText().contains("successfully processed!"), "mesajlar ayni degil");

        BekleVeKapat();

    }

}