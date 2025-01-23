package alfa_test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.actions;

public class CurrencyExchangePage {
    private final SelenideElement getHref = $x("//a[@class='aXYDeT gXYDeT cXYDeT cnVCIM bnVCIM' and text()='Личный кабинет Альфа-Инвестиции:']");

    public void clickOn() {
        SelenideElement searchButton = $x("//div[@data-test-id='accordion-item-2']");
        actions().moveToElement(searchButton).click(searchButton).perform();
    }

    public String  getHref(){
        return getHref.getAttribute("href");
    }

    public String  clickOnLink() {
        getHref.click();
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }
}
