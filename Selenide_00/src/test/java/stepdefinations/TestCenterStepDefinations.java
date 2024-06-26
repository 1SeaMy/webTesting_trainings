package stepdefinations;
import io.cucumber.java.en.*;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.*;

public class TestCenterStepDefinations {
    TestCenterPage testCenterPage = new TestCenterPage();
    @Then("Username gir")
    public void username_gir() {
        testCenterPage.kullName.setValue("techproed");
    }
    @Then("Password gir")
    public void password_gir() {
        testCenterPage.kullPass.setValue("SuperSecretPassword");
    }
    @When("Submit tikla")
    public void submit_tikla() {
        testCenterPage.submitButton.click();
    }
    @Then("giris yapildigini test et")
    public void giris_yapildigini_test_et() {
        testCenterPage.loginMessage.shouldBe(visible);
    }
    @And("{string} secili degilse sec")
    public void seciliDegilseSec(String text) {
        if(text.equals("Checkbox 1") && !testCenterPage.checkbox1.isSelected()){
            testCenterPage.checkbox1.click();
            testCenterPage.checkbox1.shouldBe(checked);
        }
        if (text.equals("Checkbox 2") && !testCenterPage.checkbox2.isSelected()){
            testCenterPage.checkbox2.shouldNotBe(checked);
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }
        if (text.equals("Red") && !testCenterPage.red.isSelected()){
            testCenterPage.red.shouldNotBe(checked);
            testCenterPage.red.click();
            testCenterPage.red.shouldBe(checked);
        }
        if (text.equals("Football") && !testCenterPage.football.isSelected()){
            testCenterPage.football.shouldNotBe(checked);
            testCenterPage.football.click();
            testCenterPage.football.shouldBe(checked);
        }

    }
}
