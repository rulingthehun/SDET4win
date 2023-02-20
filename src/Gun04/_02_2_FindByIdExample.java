package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_2_FindByIdExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

        WebElement email = driver.findElement(By.id("ap_email"));
        email.sendKeys("burakgaznepoglu_1999@hotmail.com");

        WebElement submitButton = driver.findElement(By.className("a-button-input"));
        submitButton.click();

        WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("20Sifre23.");

        WebElement signInSubmit = driver.findElement(By.id("signInSubmit"));
        signInSubmit.click();

        MyFunc.Bekle(10);
        driver.quit();
    }
}
