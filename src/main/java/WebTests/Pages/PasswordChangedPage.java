package WebTests.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PasswordChangedPage extends ChooseNewPasswordPage {

    public PasswordChangedPage selectLogOutCheckBox(){

        WebElement input = driver.findElement(By.xpath("//*[@id=\"u_0_3\"]"));
        input.click();

        return this;
    }

    public PasswordChangedPage selectStayLoggedCheckbox(){

        WebElement input = driver.findElement(By.xpath("//*[@id=\"u_0_4\"]"));
        input.click();

        return this;
    }

    public PasswordChangedPage pressContinueButton(){

        WebElement input = driver.findElement(By.xpath("//*[@id=\"u_0_y\"]/div[3]/button"));
        input.submit();

        return new SecurityPage();
    }
}

