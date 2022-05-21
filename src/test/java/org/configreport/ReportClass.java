package org.configreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {

	public static void getJVMReport(String json) {
		
		
		File file = new File("C:\\Users\\sachi\\eclipse-workspace\\CucumberLearning\\target");
		Configuration config = new Configuration(file, "Sample Adacit Report");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Platform", "Win-11");
		List <String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder builder = new ReportBuilder(li, config);
		builder.generateReports();

	}
}
