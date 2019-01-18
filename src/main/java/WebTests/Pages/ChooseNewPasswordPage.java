package WebTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChooseNewPasswordPage extends EnterSecurityCodePage {

    public ChooseNewPasswordPage pressHelpButton(){

        WebElement input = driver.findElement(By.name("ok"));
        input.click();

        return new
    }

}
