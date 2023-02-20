package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByClassName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // web sayfasini kontrol eden gorevli
        driver.get("https://form.jotform.com/221934510376353"); //web sayfasini ac

        WebElement submitButton = driver.findElement(By.className("form-submit-button"));
        System.out.println("submitButton.getText() = " + submitButton.getText());
        submitButton.click();

        MyFunc.Bekle(10);
        driver.quit();
    }
}
