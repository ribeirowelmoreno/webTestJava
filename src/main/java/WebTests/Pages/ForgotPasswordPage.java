package WebTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends MainFacebookPage {

    public ForgotPasswordPage inputEmailInForgotPsswordField(String email){

        WebElement input = driver.findElement(By.id(""));
        input.sendKeys(email);
        input.submit();

        return new EnterSecurityCodePage();
    }
}
