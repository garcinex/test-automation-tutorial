package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.TestInitialization;

import java.time.LocalDate;
import java.time.LocalTime;

public class SystemInfoSteps {

    @Given("Test is initialized")
    public void testIsInitialized() {
        TestInitialization.init();
    }

    @Then("System date is printed")
    public void systemDateIsPrinted() {
        System.out.println(LocalDate.now().toString());
    }

    @Then("System time is printed")
    public void systemTimeIsPrinted() {
        System.out.println(LocalTime.now().toString());
    }

    @Then("OS is printed")
    public void osIsPrinted() {
        System.out.println(System.getProperty("os.name"));
    }

    @Then("Project localization is printed")
    public void projectLocalizationIsPrinted() {
        System.out.println(System.getProperty("user.dir"));
    }
}
