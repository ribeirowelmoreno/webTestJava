package WebTests.Pages;

import WebTests.Support.WebDriverInstances;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainFacebookPage extends WebDriverInstances {

    public MainFacebookPage inputEmail(String id, String email){

        WebElement input = driver.findElement(By.id(id));
        input.sendKeys(email);

        return this;
    }

    protected MainFacebookPage inputPassword (String id, String email){

        WebElement input = driver.findElement(By.id(id));
        input.sendKeys(email);
        input.submit();

        return new FacebookFeedPage();
    }

    public MainFacebookPage clickInForgotPassword(){

        WebElement input = driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a"));
        input.click();

        return new ForgotPasswordPage();
    }
}
