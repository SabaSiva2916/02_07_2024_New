package org.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

	public void typeTextByJs(WebElement ele, String data) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].setAttribute('value', '" + data + "')", ele);
	}

	public void btnClickByJs(WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", ele);
	}

	public void selectDropDown(WebElement ele, String option, String value) {
		Select se = new Select(ele);
		if (option.equals("index")) {
			se.selectByIndex(Integer.parseInt(value));
		} else if (option.equals("value")) {
			se.selectByValue(value);
		} else if (option.equals("text")) {
			se.selectByVisibleText(value);
		}

	}

}
