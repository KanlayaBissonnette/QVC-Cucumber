package Stepdefinitions;

import Utilities.CommonMethods;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DressesTest extends CommonMethods {

    @Then("Item text is displayed")
    public void item_text_is_displayed() {
        String expectedText = "Dresses";
        String actualText =  dresses.getDressesHeaderText().getText();
        Assert.assertEquals(expectedText, actualText);
    }
}
