package WebTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HelpPage extends ChooseNewPasswordPage {

    public ChooseNewPasswordPage pressOkayButton(){

        WebElement input = driver.findElement(By.name("ok"));
        input.click();

        return new ChooseNewPasswordPage();
    }
}
