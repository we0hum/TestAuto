package test_rate_euro;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
//    private final SelenideElement searchButton = $x("//a[@href='/exchange/' and @class ='header-menu-item__link header-menu-item__link--popular']");
    private final SelenideElement searchButton = $x("//a[contains(@href, 'exchange') and text() = 'Курсы валют']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void clickOnButton() {
        searchButton.click();
    }
}
