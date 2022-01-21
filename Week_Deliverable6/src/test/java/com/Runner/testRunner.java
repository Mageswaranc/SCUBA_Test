package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Automation\\6Deliverble\\src\\test\\java\\com\\Scuba\\cucumber\\Orange.feature",
glue= {"StepDefinition"})
public class testRunner {
	
}
	