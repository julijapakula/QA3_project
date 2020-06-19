package pages;

import org.junit.jupiter.api.Test;

public class DelfiTest {
    private final String URL = "http://delfi.lv";
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void testDeBug(){
        baseFunc.navigateTo(URL);
        HomePage homePage= new HomePage(baseFunc);
        homePage.openArticleById(2);
    }
}
