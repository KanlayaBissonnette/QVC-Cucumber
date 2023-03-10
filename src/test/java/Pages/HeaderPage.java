package Pages;

import Utilities.CommonMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends CommonMethods {

    public HeaderPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'Fashion')][.//ancestor::*[@class='zHeaderV4_Nav']]")
    private WebElement fasionTab;

    @FindBy(xpath = "//a[@class='zHeader' and contains(text(),'Apparel')][.//ancestor::div[@id='hamburger-open']]")
    private WebElement apparel;

    @FindBy(xpath = "//a[contains(text(),'Activewear')][.//ancestor::div[@id='v4-storefront-FA']]")
    private WebElement activeware;

    @FindBy(xpath = "//*[@id='search-input']")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id='search-submit-proxy']")
    private WebElement searchButton;

    public WebElement getFasionTab() {
        return fasionTab;
    }

    public WebElement getApparel() {
        return apparel;
    }

    public void ApparelText() {
        apparel.click();
    }

    public void clickActivewreText() {
        activeware.click();
    }

    public void searchItem(){
       sendText(searchBar, "dress");
    }

    public void clickSearchButton(){
       searchButton.click();
    }





}
