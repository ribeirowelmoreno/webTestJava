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

        driver.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link com text "Sign in"
        driver.findElement(By.linkText("Sign in")).click();

        WebElement formularioSigningBox = driver.findElement(By.id("signingbox"));

        formularioSigningBox.findElement(By.name("login")).sendKeys("julio0001");

        formularioSigningBox.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.linkText("SIGN IN")).click();

        //Verificar se o ligin foi feito pelo class "me"
        WebElement me = driver.findElement(By.className("me"));
        String textOnMeElement = me.getText();
        assertEquals("Hi, Julio", textOnMeElement);

        //Fechar o navegador
        driver.quit();
    }

}
