package WebTests.TestesCases;

import Support.Generator;
import Support.Screenshot;
import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "UserInfos.csv")

public class UserInfos {
    private WebDriver driver;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        //Wait unitl 5 seconds for any element be displayed at screen
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link com text "Sign in"
        driver.findElement(By.linkText("Sign in")).click();

        WebElement formularioSigningBox = driver.findElement(By.id("signingbox"));

        formularioSigningBox.findElement(By.name("login")).sendKeys("julio0001");

        formularioSigningBox.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.linkText("SIGN IN")).click();

        //Clicar em um link que possue a class "me"
        driver.findElement(By.className("me")).click();

        //Clicar em um link que possui o texto "More data about you"
        driver.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
    }

    @Test
    public void testUserLogin(@Param(name = "type")String registerType, @Param(name = "contact")String phoneOrEmail, @Param(name = "message")String expectedMessage) {

        //Clicar no link com text "Sign in"
        driver.findElement(By.linkText("Sign in")).click();

        WebElement formularioSigningBox = driver.findElement(By.id("signingbox"));

        formularioSigningBox.findElement(By.name("login")).sendKeys("julio0001");

        formularioSigningBox.findElement(By.name("password")).sendKeys("123456");

        driver.findElement(By.linkText("SIGN IN")).click();

       //Clicar em um link que possue a class "me"
        driver.findElement(By.className("me")).click();

       //Clicar em um link que possui o texto "More data about you"
        driver.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

       //Clicar no botão através do seu xpath //button[@data-target="addmoredata"]
        driver.findElement(By.xpath("/button[@data-target=\"addmoredata\"]")).click();

       //Identificar a popup onde está o formulário de id "addmoredata"
        WebElement popupAddMoreData = driver.findElement(By.id("addmoredata"));

       //Na combo de name type, escolher a opção "Phone"
        WebElement typeField = popupAddMoreData.findElement(By.name("type"));
        new Select(typeField).selectByVisibleText(registerType);

       //Colocar no campo de contact, digitar o telefone
        popupAddMoreData.findElement(By.name("contact")).sendKeys(phoneOrEmail);

       //Clicar no link de text save que está na popup
        popupAddMoreData.findElement(By.linkText("SAVE")).click();

       //Na mensagem de id "toast-container" validar que o texto é "Your contact has been added!"
        WebElement popMessage = driver.findElement(By.id("toas-container"));
        String mensagem = popMessage.getText();
        assertEquals(expectedMessage, mensagem);

    }

    @After
    public void tearDown(){
        //Fechar o navegador
        driver.quit();
    }

    @Test
    public void removingAnUserContact(){

        //Clicar no elemento pelo seu xpath //span[text()="+5519999999999"]/following-sibling::a
        driver.findElement(By.xpath("//span[text()=\"+5519999999999\"]/following-sibling::a")).click();

        //Confirmar a janela javascript
        driver.switchTo().alert().accept();

        //Validar que a mensagem apresentada foi "Rest in peace, dear phone!"
        WebElement popMessage = driver.findElement(By.id("toas-container"));
        String mensagem = popMessage.getText();
        assertEquals("Rest in peace, dear phone!", mensagem);

        String screenshotFile = "D://Wellynton//Screenshots/" + Generator.dataAndTimeToFile() + test.getMethodName() + ".png";
        Screenshot.take(driver,screenshotFile);

        //Aguardar até 10s para que a janela desapareça
        WebDriverWait waiting = new WebDriverWait(driver, 10);
        waiting.until(ExpectedConditions.stalenessOf(popMessage));

        //Clicar no link com texto "Logout"
        driver.findElement(By.linkText("Logout")).click();

    }
}
