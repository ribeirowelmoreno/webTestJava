package WebTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterSecurityCodePage extends ForgotPasswordPage {
    public EnterSecurityCodePage(WebDriver driver) {
        super(driver);
    }
//
//    public EnterSecurityCodePage inputSecurityCodeAndContinue(String code){
//
//        WebElement input = driver.findElement(By.id(""));
//        input.sendKeys(code);
//        input.submit();
//
//        return new ChooseNewPasswordPage();
//    }
//
//    public MainFacebookPage cancelInpurSecutiryCode(){
//
//        WebElement input = driver.findElement(By.id(""));
//        input.findElement(By.xpath("//*[@id=\"u_0_9\"]/div/div[3]/div/div[1]/a")).click();
//
//        return new MainFacebookPage();
//    }
}
