package gmail.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Collection;


/**
 * Created by pavlo.balyuk on 12/1/2017.
 */
public class MainPage extends PageObject{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    private String ltr_Subject = "Three tips to get the most out of Gmail";

    @FindBy(how = How.XPATH, using = "//*[@id='gbqfq']")
    public static WebElementFacade src_Input;

    @FindBy(how = How.XPATH, using = "//a[contains(@title, 'Google Account')]")
    @CacheLookup
    public static WebElementFacade dropdn_account;

    @FindBy(how = How.LINK_TEXT, using = "Sign out")
    @CacheLookup
    public static WebElementFacade btn_logOut;

    @FindBy(how = How.XPATH, using = "//*[@id='gbqfb']")
    @CacheLookup
    public static WebElementFacade btn_Search;

    @FindBy(how = How.XPATH, using = "//span/b[contains(text(), 'Three')]/parent::span/../span[contains(text(), 'Three tips to get the most out of Gmail')]")
    public static WebElementFacade ltr_Entry;

    public String gerLtr_Subject(){
        return ltr_Subject;
    }

    public void ltr_Search(String ltr_Subject){
        src_Input.clear();
        src_Input.waitUntilClickable().sendKeys(ltr_Subject);
        btn_Search.waitUntilVisible().click();
    }
    public void ltr_Entry(){
        ltr_Entry.click();
    }

    public void click_btn_logOut(){
        btn_logOut.click();
    }
}
