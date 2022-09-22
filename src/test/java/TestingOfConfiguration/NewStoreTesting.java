package TestingOfConfiguration;

import PagesofConfiguartion.AddingNewStore;
import org.testng.annotations.Test;

import java.io.IOException;

public class NewStoreTesting extends BaseClass{
    @Test

    public void AddingNewStore() throws IOException
    {
        pageFactory.getLoginPageOfAdminDemo().loginPage();
        pageFactory.getAddingNewStore().addingNewStore();
        pageFactory.getLoginPageOfAdminDemo().logout();
    }
}
