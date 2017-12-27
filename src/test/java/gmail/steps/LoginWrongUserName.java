package gmail.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmail.steps.serenity.StepsLoginWrongUserName;
import net.thucydides.core.annotations.Steps;


/**
 * Created by pavlo.balyuk on 12/1/2017.
 */
public class LoginWrongUserName {

   @Steps
   StepsLoginWrongUserName login;

   @Given("login page for incorrect username")
   public void givenUserOnLoginPage(){login.is_the_home_page();}

   @When("enters incorrect username")
   public void entersincorrectUserName() {
       login.entersUserName();
    }

   @Then("to get error submits username")
   public void clickButtonToSubmitUserName () {
        login.clickButtonToSubmitUserName();
    }

   @Then("see username error message")
   public void shouldSeeValidationError() {
       login.should_see_error_message();
    }
}
