package WebTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SecurityPage extends PasswordChangedPage {

    public SecurityPage pressGetStartButton(){

        WebElement input = driver.findElement(By.id("checkpointButtonGetStarted"));
        input.submit();

        return new ChangesPage();
    }
}
