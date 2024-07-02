package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionLib {

    public static WebDriver driver;

    public static WebDriver getDriver() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	return driver;
    }

    public void launchUrl(String url) {
	driver.get(url);
    }

}
