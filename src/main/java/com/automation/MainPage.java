package com.automation;

import com.automation.core.driver.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {
    /*private By locatorPopular = By.xpath("//*[contains(text(), 'Popular')]");
    private By locatorBestSeller = By.xpath("//*[contains(text(), 'Best Sellers')]");
    private By item = By.xpath("//div[@class='product-container']");
    private By itemTitle = By.xpath(".//a[@class='product-name']");
    private By locatorAddToCart = By.xpath(".//span[text()='Add to cart']");
    private By locatorMore = By.xpath(".//span[text()='More']");

    private final WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void popular() {
        driver.findElement(locatorPopular).click();
    }

    public void bestsellers() {
        driver.findElement(locatorBestSeller).click();
    }

    public void searchItems(String iteamName) {
        List<WebElement> elements = driver.findElements(item);
        for (WebElement element : elements) {
            WebElement titleElement = element.findElement(itemTitle);
            if (titleElement.getText().equals(iteamName)) {
                System.out.println("We got it!!!");
            }
        }
    }

    public void addToCart(String itemName) {
        List<WebElement> elements = driver.findElements(item);
        for (WebElement element : elements) {
            WebElement titleElement = element.findElement(itemTitle);
            if (titleElement.getText().equals(itemName)){
                element.findElement(locatorAddToCart).click();
            }
        }
    }

     */


    @FindBy(xpath="//*[a(text(), 'Popular')]")
    private WebElement popular;

    @FindBy(xpath = "//*[a(text(), 'Best Sellers')])")
    private WebElement bestsellers;

    private final WebDriver driver;

    public MainPage() {
        this.driver = WebDriverRunner.getInstance();
        PageFactory.initElements(driver, this);
    }
    public void popular(){
        popular.click();

    }
    public void bestsellers() {
        bestsellers.click();

    }
}


