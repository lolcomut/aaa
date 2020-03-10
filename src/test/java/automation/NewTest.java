package automation;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class NewTest {
    @Test
     public void test() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("http://automationpractice.com/index.php");
        //WebElement element = driver.findElement(By.xpath("//img[@alt = 'Printed Dress']"));
        //WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt = 'Printed Dress']")));
        //element.click();
        //driver.manage().window().setSize(new Dimension(800, 600));
        //void to("http://automationpractice.com/");
        //driver.get("http://automationpractice.com/index.php");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getWindowHandle());
        //driver.get("http://the-internet.herokuapp.com/windows");
        //WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("*//[contains(text(), 'Click Eere')]")));
    //element.click();
    //ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
    //driver.switchTo().window(strings.get(1));
    //driver.close();

       /* WebElement search = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Search']")));
        search.sendKeys("Blouse");
        search.sendKeys(Keys.ENTER);
        WebElement found = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'results']")));
        String text=found.getText();
        if (found.isDisplayed()){
            System.out.println("Элемент отобразился");
            System.out.println(text);*/

        /*driver.get("http://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mse_0_ifr");
        WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//p[conteins(text() 'Your contect goes here']")));
        element.clear();
        driver.switchTo().defaultContent();
        WebElement element1 = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//p[conteins(text() 'Your contect goes here']")));*/
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button = driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Alert')]"));
        button.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        button = driver.findElement(By.xpath("//*[contains(text(), 'Click for JS Confirm')]"));
        button.click();
        alert = driver.switchTo().alert();
        alert.dismiss();


    }
    }

