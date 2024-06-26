package stepdefinations;

import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.*;

public class CommonStepDefinations {
    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        open(string);
    }
    @Then("{int} sn bekler")
    public void sn_bekler(Integer int1) {
        sleep(int1*1000);
    }
    @Then("onceki sayfaya gider")
    public void onceki_sayfaya_gider() {
        back();
    }
    @Then("sonraki sayfaya gider")
    public void sonraki_sayfaya_gider() {
        forward();
    }
    @Then("sayfayi yeniler")
    public void sayfayi_yeniler() {
        refresh();
    }
    @Then("sayfayi acik tutar")
    public void sayfayi_acik_tutar() {
        Configuration.holdBrowserOpen=true;
    }
}
