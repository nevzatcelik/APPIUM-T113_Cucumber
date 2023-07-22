package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.BrowserDriver;

public class BrowserStep {

    @Given("Kullanici browserDriver kurulumlarini gerceklestirir")
    public void kullanici_browser_driver_kurulumlarini_gerceklestirir() {
        BrowserDriver.getBrowserDriver();
    }
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
     BrowserDriver.getBrowserDriver().get("https://www.amazon.com");
    }

}
