package alfa_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import test_rate_euro.CurrencyPage;

public class AlfaTest {
    public final static String BASE_URL = "https://alfabank.ru";

    @Test
    public void ch(){
        new MainPage(BASE_URL).clickOnButton().clickOn();
        Assert.assertTrue(new CurrencyExchangePage().getHref().contains("https://lk.alfadirect.ru/transfers/money/from-account"));
        Assert.assertTrue(new CurrencyExchangePage().clickOnLink().contains("https://lk.alfadirect.ru/transfers/money/from-account"));
    }
}
