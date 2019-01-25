package WebTests.TestesCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserInfos {

    private static WebDriver driver;


    @Test
    public void testUserLogin() {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link com text "Sign in"
        driver.findElement(By.linkText("Sing in")).click();

        //Identificando o formulario de login"
        WebElement signingBoxForm = driver.findElement(By.id("signingbox"));

        //Digitar o nome dentro do name "login"
        signingBoxForm.findElement(By.name("login")).sendKeys("julio0001");

        //Clicar no campo "password" dentro de "signingbox"
        signingBoxForm.findElement(By.name("password")).sendKeys("123456");

        //Clicar no botao "Sign in"

        //Verificar se o ligin foi feito pelo class "me"

        //Fechar o navegador
    }

}
