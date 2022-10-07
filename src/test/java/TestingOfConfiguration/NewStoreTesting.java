package TestingOfConfiguration;

import PagesofConfiguartion.AddingNewStore;
import org.testng.annotations.Test;

public class NewStoreTesting extends BaseClass{
    @Test
    public void AddingNewStore()
    {
        pageFactory.getLoginPageOfAdminDemo().loginPage();
        pageFactory.getAddingNewStore().addingNewStore();
        pageFactory.getLoginPageOfAdminDemo().logout();
    }
}
