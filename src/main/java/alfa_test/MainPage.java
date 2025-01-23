package alfa_test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement investmentButton = $x("//div[@data-test-id='Main-Header-Main-Desktop-container']//a[@title='Инвестиции']");
    private final SelenideElement currencyExchangeButton = $x("//div[@class='aTQdJq']//a[contains(@href, '/valyuta/')]");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public CurrencyExchangePage redirectToPageCurrencyExchange() {
        investmentButton.hover();
        currencyExchangeButton.click();
        return new CurrencyExchangePage();
    }
}
