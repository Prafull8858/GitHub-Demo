package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"AllFeatureFile//OrangeHRM.feature"},
		glue = {"com.StepDefination"},
		monochrome=true,
		dryRun=false
		)
public class OrangeHRMTestRunner {

}
