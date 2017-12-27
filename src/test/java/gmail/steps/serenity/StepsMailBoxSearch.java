package gmail.steps.serenity;

import gmail.pages.LetterPage;
import gmail.pages.LoginPage;
import gmail.pages.MainPage;
import net.thucydides.core.annotations.Step;
import org.junit.experimental.theories.suppliers.TestedOn;

/**
 * Created by pavlo.balyuk on 12/20/2017.
 */
public class StepsMailBoxSearch {

    LoginPage loginPage;
    MainPage mainPage;
    LetterPage letterPage;

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
    public void clickAccountDropDown() {
        loginPage.click_dropdn_account();
    }

    @Step
    public void verifyAccountLogined() {
        loginPage.assertLoggedAccount(loginPage.getExpetcdedAccountURL());
    }

    @Step
    public void searchForLetter() {
        mainPage.ltr_Search(mainPage.gerLtr_Subject());
    }

    @Step
    public void clickOnLetter() {
        mainPage.ltr_Entry();
    }

    @Step
    public void verifyLetterSubjectAndBody() {
        letterPage.assertMailSubjectAndBody(letterPage.get_ltr_Subject_Text(), letterPage.getExp_Lrt_Body_Part());
    }

    @Step
    public void clickLogOut() {
        mainPage.click_btn_logOut();
    }
}
