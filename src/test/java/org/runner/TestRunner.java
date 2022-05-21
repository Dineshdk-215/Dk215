package org.runner;

import org.configreport.ReportClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src\\test\\resources\\Cucumber.feature" }, glue = {"org.stepdef"}, snippets=SnippetType.CAMELCASE, plugin = {"pretty", "C:\\Users\\sachi\\eclipse-workspace\\CucumberLearning\\target\\sample.json"})

public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
    ReportClass.getJVMReport("C:\\Users\\sachi\\eclipse-workspace\\CucumberLearning\\target\\sample.json");
	}
	

	
}




