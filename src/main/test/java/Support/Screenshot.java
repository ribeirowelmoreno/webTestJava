package Support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void take(WebDriver driver, String file){
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(file));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Somtething went wrong on copy process!" + e.getMessage());
        }

    }
}
