package test_google;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final String siteLink = $x("//div//h3").text();

    public String getLink(){
        return siteLink;
    }
}
