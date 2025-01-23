package alfa_test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement searchButton1 = $x("//a[@class='aXYDeT gXYDeT eXYDeT eI24uu' and text() = 'Инвестиции']");
    private final SelenideElement searchButton = $x("//a[@class='aXYDeT gXYDeT eXYDeT' and @href ='/make-money/investments/valyuta/']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public CurrencyExchangePage clickOnButton() {
        searchButton1.hover();
        searchButton.click();
        return new CurrencyExchangePage();
    }
}
