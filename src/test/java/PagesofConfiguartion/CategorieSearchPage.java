package PagesofConfiguartion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class CategorieSearchPage {

    WebDriver driver;
    WebDriverWait wait;

    By catalogClick = By.xpath("//i[@class='nav-icon fas fa-book']");
    By categoriesClick = By.xpath("//p[contains(text(),'Categories')]");
    By clickOnCategoryName = By.xpath("//input[@name = 'SearchCategoryName']");
    By published = By.xpath("//select[@name= 'SearchPublishedId']");
    By clickonSearch = By.xpath("//button[@class='btn btn-primary btn-search']");

    public CategorieSearchPage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
    }

    public void categoriesSearchPage()
    {
         driver.findElement(catalogClick).click();
         driver.findElement(categoriesClick).click();
         Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Categories')]")).getText(), "Categories");
         driver.findElement(clickOnCategoryName).sendKeys("Computer");
         driver.findElement(published).sendKeys("published");
         driver.findElement(clickonSearch).click();
        wait.until(ExpectedConditions.elementToBeClickable(clickonSearch));
    }
}
