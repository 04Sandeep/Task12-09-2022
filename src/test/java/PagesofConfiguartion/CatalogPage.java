package PagesofConfiguartion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class CatalogPage {

    WebDriver driver;
    WebDriverWait wait;

    By catalogClick = By.xpath("//i[@class='nav-icon fas fa-book']");
    By productClick = By.xpath("//i[@class='nav-icon far fa-dot-circle'][1]");
    By productName = By.xpath("//input[@name = 'SearchProductName']");
    By categoryName = By.xpath("//select[@name = 'SearchCategoryId']");
    By selectSubCategories = By.xpath("//input[@name = 'SearchIncludeSubCategories']");
    By manufacturer = By.xpath("//select[@name = 'SearchManufacturerId']");
    By vendor = By.xpath("//select[@name='SearchVendorId']");
    By warehouse = By.xpath("//select[@name='SearchWarehouseId']");
    By productType = By.xpath("//select[@name='SearchProductTypeId']");
    By published = By.xpath("//select[@name='SearchPublishedId']");
    By clickOnSearch = By.xpath("//button[@class='btn btn-primary btn-search']");

    public CatalogPage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    public void catalogPage()
    {
        driver.findElement(catalogClick).click();
        driver.findElement(productClick).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Products')]")).getText(), "Products");
        driver.findElement(productName).sendKeys("Computers");
        driver.findElement(categoryName).sendKeys("Computers");
        driver.findElement(selectSubCategories).click();
        driver.findElement(manufacturer).sendKeys("Apple");
        driver.findElement(vendor).sendKeys("All");
        driver.findElement(warehouse).sendKeys("All");
        driver.findElement(productType).sendKeys("Simple");
        driver.findElement(published).sendKeys("Published only");
        driver.findElement(clickOnSearch).click();
        wait.until(ExpectedConditions.elementToBeClickable(clickOnSearch));

    }
}
