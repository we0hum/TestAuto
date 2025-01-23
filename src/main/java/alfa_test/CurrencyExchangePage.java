package alfa_test;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;

public class CurrencyExchangePage {
    private final SelenideElement searchAccountLink = $x("//div[@data-test-id='accordion-panel-2']//a[contains(@href, '/from-account')] ");
    private final SelenideElement thirdQuestionSearch = $x("//div[@data-test-id='accordion-item-2']");

    public void clickTheThirdQuestion() {
        actions().moveToElement(thirdQuestionSearch).click(thirdQuestionSearch).perform();
    }

    public String getHrefAttribute() {
        return searchAccountLink.getAttribute("href");
    }

    public String returnUrlOnThePage() {
        actions().moveToElement(searchAccountLink).click(searchAccountLink).perform();
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
