package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseFunc {
    private WebDriver driver;

    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void navigateTo(String url){
        if (url.startsWith("http://") || url.startsWith("https://")) {
        } else {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);

    }

    public WebElement findElement(By locator){
        Assertions.assertFalse(findElements(locator).isEmpty(), "There is no elements!");
        return driver.findElement(locator);
    }
}
