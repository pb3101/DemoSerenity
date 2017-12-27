package gmail.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by pavlo.balyuk on 12/8/2017.
 */
public class LetterPage {
    private String exp_Ltr_Subject = "Three tips to get the most out of Gmail";
    private String exp_Lrt_Body_Part = "Bring your contacts and mail into Gmail";

    public LetterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Three')]//ancestor::h2")
    private static WebElementFacade ltr_Subject;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Bring your contacts and mail into ') and span[contains(text(), 'Gmail')]]")
    private static WebElementFacade lrt_Body_Part;

    public String get_ltr_Subject_Text() {
        return ltr_Subject.getText();
    }

    public String get_ltr_Body_Part_Text() {
        return lrt_Body_Part.getText();
    }

    public String getExp_Ltr_Subject() {
        return exp_Ltr_Subject;
    }

    public String getExp_Lrt_Body_Part() {
        return exp_Lrt_Body_Part;
    }

    public void assertMailSubjectAndBody(String ltr_Subject, String lrt_Body_Part) {
        Assert.assertTrue((ltr_Subject.contains(getExp_Ltr_Subject())) && (lrt_Body_Part.contains(getExp_Lrt_Body_Part())));
    }
}