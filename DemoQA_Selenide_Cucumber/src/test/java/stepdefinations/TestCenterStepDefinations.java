package stepdefinations;
import io.cucumber.java.en.*;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.*;

public class TestCenterStepDefinations {
    TestCenterPage testCenterPage = new TestCenterPage();

    @When("click {string} button")
    public void click_button(String string) {
        switch (string) {
            case "Buttons" -> testCenterPage.myButtons.click();
            case "Click Me" -> testCenterPage.myClickMe.click();
            case "WebTables" -> testCenterPage.myWebTables.click();
            case "Add" -> testCenterPage.myAdd.click();
            case "Submit" -> testCenterPage.mySubmit.click();
            case "Edit" -> testCenterPage.myEdit.click();
            default -> {
            }
        }
    }

    @Then("check dynamic Click Message")
    public void check_dynamic_click_message() {
        testCenterPage.myDynamicClickMessage.shouldHave(text("You have done a dynamic click"));
//        testCenterPage.myDynamicClickMessage.shouldBe(visible);

    }
    @When("fill Registration Form")
    public void fill_registration_form() {
        testCenterPage.myFirstName.setValue("ayşe");
        testCenterPage.myLastName.setValue("can");
        testCenterPage.myEmail.setValue("ayse@can.com");
        testCenterPage.myAge.setValue("35");
        testCenterPage.mySalary.setValue("50000");
        testCenterPage.myDepartment.setValue("QA");
    }
    @Then("fix Registration Form")
    public void fix_registration_form() {
        testCenterPage.myFirstName.setValue("ayşegül");
        testCenterPage.myEmail.setValue("aysegul@can.com");
    }
}