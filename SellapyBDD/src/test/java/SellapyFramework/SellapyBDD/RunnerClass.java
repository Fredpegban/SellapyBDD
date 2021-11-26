package SellapyFramework.SellapyBDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
format = { "pretty", "html: target/report.html, junit:junit_xml/cucumber.xml"
				
		},
		features="AdminLogin.feature", monochrome = true, dryRun = false, strict=true)
		
		



public class RunnerClass {
	

}
