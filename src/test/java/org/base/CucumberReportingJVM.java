package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class CucumberReportingJVM {

    public static void generateReports(String json) {

	// File location --> provide location to store the report
	File file = new File("C:\\Users\\sabas\\OneDrive\\Pictures\\FW07052024\\target");

	// Configuration --> c from net.masterthrough

	Configuration con = new Configuration(file, "SampleReport");
	// We can add extra data by using configuration class
	con.addClassifications("Browser Type", "Chrome");
	con.addClassifications("Platform", "Win-11");
	con.addClassifications("Sprint No", "12");
	con.addClassifications("Environment", "UAT");

	List<String> li = new ArrayList<String>();
	// Adding json file to list
	li.add(json);

	// Based on LIst and confi --> we are going to get a report

	ReportBuilder build = new ReportBuilder(li, con);
	build.generateReports();

    }

}
