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

   @Given("user enters login page")
   public void givenUserOnLoginPage(){login.is_the_home_page();}

   @When("the user enters incorrect username")
   public void entersincorrectUserName() {
       login.entersUserName();
    }

   @Then(" and submits entry")
   public void clickButtonToSubmitUserName () {
        login.clickButtonToSubmitUserName();
    }

   @Then("they should see validation error")
   public void shouldSeeValidationError() {
       login.should_see_error_message();
    }
}
