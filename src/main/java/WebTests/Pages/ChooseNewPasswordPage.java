package WebTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChooseNewPasswordPage extends EnterSecurityCodePage {

    public ChooseNewPasswordPage pressHelpButton(){

        WebElement input = driver.findElement(By.name("ok"));
        input.click();

        return new HelpPage();
    }

    public ChooseNewPasswordPage pressHideOrShowPassword(){

        WebElement input = driver.findElement(By.id("password_new_show"));
        input.click();

        return this;
    }

    public ChooseNewPasswordPage pressContinueButton(){

        WebElement input = driver.findElement(By.id("btn_continue"));
        input.click();

        return new PasswordChangedPage();
    }

}
