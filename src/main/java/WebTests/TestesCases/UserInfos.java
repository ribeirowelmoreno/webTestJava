package WebTests.TestesCases;

import org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class UserInfos {

    private static WebDriver driver;


    @Test
    public void testUserLogin() {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Wait unitl 5 seconds for any element be displayed at screen
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.facebook.com.br/");

        //Clicar no link com text "Sign in"
        driver.findElement(By.id("email")).sendKeys("ribeirowelmoreno@gmail.com");

        driver.findElement(By.name("pass")).sendKeys("wel421563");

        driver.findElement(By.id("loginbutton")).submit();
//        //Verificar se o ligin foi feito pelo class "me"
//        WebElement me = signingBoxForm.findElement(By.className("me"));
//        String texOnMeElement = me.getText();
//        assertEquals("Hi, Julio", texOnMeElement);

        //Fechar o navegador
    }

}
