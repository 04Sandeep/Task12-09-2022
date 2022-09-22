package PagesofConfiguartion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SystemAlertPage {
    WebDriver driver;
    WebDriverWait wait;

    By systemClick = By.xpath("//i[@class='nav-icon fas fa-cube']");
    By templatesClick = By.xpath("//p[contains(text(),'Templates')]");
    By clickOnDelete = By.xpath("//i[@class = 'far fa-trash-alt'][1]");

    public SystemAlertPage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }
    public void systemAlertPage() throws InterruptedException {
        driver.findElement(systemClick).click();
        driver.findElement(templatesClick).click();
        driver.findElement(clickOnDelete).click();
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(5000);
        alert.accept();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(), 'Logout')]"))));
    }
}
