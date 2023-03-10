package Stepdefinitions;

import Utilities.CommonMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class HomePageTest extends CommonMethods {


    @Given("Navigate to qvc.com")
    public void navigate_to_qvc_com() {
        System.out.println("Open Browser");

    }
    @Then("Verify URL")
    public void verify_url() {
        String expURL = "https://www.qvc.com/";
        String actURL = getDriver().getCurrentUrl();
        Assert.assertEquals(expURL,actURL);


    }
}
