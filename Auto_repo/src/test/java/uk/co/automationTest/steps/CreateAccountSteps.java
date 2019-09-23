package uk.co.automationTest.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.automationTest.pages.HomePage;
import uk.co.automationTest.pages.LoginPage;
import uk.co.automationTest.support.WorldHelper;
import uk.co.automationTest.utilities.TestData;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CreateAccountSteps {

    private WorldHelper helper;
    private LoginPage loginPage;
    private HomePage homePage;

    public CreateAccountSteps(WorldHelper helper) {
        this.helper = helper;
    }

    @Given("^I am on the autoPractice Page$")
    public void iAmOnTheAutoPracticePage() {
        homePage = helper.getBasePage().goToHomePage();

    }

    @When("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        loginPage = homePage.goToLoginPage();

    }

    @And("^I enter required details for account creation$")
    public void iEnterRequiredDetailsForAccountCreation(DataTable dataTable) {
        List<List<String>> fieldOption = dataTable.raw();
        String firstName = TestData.getValue(fieldOption.get(1).get(1));
        String lastName = TestData.getValue(fieldOption.get(2).get(1));
        String password = TestData.getValue(fieldOption.get(3).get(1));
        String address1 = TestData.getValue(fieldOption.get(4).get(1));
        String city = TestData.getValue(fieldOption.get(5).get(1));
        String state = TestData.getValue(fieldOption.get(6).get(1));
        String postcode = TestData.getValue(fieldOption.get(7).get(1));
        String country = TestData.getValue(fieldOption.get(8).get(1));
        String mobile = TestData.getValue(fieldOption.get(9).get(1));
        String alias = TestData.getValue(fieldOption.get(10).get(1));
       loginPage.clickCreateAccountButton().createNewAccount(firstName, lastName, password, address1, city, state, postcode, country, mobile, alias);
    }

    @Then("^I should be able to successfully create an account with \"([^\"]*)\" displayed at the top page$")
    public void iShouldBeAbleToSuccessfullyCreateAnAccountWithDisplayedAtTheTopPage(String firstName){
        firstName = TestData.getValue(firstName);
        assertThat(homePage.validateLogin(firstName), is(true));
    }

    @And("^I should be navigated to \"([^\"]*)\" page$")
    public void iShouldBeNavigatedToPage(String pageTitle){
        homePage.validatePageTitle(pageTitle);
        assertThat(homePage.validatePageTitle(pageTitle), is(true));
    }
}


