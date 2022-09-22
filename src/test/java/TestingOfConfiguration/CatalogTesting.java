package TestingOfConfiguration;

import org.testng.annotations.Test;

import java.io.IOException;

public class CatalogTesting extends BaseClass
{
    @Test

    public void CatalogPage() throws IOException {

        pageFactory.getLoginPageOfAdminDemo().loginPage();
        pageFactory.getCatalogPage().catalogPage();
        pageFactory.getLoginPageOfAdminDemo().logout();
    }
}
