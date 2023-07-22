package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class QualityBrowserDriver {

   public QualityBrowserDriver (){
       PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
   }

   @FindBy(xpath = "//*[@class='mobile-nav-trigger']")
    public WebElement tabBar;

   @FindBy(xpath = "//*[@href='https://qualitydemy.com/login']")
    public WebElement LoginButton;

   @FindBy(xpath = "//*[text()='Provide your valid login credentials']")
    public WebElement loginTextControl;

   @FindBy(xpath = "//*[@type='email']")
    private WebElement emailBox;

   @FindBy(xpath = "//*[@type='password']")
    private WebElement passwordBox;

   @FindBy(xpath = "(//*[text()='Login'])[2]")
   private WebElement loginPageLoginButton;

   @FindBy(xpath = "//*[text()='Invalid login credentials']")
    private WebElement hatamesaji;


   public void loginHataliGirisKontrol(String mail,String sifre) throws InterruptedException {
       emailBox.sendKeys(ConfigReader.getProperty(mail));
       Thread.sleep(1000);
       passwordBox.sendKeys(ConfigReader.getProperty(sifre));
       Thread.sleep(1000);
       loginPageLoginButton.click();
       Thread.sleep(2000);
       Assert.assertTrue(hatamesaji.isDisplayed());
   }
   }


