package uk.co.automationTest.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver webDriver;


    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage goToHomePage() {
        return PageFactory.initElements(webDriver, HomePage.class);
    }

    public void scrollToBottomOfPage() {
        ((JavascriptExecutor) webDriver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
