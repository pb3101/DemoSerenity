package gmail.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmail.steps.serenity.StepsLoginCorrectUsernamePassword;
import gmail.steps.serenity.StepsMailBoxSearch;
import net.thucydides.core.annotations.Steps;

/**
 * Created by pavlo.balyuk on 12/1/2017.
 */
public class MailBoxSeacrch {


    @Steps
    StepsMailBoxSearch letterSearch;

    @Given("user enters login page")
    public void givenUserOnLoginPage() {
        letterSearch.is_the_home_page();
    }

    @When("the user enters incorrect username")
    public void entersCorrectUserName() {
        letterSearch.entersUserName();
    }

    @Then(" and submits username")
    public void clickButtonToSubmitUserName() {
        letterSearch.clickButtonToSubmitUserName();
    }

    @Then("the user enters incorrect password")
    public void entersIncorrectPassWord() {
        letterSearch.entersPassword();
    }

    @Then(" and submits password")
    public void clickButtonToSubmitPassWord() {
        letterSearch.clickButtonToSubmitPassWord();
    }

    @Then("user verify that he is logged in")
    public void verifyMyAccountInfo() {
        letterSearch.verifyAccountLogined();
    }

    @Then("")
    public void searchForLetter() {
        letterSearch.searchForLetter();
    }

    @Then("")
    public void enterLetterContent() {
        letterSearch.clickOnLetter();
    }

    @Then("")
    public void verifyThatLetterAsExpected() {
        letterSearch.verifyLetterSubjectAndBody();
    }

    @Then("user click on account dropdown")
    public void clickAccountDropDown() {
        letterSearch.clickAccountDropDown();
    }

    @Then("user click on account dropdown")
    public void clickButtonLogOut() {
        letterSearch.clickLogOut();
    }

}
