package gmail.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmail.steps.serenity.StepsLoginCorrectUsernamePassword;
import net.thucydides.core.annotations.Steps;

/**
 * Created by pavlo.balyuk on 12/4/2017.
 */

public class LoginToMailBox {


    @Steps
    StepsLoginCorrectUsernamePassword correctLogin;

    @Given("user enters login page")
    public void givenUserOnLoginPage(){correctLogin.is_the_home_page();}

    @When("the user enters correct username")
    public void entersCorrectUserName() {
        correctLogin.entersUserName();
    }

    @When("and submits username")
    public void clickButtonToSubmitUserName () {
        correctLogin.clickButtonToSubmitUserName();
    }

    @When("the user enters correct password")
    public void entersIncorrectPassWord () {
        correctLogin.entersPassword();
    }

    @When("and submits password")
    public void clickButtonToSubmitPassWord () {
        correctLogin.clickButtonToSubmitPassWord();
    }

    @When("user click on account dropdown")
    public void clickAccountDropDown() {
        correctLogin.clickAccountDropDown();
    }

    @Then("user verify that he is logged in")
    public void verifyMyAccountInfo() {
        correctLogin.verifyAccountLogined();
    }
}

