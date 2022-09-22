package TestingOfConfiguration;

import PagesofConfiguartion.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.time.Duration;
import java.net.URL;
public class BaseClass
{
        protected static PageFactory pageFactory;
        public WebDriver driver;
        public String URL, Node;
        protected ThreadLocal<RemoteWebDriver> threadDriver = null;
        @Parameters("browserName")
        @BeforeTest

        public void setup(String browser) throws MalformedURLException
        {
            System.setProperty("webdriver.chrome.driver", "C://Users//SandeepKaur//chromedriver.exe");
            String Node = "http://10.10.30.190:4444/wd/hub";
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            driver = new RemoteWebDriver(new URL(Node), cap);
            driver.get("https://admin-demo.nopcommerce.com");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            pageFactory = new PageFactory(driver);
        }
        @AfterTest
        public void closeBrowser() {
            driver.quit();
        }
    }



