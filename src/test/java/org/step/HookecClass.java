package org.step;

import org.base.FunctionLib;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookecClass extends FunctionLib {

    @Before
    public void beforeScenario() {
//	getDriver();
//	launchUrl("https://www.facebook.com/");

    }

    @After
    public void afterscen(Scenario s) {
	if (s.isFailed()) {

	    TakesScreenshot ts = (TakesScreenshot) driver;
	    byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
	    // To attach the screenshto to the report
	    s.attach(screenshotAs, "png", s.getName());

	}

    }

}
