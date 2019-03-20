package Pages;

import Support.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginFormPage clickSingIn(){
        driver.findElement(By.linkText("Sign in")).click();

        return new LoginFormPage(driver);
    }
}
