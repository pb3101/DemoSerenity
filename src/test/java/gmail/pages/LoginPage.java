package gmail.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


/**
 * Created by pavlo.balyuk on 12/2/2017.
 */
@DefaultUrl("http://gmail.com")
public class LoginPage extends PageObject {

    private String expectedURL = "https://myaccount.google.com/?utm_source=OGB&utm_medium=act";

    @FindBy(how = How.CSS, using = "#identifierId")
    @CacheLookup
    private static WebElementFacade inpt_userName;

    @FindBy(how = How.XPATH, using = "//div[@id=\"password\"]//input")
    private static WebElementFacade inpt_passWord;

    @FindBy(how = How.CSS, using = "#identifierNext")
    @CacheLookup
    private static WebElementFacade btn_nextToUserName;

    @FindBy(how = How.CSS, using = "#passwordNext")
    private static WebElementFacade btn_nextToPass;

    @FindBy(how = How.XPATH, using = "//a[contains(@title, 'Google Account')]")
    @CacheLookup
    private static WebElementFacade dropdn_account;

    @FindBy(xpath = "//*[contains(concat( ' ', @class, ' ' ), concat( ' ', 'RxsGPe', ' ' ))]")
    private static WebElementFacade err_container;

    @FindBy(how = How.XPATH, using = "//a[contains(@href, 'https://myaccount.google.com/?utm_source=OGB&utm_medium=act')]")
    private static WebElementFacade acc_Email;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setInpt_userName(String userName) {
        inpt_userName.waitUntilVisible().clear();
        inpt_userName.sendKeys(userName);
    }

    public void click_btn_nextToUserName() {
        btn_nextToUserName.click();
    }

    public void setInpt_passWord(String passWord) {
        inpt_userName.waitUntilVisible().clear();
        inpt_userName.sendKeys(passWord);
    }

    public void click_btn_nextToPass() {
        btn_nextToPass.waitUntilVisible().waitUntilClickable();
        btn_nextToPass.click();
    }

    public void click_dropdn_account() {
        dropdn_account.click();
    }

    public String getAcc_Email() {
        return acc_Email.getAttribute("href");
    }

    public String getErr_text() {
        return err_container.getText();
    }
    public String getErr_container_userName(){
        String err_container_userName = "Couldn't find your Google Account";
        return err_container_userName;
    }
    public String getErr_container_passWord(){
        String err_container_passWord = "Wrong password. Try again or click Forgot password to reset it.";
        return err_container_passWord;
    }
    public String getIncorrectUserName(){
        String incorrectUserName = "incorrectUserName";
        return incorrectUserName;
    }
    public String getCorrectUserName(){
        String incorrectUserName = "webdriver2018";
        return incorrectUserName;
    }
    public String getIncorrectPassWord(){
        String incorrectPassWord = "incorrectPassword";
        return incorrectPassWord;
    }
    public String getCorrectPassWord(){
        String incorrectPassWord = "2018webdriver";
        return incorrectPassWord;
    }
    public String getExpetcdedAccountURL(){
        String expectedURL = "https://myaccount.google.com/?utm_source=OGB&utm_medium=act";
        return expectedURL;
    }


    public void assertLoggedAccount(String expectedURL) {
        Assert.assertTrue(getAcc_Email().equals(expectedURL));
    }

    public void assertErrUserNameInput(String err_container_userName) {
        Assert.assertTrue(getErr_text().contains(err_container_userName));
    }

    public void assertErrPassWordInput(String err_container_passWord) {
        Assert.assertTrue(getErr_text().contains(err_container_passWord));
    }
}
