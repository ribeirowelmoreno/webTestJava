package WebTests.TestesCases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserInfos {

    private static WebDriver driver;


    @Test
    public void testUserLogin() {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link com text "Sign in"

        //Clicar no name "login" dentro do ID "signingbox"

        //Digitar o nome dentro do name "login"

        //Clicar no campo "password" dentro de "signingbox"

        //Digitar a senha no campo "password"

        //Clicar no botao "Sign in"

        //Verificar se o ligin foi feito pelo class "me"

        //Fechar o navegador
    }

}
