package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
public class TestCenterPage {
    public SelenideElement kullName=$(By.id("exampleInputEmail1"));
    public SelenideElement kullPass=$("#exampleInputPassword1");
    public SelenideElement submitButton=$(By.xpath("//button[@type='submit']"));
    public SelenideElement loginMessage=$(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));
    public SelenideElement checkbox1=$(By.id("box1"));
    public SelenideElement checkbox2=$(By.id("box2"));
    public SelenideElement red=$(By.id("red"));
    public SelenideElement football=$(By.id("football"));

}
