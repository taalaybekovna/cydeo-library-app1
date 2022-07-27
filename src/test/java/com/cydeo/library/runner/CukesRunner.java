    package com.cydeo.library.runner;

    import io.cucumber.junit.Cucumber;
    import io.cucumber.junit.CucumberOptions;
    import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "pretty", //this is extra information, it's not necessary. It will show colorful explanation
                    "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber" //this is taken from official page
            },
            features = "src/test/resources/features",
            glue = "com/cydeo/library/step_definitions",
            dryRun = true,
            tags ="@librarian"
    )

    public class CukesRunner {
    }
