package TestingOfConfiguration;

import PagesofConfiguartion.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class SystemAlertTesting extends BaseClass
{
    @Test

    public void CatalogPage() throws IOException, InterruptedException {

        pageFactory.getLoginPageOfAdminDemo().loginPage();
        pageFactory.getSystemAlertPage().systemAlertPage();
        pageFactory.getLoginPageOfAdminDemo().logout();
    }
}


