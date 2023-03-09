package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/report.html",
                "json:target/cucumber.json"
        },
        features= "src/test/resources/features/home.feature",
        glue = "Stepdefinitions",
        monochrome = true,
        dryRun = false
        //,tags = ""
)







public class Runner {

}
