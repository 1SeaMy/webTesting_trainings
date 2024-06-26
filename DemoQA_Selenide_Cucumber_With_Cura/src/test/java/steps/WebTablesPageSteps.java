package steps;

import common.PageManager;
import common.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTablesPageSteps {
    PageManager pageManager = new PageManager();
    ScenarioContext scenarioContext = new ScenarioContext();

    @When("fill Registration Form")
    public void fill_registration_form() {
        pageManager.webTablesPage.myFirstName.setValue("ayşe");
        pageManager.webTablesPage.myLastName.setValue("can");
        pageManager.webTablesPage.myEmail.setValue("ayse@can.com");
        pageManager.webTablesPage.myAge.setValue("35");
        pageManager.webTablesPage.mySalary.setValue("50000");
        pageManager.webTablesPage.myDepartment.setValue("QA");
    }
    @Then("fix Registration Form")
    public void fix_registration_form() {
        pageManager.webTablesPage.myFirstName.setValue("ayşegül");
        pageManager.webTablesPage.myEmail.setValue("aysegul@can.com");
    }
}