package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utilities.Driver.getDriver;

public class DressesPage {
    public DressesPage() {
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Dresses']")
    private WebElement dressesHeaderText;


    public WebElement getDressesHeaderText(){
        return dressesHeaderText;
    }
}
