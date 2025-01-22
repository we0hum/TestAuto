package test_rate_euro;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CurrencyPage {
    private final SelenideElement currencyRateEuro = $x("//span[contains(@id='sell_euro')]");

    public SelenideElement getRate(){
        return currencyRateEuro;
    }

}
