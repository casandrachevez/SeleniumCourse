package Class6BDD;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/features"
        },
        glue = "Class6BDD/steps",
        plugin = {
                "pretty",
                "html:target/cucumber.html"
        },
        tags = "not @ignore"
)
public class Runner {

}