package WebTests.Support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverInstances {

    //public static WebDriver driver = new ChromeDriver();


    public static WebDriver goToFacebookThroughChrome(){

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://pt-br.facebook.com/";
        driver.get(baseUrl);

        return driver;
    }
}
