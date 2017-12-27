package gmail;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/mailbox_login_and_search/GmailLoginAndMailSearch.feature")
public class DefinitionTestSuite {}


//mvn verify