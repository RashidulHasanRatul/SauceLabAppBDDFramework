package com.qa.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "src/test/java/com/qa/stepdef",
        plugin = {"pretty", "html:target/cucumber-reports","summary"},
        snippets=CAMELCASE,
        dryRun = true,
        monochrome = true

        //tags = "@smoke"

)

public class MyRunnerTest {


}
