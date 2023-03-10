package Stepdefinitions;

import Pages.DressesPage;
import Utilities.CommonMethods;
import io.cucumber.java.en.*;
import org.openqa.selenium.interactions.Actions;


public class HeaderTest extends CommonMethods {

    @Given("Navigate to hsn.com")
    public void navigate_to_hsn_com() {
        getDriver();
    }
    @When("user hovers on Fashion")
    public void user_hovers_on_fashion() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(header.getFasionTab()).perform();
    }
    @Then("user can see Apparel Text")
    public void user_can_see_apparel_text() throws InterruptedException {
        header.clickActivewreText();
    }

    @When("user enter item name in seach bar")
    public void user_enter_item_name_in_seach_bar() {
        header.searchItem();
    }
    @When("click search button")
    public void click_seach_button() {
        header.clickSearchButton();
    }
}
