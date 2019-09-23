package uk.co.automationTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.automationTest.waits.WebWaits;
import uk.co.automationTest.webControls.ClickControl;

public class HomePage extends BasePage {

    @FindBy(css = "div.header_user_info > a")
    private WebElement signIn = null;
    @FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(1) > a > span")
    private WebElement userAccount = null;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage goToLoginPage() {
        ClickControl.click(signIn);
        return PageFactory.initElements(webDriver, LoginPage.class);
    }

    public boolean validatePageTitle(String pageTitle) {
        return webDriver.getTitle().toLowerCase().contains(pageTitle.toLowerCase());
    }

    public boolean validateLogin(String user) {
        WebWaits.waitForTextToBePresent(userAccount, user);
        return userAccount.getText().toLowerCase().contains(user.toLowerCase());
    }
}
