package test_google;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    public final static String BASE_URL = "https://www.google.ru";
    public final static String SEARCH_STRING = "Яндекс";

    @Test
    public void checkHref(){
        Assert.assertTrue(new MainPage(BASE_URL).search(SEARCH_STRING).getLink().contains("Яндекс — быстрый поиск в интернете"));
    }
}
