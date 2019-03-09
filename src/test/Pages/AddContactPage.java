package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddContactPage extends BasePage{
    public AddContactPage(WebDriver driver) {
        super(driver);
    }

    public AddContactPage chooseContactType(String type){
        WebElement typeField = driver.findElement(By.id("addmoredata")).findElement(By.name("type"));
        new Select(typeField).selectByVisibleText(type);

        return this;
    }

    public AddContactPage typeContact(String contact){
        driver.findElement(By.id("addmoredata")).findElement(By.name("contact")).sendKeys(contact);

        return this;
    }

    public MePage clickOnSaveButton(){
        driver.findElement(By.linkText("SAVE")).click();

        return new MePage(driver);
    }

    public MePage addContact(String type, String contact){
        chooseContactType(type);
        typeContact("");
        clickOnSaveButton();

        return new MePage(driver);
    }
}
