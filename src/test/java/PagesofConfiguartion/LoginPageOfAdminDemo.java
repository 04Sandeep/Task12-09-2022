package PagesofConfiguartion;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
public class LoginPageOfAdminDemo
{
    WebDriver driver;
    WebDriverWait wait;
    List<WebElement> tabs;
    public static  String path;
    public LoginPageOfAdminDemo(WebDriver driver)
    {
        this.driver = driver;
    }
    public void loginPage() throws IOException {
        path = System.getProperty("user.dir")+"//src/test/java/TestData//TestData.xlsx";
        FileInputStream prop1 = null;
        try{
            prop1 = new FileInputStream(path);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String username = sheet.getRow(1).getCell(0).getStringCellValue();
        String  pwd = sheet.getRow(1).getCell(1).getStringCellValue();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys(username);
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys(pwd);
        driver.findElement(By.xpath("//div[@class='buttons']/button")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText(), "Dashboard");
    }
    public void logout()
    {

        driver.findElement(By.xpath("//*[contains(text(), 'Logout')]")).click();
    }
    public void listelement()
    {
        tabs = driver.findElements(By.tagName("a"));
        for(WebElement j :tabs)
        {
            String StrLinkTxt = j.getText();
            System.out.println(StrLinkTxt);
        }
    }
}


