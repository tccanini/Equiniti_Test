package uk.co.automationTest.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import uk.co.automationTest.browsers.WebDriverFactory;
import uk.co.automationTest.pages.*;

public class WorldHelper {

    private WebDriver driver = WebDriverFactory.getThreadedDriver();
    private static BasePage basePage = null;
    private static LoginPage loginPage = null;


    public BasePage getBasePage() {
        if (basePage != null) return basePage;
        return PageFactory.initElements(driver, BasePage.class);
    }

    public LoginPage getLoginPage() {
        if (loginPage != null) return loginPage;
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        return loginPage;
    }
}
