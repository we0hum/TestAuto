package test_rate_euro;

import org.testng.annotations.Test;

public class TestCurrency extends BaseTest {
    public final static String BASE_URL = "https://www.forabank.ru/";

    @Test
    public void checkRate(){
        MainPage mainPage = new MainPage(BASE_URL);
         mainPage.clickOnButton();
         CurrencyPage currencyPage = new CurrencyPage();
         currencyPage.getRate();
    }
}
