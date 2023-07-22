package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


/*@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = {"src/test/resources/features","src/test/resources/ApiFeatures"}, // Birden fazla FEATURES path uzantisini bu sekilde suslu parantez icerisine alarak calistirabiliriz
        glue = "",
        tags = "@t113 or @t115", // Bu bolumde biz eger ki birden fazla seneryo ya da feature dosyasi calistirmak istiyorsak tag bolumunden 2. bir tag i ekleyerek bu islemi gerceklestirebiliriz
        dryRun =false
)
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@qd",
        dryRun =false
        // eger features dosyamizin icerisinde eksik bir adim varsa o adimin methpodunu olusturmasi icin dryRun i true yapariz
        // Eger eksik adim varsa true iken bize adimlari verecektir. Eger ki eksik adim yoksa bize test passed.FAKAT BU SADECE EKSIK ADIM YOK DEMEKTIR TESTIN GERCEK ANLAMDA PASSED OLDUGU ANLAMINA GELMEZ
        // Eger eksik adimimiz yoksa ve testlerimizi kosturmak istiyorsak false yaparak test sonuclarimizin passed ya da failed oldugunu gorebiliriz
)
public class Runner

{


}
