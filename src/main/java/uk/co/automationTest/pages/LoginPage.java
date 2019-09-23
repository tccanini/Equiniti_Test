package uk.co.automationTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import uk.co.automationTest.waits.WebWaits;
import uk.co.automationTest.webControls.ClickControl;
import uk.co.automationTest.webControls.RadioControl;
import uk.co.automationTest.webControls.TextFieldsControl;

import java.util.Random;

public class LoginPage extends BasePage {


    @FindBy(css = "#SubmitCreate > span")
    private WebElement createAccount = null;
    @FindBy(css = "#id_gender1")
    private WebElement title = null;
    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName = null;
    @FindBy(id = "customer_lastname")
    private WebElement customerLastName = null;
    @FindBy(id = "passwd")
    private WebElement customerPassword = null;
    @FindBy(id = "address1")
    private WebElement addressLine1 = null;
    @FindBy(id = "city")
    private WebElement customerCity = null;
    @FindBy(css = "#id_state")
    private WebElement customerState = null;
    @FindBy(id = "postcode")
    private WebElement postalCode = null;
    @FindBy(id = "id_country")
    private WebElement customerCountry = null;
    @FindBy(css = "#phone_mobile")
    private WebElement mobilePhone = null;
    @FindBy(id = "alias")
    private WebElement addressAlias = null;
    @FindBy(css = "#submitAccount > span")
    private WebElement register = null;

    @FindBy(xpath = "//a[@title='My wishlists']")
    private WebElement MyWishLists = null;
    @FindBy(xpath = "//a[@class='product-name']")
    private WebElement TopSeller = null;
    @FindBy(id = "wishlist_button")
    private WebElement AddToWishList = null;
    @FindBy(css = "\"#product > div.fancybox-overlay.fancybox-overlay-fixed > div > div > div > div > p\"")
    private WebElement AddedToWishList = null;


    private Random random = new Random();
    private String randomNo = Integer.toString(random.nextInt(100) + 1);
    @FindBy(id = "email_create")
    private WebElement emailCreate = null;
    private String emailAddress = "tester" + randomNo + "@testMail.com";

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage clickCreateAccountButton() {
        TextFieldsControl.enterText(emailCreate, emailAddress);
        ClickControl.click(createAccount);
        return this;
   }


    public HomePage createNewAccount(String firstName, String lastName, String password, String address1, String city, String state, String postcode, String country, String mobile, String alias) {
        WebWaits.waitForNoOfSeconds(5);
        RadioControl.clickButton(title);
        TextFieldsControl.enterText(customerFirstName, firstName);
        TextFieldsControl.enterText(customerLastName, lastName);
        TextFieldsControl.enterText(customerPassword, password);
        TextFieldsControl.enterText(addressLine1, address1);
        TextFieldsControl.enterText(customerCity, city);
        this.selectState(state);
        TextFieldsControl.enterText(postalCode, postcode);
        this.selectCountry(country);
        scrollToBottomOfPage();
        TextFieldsControl.enterText(mobilePhone, mobile);
        TextFieldsControl.enterText(addressAlias, alias);
        ClickControl.click(register);
        return PageFactory.initElements(webDriver, HomePage.class);
    }

    public void selectState(String state){
        Select select = new Select(customerState);
        select.selectByVisibleText(state);
    }

    public void selectCountry(String country){
        Select select = new Select(customerCountry);
        select.selectByVisibleText(country);
    }

}
