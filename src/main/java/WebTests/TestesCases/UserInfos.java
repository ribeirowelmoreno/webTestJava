package WebTests.TestesCases;

import org.junit.After;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class UserInfos {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        //Wait unitl 5 seconds for any element be displayed at screen
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.juliodelima.com.br/taskit");
    }

    @Test
    public void testUserLogin() {

        //Clicar no link com text "Sign in"
        driver.findElement(By.linkText("Sign in")).click();

        WebElement formularioSigningBox = driver.findElement(By.id("signingbox"));

        formularioSigningBox.findElement(By.name("login")).sendKeys("julio0001");

        formularioSigningBox.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.linkText("SIGN IN")).click();

       //Clicar em um link que possue a class "me"

       //Clicar em um link que possui o texto "More data about you"

       //


    }

    @After
    public void tearDown(){
        //Fechar o navegador
        driver.quit();
    }
}
