package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FindingByLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement link = driver.findElement(By.linkText("Siparişlerim")); //Linkin ekranda gorunen text'i yazilir
        //Sadece a TAG'leri icin ozel Locator bulma yontemi

        System.out.println("link.getText() = " + link.getText());

        System.out.println("link.getAttribute(\"href\") = " + link.getAttribute("href"));
        System.out.println("link.getAttribute(\"title\") = " + link.getAttribute("title"));
        System.out.println("link.getAttribute(\"rel\") = " + link.getAttribute("rel"));

        MyFunc.Bekle(10);
        driver.quit();
    }
}
