package PagesofConfiguartion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddingEmailNewAddressses {
    WebDriver driver;
    By configurationclick = By.xpath("//*[contains(text(),'Configuration')]");
    By emialAccountsclick = By.xpath("//*[contains(text(),'Email accounts')]");
    By addNewButton = By.xpath("//a[@class = 'btn btn-primary']");
    By emailaddress = By.xpath("//input[@name = 'Email']");
    By displayName = By.xpath("//input[@name = 'DisplayName']");
    By hostName = By.xpath("//input[@name = 'Host']");
    By userName = By.xpath("//input[@name = 'Username']");
    By password = By.xpath("//input[@name = 'Password']");
    By sslbox = By.xpath("//input[@name = 'EnableSsl']");
    By userdefaultcredentials = By.xpath("//input[@name = 'UseDefaultCredentials']");
    By save = By.xpath("//button[@name = 'save']");
    public AddingEmailNewAddressses( WebDriver driver)
    {
        this.driver = driver;
    }

   public void addingNewEmail()
   {
       driver.findElement(configurationclick).click();
       driver.findElement(emialAccountsclick).click();
       driver.findElement(addNewButton).click();
       driver.findElement(emailaddress).sendKeys("sandeep411@gmail.com");
       driver.findElement(displayName).sendKeys("Sandeep");
       driver.findElement(hostName).sendKeys("Sandy kaur");
       driver.findElement(userName).sendKeys("0408Sandeep");
       driver.findElement(password).sendKeys("04085656");
       driver.findElement(sslbox).click();
       driver.findElement(userdefaultcredentials).click();
       driver.findElement(save).click();
   }
}
