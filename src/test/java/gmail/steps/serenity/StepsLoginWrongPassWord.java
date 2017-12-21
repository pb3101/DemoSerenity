package gmail.steps.serenity;

import gmail.pages.LoginPage;
import net.thucydides.core.annotations.Step;

/**
 * Created by pavlo.balyuk on 12/19/2017.
 */
public class StepsLoginWrongPassWord {

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
        loginPage.setInpt_passWord(loginPage.getIncorrectPassWord());
    }

    @Step
    public void clickButtonToSubmitPassWord() {
        loginPage.click_btn_nextToPass();
    }

    @Step
    public void should_see_error_message() {
        loginPage.assertErrPassWordInput(loginPage.getErr_container_passWord());
    }
}
