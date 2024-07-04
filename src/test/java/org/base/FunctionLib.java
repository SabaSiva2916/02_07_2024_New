package org.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public void typeText(WebElement ele, String data) {
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement until = wt.until(ExpectedConditions.visibilityOf(ele));
		until.sendKeys(data);
	}

	public void btnClick(WebElement ele) {
		if (ele.isEnabled() && ele.isDisplayed()) {
			ele.click();
		}
	}

}
