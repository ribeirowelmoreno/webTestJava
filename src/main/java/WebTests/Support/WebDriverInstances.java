package WebTests.Support;

import WebTests.Pages.MainFacebookPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WebDriverInstances {

    public static WebDriver driver = new ChromeDriver();


    public WebDriverInstances goToFacebookThroughChrome(){

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver.get("https://pt-br.facebook.com/");

        return new MainFacebookPage();
    }

}
