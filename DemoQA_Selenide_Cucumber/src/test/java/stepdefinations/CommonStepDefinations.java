package stepdefinations;

import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.*;

public class CommonStepDefinations {
    @Given("open {string} page")
    public void open_page(String string) {
        open(string);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @Then("wait {int} seconds")
    public void wait_seconds(Integer int1) {
        sleep(int1 * 1000);
    }

}
