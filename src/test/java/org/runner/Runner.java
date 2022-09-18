package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/org/features",
		glue={"org.stepDef","org.utils"},
		tags= "@Imdb or @Wiki",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty"}
		)
public class Runner {

}
