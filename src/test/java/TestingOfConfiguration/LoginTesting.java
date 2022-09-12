package TestingOfConfiguration;

import org.testng.annotations.Test;

import static TestingOfConfiguration.BaseClass.pageFactory;

public class LoginTesting extends BaseClass {
    @Test

        public void LoginPageOfAdminDemo()
        {
            pageFactory.getLoginPageOfAdminDemo().loginPage();
        }
    }

