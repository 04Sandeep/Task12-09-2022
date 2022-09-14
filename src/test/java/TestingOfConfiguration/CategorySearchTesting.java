package TestingOfConfiguration;

import org.testng.annotations.Test;

import java.io.IOException;

public class CategorySearchTesting extends BaseClass
{
    @Test

    public void CategoriesearchTesting() throws IOException ,InterruptedException {
        pageFactory.getLoginPageOfAdminDemo().loginPage();
        pageFactory.getCategorieSearchPage().categoriesSearchPage();
        pageFactory.getLoginPageOfAdminDemo().logout();
    }
}
