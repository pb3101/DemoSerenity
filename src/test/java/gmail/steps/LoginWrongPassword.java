package gmail.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmail.steps.serenity.StepsLoginWrongPassWord;
import net.thucydides.core.annotations.Steps;

/**
 * Created by pavlo.balyuk on 12/1/2017.
 */
public class LoginWrongPassword {


    @Steps
    StepsLoginWrongPassWord passWord;

    @Given("login for wrong password")
    public void givenUserOnLoginPage(){passWord.is_the_home_page();}

    @When("reach password input enters correct username")
    public void entersCorrectUserName() {
        passWord.entersUserName();
    }

    @Then("click username confirm button")
    public void clickButtonToSubmitUserName () {
        passWord.clickButtonToSubmitUserName();
    }

    @Then("the user enters wrong password")
    public void entersIncorrectPassWord () {
        passWord.entersPassword();
    }

    @Then("and submits form")
    public void clickButtonToSubmitPassWord () {
        passWord.clickButtonToSubmitPassWord();
    }

    @Then("see password validation error")
    public void shouldSeeValidationError() {
        passWord.should_see_error_message();
    }
}

