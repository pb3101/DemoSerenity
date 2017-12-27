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

    @Given("user enters login page for mail search")
    public void givenUserOnLoginPage() {
        letterSearch.is_the_home_page();
    }

    @When("to able to search mail input correct username")
    public void entersCorrectUserName() {
        letterSearch.entersUserName();
    }

    @Then("for mail search submits username")
    public void clickButtonToSubmitUserName() {
        letterSearch.clickButtonToSubmitUserName();
    }

    @Then("enters valid password")
    public void entersIncorrectPassWord() {
        letterSearch.entersPassword();
    }

    @Then("to reach mailbox submit valid password")
    public void clickButtonToSubmitPassWord() {
        letterSearch.clickButtonToSubmitPassWord();
    }
//
//    @Then("take action to see profile")
//    public void clickMyAccountInfo(){letterSearch.clickAccountDropDown();}
//
//    @Then("verify login to mailbox")
//    public void verifyMyAccountInfo() {
//        letterSearch.verifyAccountLogined();
//    }

    @Then("search for letter")
    public void searchForLetter() {
        letterSearch.searchForLetter();
    }

    @Then("enters letter content")
    public void enterLetterContent() {
        letterSearch.clickOnLetter();
    }

    @Then("verify correctness of mail")
    public void verifyThatLetterAsExpected() {
        letterSearch.verifyLetterSubjectAndBody();
    }

    @Then("hits on profile dropdown")
    public void clickAccountDropDown() {
        letterSearch.clickAccountDropDown();
    }

    @Then("user click on logout button")
    public void clickButtonLogOut() {
        letterSearch.clickLogOut();
    }

}
