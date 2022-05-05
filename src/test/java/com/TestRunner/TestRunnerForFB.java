package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"AllFeatureFile/Facebook.feature"},
		glue= {"com.StepDefination"},
		monochrome = true,
		dryRun = false,
		plugin = {"html:target/FB.html","json:target/FB.json","junit:target/FB.xml","pretty:target/FB.txt","pretty:target/FB.pdf"}
		)
public class TestRunnerForFB {

}
