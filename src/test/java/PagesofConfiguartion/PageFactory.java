package PagesofConfiguartion;

import org.openqa.selenium.WebDriver;
public class PageFactory
{
    WebDriver driver;

    private LoginPageOfAdminDemo loginPage;
    private AddingEmailNewAddressses addingNewEmail;
    private AddingNewStore addingNewStore;
    private CatalogPage catalogPage;
    private CategorieSearchPage categorieSearchPage;
    private SystemAlertPage systemAlertPage;
    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public LoginPageOfAdminDemo getLoginPageOfAdminDemo()
    {
        if (loginPage == null) {
            loginPage = new LoginPageOfAdminDemo(driver);
        }
        return loginPage;
    }

    public AddingEmailNewAddressses getAddingEmailNewAddressses()
    {
        if (addingNewEmail == null)
        {
           addingNewEmail = new AddingEmailNewAddressses(driver);
        }
        return addingNewEmail;
    }

    public AddingNewStore getAddingNewStore()
    {
        if (addingNewStore == null) {
            addingNewStore = new AddingNewStore(driver);
        }
        return addingNewStore;
    }

    public CatalogPage getCatalogPage()
    {
        if(catalogPage==null)
        {
            catalogPage = new CatalogPage(driver);
        }
        return catalogPage;
    }

    public CategorieSearchPage getCategorieSearchPage()
    {
        if(categorieSearchPage == null)
        {
            categorieSearchPage = new CategorieSearchPage(driver);
        }
        return categorieSearchPage;
    }

    public SystemAlertPage getSystemAlertPage()
    {
        if(systemAlertPage == null)
        {
            systemAlertPage = new SystemAlertPage(driver);
        }
        return systemAlertPage;
    }
}
