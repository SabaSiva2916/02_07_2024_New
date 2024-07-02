package org.testruner;

import org.base.CucumberReportingJVM;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Login.feature" }, glue = {
	"org.step" }, dryRun = false, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
		"html:C:\\Users\\sabas\\OneDrive\\Pictures\\FW07052024\\target\\fle.html",
		"json:C:\\Users\\sabas\\OneDrive\\Pictures\\FW07052024\\target\\fli.json",
		"junit:C:\\Users\\sabas\\OneDrive\\Pictures\\FW07052024\\target\\sampp.xml" })
public class TestRunner {

    @AfterClass
    public static void aaftCLass() {
	CucumberReportingJVM
		.generateReports("C:\\\\Users\\\\sabas\\\\OneDrive\\\\Pictures\\\\FW07052024\\\\target\\\\fli.json");
    }

}
