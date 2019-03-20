package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MePage extends BasePage{

    public MePage(WebDriver driver) {
        super(driver);
    }

    public MePage clickInMoreDataAboutYou(){
        driver.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

        return this;
    }

    public AddContactPage clickInAddMoreDataAboutYouButton(){

        return new AddContactPage(driver);


    }
}
