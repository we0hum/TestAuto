package test_google;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement searchField = $x("//textarea[@class='gLFyf']");

    public MainPage(String url){
        Selenide.open(url);
    }

    public SearchPage search(String searchString){
        searchField.setValue(searchString);
        searchField.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
