package WebTests.TestesCases;

import WebTests.Pages.MainFacebookPage;
import WebTests.Support.WebDriverInstances;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstWebTest {

    private static WebDriver driver;

    @Before
    public void setUp(){driver = WebDriverInstances.goToFacebookThroughChrome();}

    @Test
    public void goToMainScreenPage(){

        new MainFacebookPage(driver)
                .inputEmail("ribeirowelemoreno@gmail.com")
                .inputPassword("wel421563");
    }

}
