package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage {

    public LoginFormPage(WebDriver driver) {
        super(driver);
    }

    public LoginFormPage typeLogin(String login){
        driver.findElement(By.id("signingbox")).findElement(By.name("login")).sendKeys(login);

        return this;
    }

    public LoginFormPage typePassword(String password){
        driver.findElement(By.id("signingbox")).findElement(By.name("password")).sendKeys(password);

        return this;
    }
    public SecretPage clickInSignIn(){
        driver.findElement(By.linkText("SIGN IN")).click();

        return new SecretPage(driver);
    }

    public SecretPage makeLogin(String login, String password){
        typeLogin(login);
        typePassword(password);
        clickInSignIn();

        return new SecretPage(driver);
    }
}
