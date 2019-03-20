package Support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web {
    public static final String USERNAME = "wellyntonribeiro1";
    public static final String AUTOMATE_KEY = "XTUpsgZqqGCNSXosqykT";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static WebDriver createChrome(){

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Wait unitl 5 seconds for any element be displayed at screen
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.juliodelima.com.br/taskit");

        return driver;
    }

    public static WebDriver createBrowserStack(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "62.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");

        WebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(URL), caps);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            driver.get("http://www.juliodelima.com.br/taskit");
        } catch (MalformedURLException e) {
            System.out.println("Something went wrong with your URL" + e.getMessage());
        }



        return driver;

    }
}
