package automation;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest {
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://automationpractice.com/index.php");
        //WebElement element = driver.findElement(By.xpath("//img[@alt = 'Printed Dress']"));
        //WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt = 'Printed Dress']")));
        //element.click();
        driver.manage().window().setSize(new Dimension(800, 600));

    }
}
