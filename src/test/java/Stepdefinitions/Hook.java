package Stepdefinitions;

import Utilities.CommonMethods;
import Utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;

public class Hook extends Driver {

    @
            Before
    public void setUp() {
        getDriver();
    }

    /*
     * !!! KEEP IT COMMENT UNTIL FINISH ALL TESTCASE !!!!
     * */

    @After
    public void destroy(Scenario scenario) {

        if (scenario.isFailed()) {
            CommonMethods.takeScreenshot("FAILED");
        }
        tearDown();
    }
}
