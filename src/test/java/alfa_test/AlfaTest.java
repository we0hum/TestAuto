package alfa_test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlfaTest {
    public final static String BASE_URL = "https://alfabank.ru";

    @Test(description = "Проверка перехода по ссылке Личный кабинет Альфа-Инвестиций")
    public void checkAlfaInvestmentsLink() {
        new MainPage(BASE_URL).redirectToPageCurrencyExchange().clickTheThirdQuestion();
        Assert.assertTrue(new CurrencyExchangePage().getHrefAttribute().contains("https://lk.alfadirect.ru/transfers/money/from-account"));
        Assert.assertTrue(new CurrencyExchangePage().returnUrlOnThePage().contains("https://lk.alfadirect.ru/transfers/money/from-account"));
    }
}
