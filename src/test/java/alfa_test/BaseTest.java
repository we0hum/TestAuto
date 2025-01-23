package alfa_test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.webdriverLogsEnabled = true;
        Configuration.browserSize = "2560x1440";
        Configuration.headless = false;
    }

    @BeforeTest
    public void init(){
        setUp();
    }

    @AfterTest
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
