package WebTests.Pages;

import WebTests.Support.WebDriverInstances;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainFacebookPage {
    private WebDriver driver;

    public MainFacebookPage (WebDriver driver) {this.driver = driver;}

    public MainFacebookPage inputEmail(String email){

        driver.findElement(By.id("email")).sendKeys(email);

        return this;
    }
//
//    public MainFacebookPage inputPassword (String email){
//
//        WebElement input = driver.findElement(By.id("pass"));
//        input.sendKeys(email);
//        input.submit();
//
//        return new FacebookFeedPage();
//    }
//
//    public MainFacebookPage clickInForgotPassword(){
//
//        WebElement input = driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a"));
//        input.click();
//
//        return new ForgotPasswordPage();
//    }
}
