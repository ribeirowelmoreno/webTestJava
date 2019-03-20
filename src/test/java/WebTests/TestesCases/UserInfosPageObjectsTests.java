package WebTests.TestesCases;

import Pages.LoginPage;
import Support.Web;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "UserInfosPageObjectsTests.csv")
public class UserInfosPageObjectsTests {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = Web.createBrowserStack();
    }

    @Test
    public void testUserLogin(
            @Param(name = "login")String login,
            @Param(name = "password")String password,
            @Param(name = "type")String type,
            @Param(name = "contact")String contact,
            @Param(name = "expectedMessage")String expectedMessage){

       String textToast = new LoginPage(driver)
                .clickSingIn()
                .makeLogin(login, password)
                .clickInMe()
                .clickInMoreDataAboutYou()
                .clickInAddMoreDataAboutYouButton()
                .addContact(type, contact)
                .takeToastText();

        assertEquals(expectedMessage, textToast);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
