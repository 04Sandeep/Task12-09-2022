package TestingOfConfiguration;

import org.testng.annotations.Test;

import java.io.IOException;

import static TestingOfConfiguration.BaseClass.pageFactory;

public class LoginTesting extends BaseClass {
    @Test

        public void LoginPageOfAdminDemo() throws IOException
    {
            pageFactory.getLoginPageOfAdminDemo().loginPage();
        }
    }

