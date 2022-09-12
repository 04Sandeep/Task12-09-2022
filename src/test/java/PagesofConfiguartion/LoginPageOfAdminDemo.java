package PagesofConfiguartion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPageOfAdminDemo {
    WebDriver driver;
    WebDriverWait wait;
    public LoginPageOfAdminDemo(WebDriver driver) {
        this.driver = driver;
    }

    public void loginPage() {
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("admin");
        driver.findElement(By.xpath("//div[@class='buttons']/button")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText(), "Dashboard");
    }
    public void logout() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), 'Logout')]")));
        driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).click();
    }
}


