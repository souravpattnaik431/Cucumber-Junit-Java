package cucumberOptions;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("src/test/java/stepDefinations")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/report.html")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "src/test/java/stepDefinations")
public class TestRunnerTest {

    //tags = "not @SmokeTest or @CardTest"
    //tags=  "@SmokeTest or @CardTest"
    //tags = "@SmokeTest and @RegressionTest"
}
