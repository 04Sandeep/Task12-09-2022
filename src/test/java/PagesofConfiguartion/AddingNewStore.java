package PagesofConfiguartion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
public class AddingNewStore
{
    WebDriver driver;
    WebDriverWait wait;

    By configuration = By.xpath("//i[@class = 'nav-icon fas fa-cogs']");
    By selectstores = By.xpath("//*[contains(text(),'Stores')]");
    By addStores = By.xpath("//a[@class = 'btn btn-primary']");
    By storename = By.xpath("//input[@name='Name']");
    By addUrl = By.xpath("//input[@name='Url']");
    By enableSSL = By.xpath("//input[@name='SslEnabled']");
    By clicksave = By.xpath("//button[@name='save']");
    public AddingNewStore(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }
    public void addingNewStore()
    {
        driver.findElement(configuration).click();
        driver.findElement(selectstores).click();
        Assert.assertEquals(driver.findElement(By.xpath("//h1[contains(text(),'Stores')]")).getText(), "Stores");
        driver.findElement(addStores).click();
       // JavascriptExecutor jse = (JavascriptExecutor) driver;
       // jse.executeScript("document.getElementByxpath('storename').value='Amazon'");
        driver.findElement(storename).sendKeys("Amazon");
        driver.findElement(addUrl).sendKeys("amazon123@gmail.com");
        driver.findElement(enableSSL).click();
        wait.until(ExpectedConditions.elementToBeClickable(enableSSL));
        driver.findElement(clicksave).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(), 'Logout')]"))));
    }
}