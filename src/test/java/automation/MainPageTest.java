package automation;

import com.automation.MainPage;
import com.automation.core.driver.WebDriverRunner;
import org.junit.jupiter.api.*;

public class MainPageTest {
    @DisplayName("Cool test")
    @Tag("Close brauser")
    @Disabled
    @Test
    public void test() {
        WebDriverRunner.getInstance().get("http://automationpractice.com/index.php");
        MainPage page = new MainPage();
//        page.popular();
//        page.bestsellers();
//        page.addToCart("Printed Dress");
    }

    @AfterAll
    public static void close() {
        WebDriverRunner.getInstance().quit();
    }
}
