package gmail.steps.serenity;

import gmail.pages.LoginPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by pavlo.balyuk on 12/20/2017.
 */
public class StepsLoginCorrectUsernamePassword {

    LoginPage loginPage;

    @Step
    public void is_the_home_page() {
        loginPage.open();
    }

    @Step
    public void entersUserName() {
        loginPage.setInpt_userName(loginPage.getCorrectUserName());
    }

    @Step
    public void clickButtonToSubmitUserName() {
        loginPage.click_btn_nextToUserName();
    }

    @Step
    public void entersPassword() {
        loginPage.setInpt_passWord(loginPage.getCorrectPassWord());
    }

    @Step
    public void clickButtonToSubmitPassWord() {
        loginPage.click_btn_nextToPass();
    }
    @Step
    public void clickAccountDropDown(){
        loginPage.click_dropdn_account();
    }
    @Step
    public void verifyAccountLogined(){
        loginPage.assertLoggedAccount(loginPage.getExpetcdedAccountURL());
    }
}
