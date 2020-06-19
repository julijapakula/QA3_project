package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.By.*;

public class HomePage {
    private BaseFunc baseFunc;
    private final By ITEM_NAVIGATE = xpath(".//h1[contains(@class, 'headline__title')]");
    private final By COVID = xpath(".//img[@class='corona-logo loading']");
    private final By ARTICLES = xpath(".//span[@class='text-size-19 text-size-md-22 d-block']");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
        assertTrue(baseFunc.findElement(COVID).isDisplayed(),"Not a Home Page");

    }
    public void openArticleById(int id){
        List<WebElement> articles = baseFunc.findElements(ARTICLES);
        articles.get(id).click();

    }
}
