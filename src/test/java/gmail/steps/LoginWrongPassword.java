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

    @Given("user enters login page")
    public void givenUserOnLoginPage(){passWord.is_the_home_page();}

    @When("the user enters incorrect username")
    public void entersCorrectUserName() {
        passWord.entersUserName();
    }

    @Then(" and submits username")
    public void clickButtonToSubmitUserName () {
        passWord.clickButtonToSubmitUserName();
    }

    @Then("the user enters incorrect password")
    public void entersIncorrectPassWord () {
        passWord.entersPassword();
    }

    @Then(" and submits password")
    public void clickButtonToSubmitPassWord () {
        passWord.clickButtonToSubmitPassWord();
    }

    @Then("they should see validation error")
    public void shouldSeeValidationError() {
        passWord.should_see_error_message();
    }
}

