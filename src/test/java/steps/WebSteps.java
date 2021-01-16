package steps;

import client.web.SeleniumDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import utils.TestInitialization;

import static org.testng.Assert.assertTrue;

public class WebSteps {

    private RemoteWebDriver driver;

    private static final String SEARCH_FIELD = "//input[@id=\"search_form_input_homepage\"]";
    private static final String SEARCH_BUTTON = "//input[@id=\"search_button_homepage\"]";

    @Given("Driver is initialized")
    public void initDriver() {
        TestInitialization.init();
        driver = SeleniumDriverManager.getChromeDriver();
    }

    @Given("I open {word} url")
    public void openSite(String site) {
        driver.get(site);
    }

    @Then("Tab title should contains {word}")
    public void tabTitleShouldContainsDuckDuckGo(String tabTitle) {
        assertTrue(driver.getTitle().contains(tabTitle), "Tab title is differ: " + driver.getTitle());
    }

    @And("Close Driver")
    public void closeDriver() {
        driver.quit();
    }

    @And("I put {} in a search field")
    public void iPutMeaningOfLifeInASearchField(String search) {
        driver.findElement(By.xpath(SEARCH_FIELD)).sendKeys(search);
    }

    @And("Press search button")
    public void pressSearchButton() {
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }

    @Then("I should find pages with {}")
    public void iShouldFindPagesWithMeaningOfLife(String text) {
        assertTrue(driver.getPageSource().contains(text), "Page don`t contains " + text);
    }
}

