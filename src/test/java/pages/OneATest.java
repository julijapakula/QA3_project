package pages;

import org.junit.jupiter.api.Test;

public class OneATest {
    private final String URL = "http://1a.lv";
    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void testOneA() {
        baseFunc.navigateTo(URL);
        HomePage homePage = new HomePage(baseFunc);
    }
}
