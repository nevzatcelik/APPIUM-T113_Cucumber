package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.QualityBrowserDriver;
import utilities.BrowserDriver;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class qualityDemyStepDefinitions {
    AndroidDriver<AndroidElement> driver=BrowserDriver.getBrowserDriver();
    QualityBrowserDriver qualityBrowserDriver=new QualityBrowserDriver();

    @Given("Kullanici qualitydemy sayfasina gider")
    public void kullanici_qualitydemy_sayfasina_gider() {
        BrowserDriver.getBrowserDriver().get("https://qualitydemy.com/");
    }
    @Given("Kullanici cookiesi kabul eder")
    public void kullanici_cookiesi_kabul_eder() {
 // 193,1704
        TouchAction touchAction=new TouchAction<>(driver);
        touchAction.press(PointOption.point(193,1704)).release().perform();
    }

    @Given("Ardin sol tarafdaki menuden login butonuna tiklayarak login sayfasin ulastigini dogrular")
    public void ardin_sol_tarafdaki_menuden_login_butonuna_tiklayarak_login_sayfasin_ulastigini_dogrular() throws InterruptedException {
        Thread.sleep(1000);
        qualityBrowserDriver.tabBar.click();
        Thread.sleep(2000);
         qualityBrowserDriver.LoginButton.click();
        Thread.sleep(1000);
        Assert.assertTrue(qualityBrowserDriver.loginTextControl.isDisplayed());
    }
    @Given("Kullanici yanlis degerlerden olusan bilgiler {string} {string} ile siteye giris yapamadigini dogrular")
    public void kullanici_yanlis_degerlerden_olusan_bilgiler_ile_siteye_giris_yapamadigini_dogrular(String mail,String sifre) throws InterruptedException {
     qualityBrowserDriver.loginHataliGirisKontrol(mail,sifre);
    }

    @Given("Kullanici browseri kapatir")
    public void kullanici_browseri_kapatir() {
       BrowserDriver.quitAppiumDriver();
    }
}
