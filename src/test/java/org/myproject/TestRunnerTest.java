package org.myproject;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("org.myproject")
@ConfigurationParameter(key = EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, summary, " +
        "html:target/report.html, json:target/cucumber.json, " +
        "progress:target/cucumber-progress.txt, " +
        "usage:target/cucumber-usage.json, rerun:target/rerun.txt, junit:target/cucumber-junit.xml")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "org.myproject,types,objects")
public class TestRunnerTest {

    //tags = "not @SmokeTest or @CardTest"
    //tags=  "@SmokeTest or @CardTest"
    //tags = "@SmokeTest and @RegressionTest"
}
