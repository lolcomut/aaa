package automation;

import com.automation.MainPage;
import com.automation.core.driver.WebDriverRunner;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest {

    @Test
    public void test() {
        WebDriverRunner.getInstance().get("http://automationpractice.com/index.php");
        MainPage page = new MainPage();
        page.popular();
        page.bestsellers();
//        page.addToCart("Printed Dress");
    }

}
