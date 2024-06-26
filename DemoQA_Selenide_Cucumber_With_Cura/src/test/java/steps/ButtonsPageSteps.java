package steps;

import common.PageManager;
import common.ScenarioContext;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Condition.*;

public class ButtonsPageSteps {
    PageManager pageManager = new PageManager();
    ScenarioContext scenarioContext = new ScenarioContext();

    @Then("check dynamic Click Message")
    public void check_dynamic_click_message() {
        pageManager.buttonsPage.myDynamicClickMessage.shouldHave(text("You have done a dynamic click"));
    }
}