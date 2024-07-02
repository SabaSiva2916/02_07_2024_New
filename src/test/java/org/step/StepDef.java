package org.step;

import java.util.List;
import java.util.Map;

import org.base.FunctionLib;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDef extends FunctionLib {

    @Given("user is bookmyshow in chrome browser")
    public void userIsBookmyshowInChromeBrowser() {

    }

    @When("user enter {string} and {string}")
    public void userEnterAnd(String string, String string2) {

    }

    @When("user select a movie and goes for payment")
    public void userSelectAMovieAndGoesForPayment() {

    }

    @When("user click on login button")
    public void userClickOnLoginButton() {

    }

    @When("user select the paymeent options")
    public void userSelectThePaymeentOptions(io.cucumber.datatable.DataTable dataTable) {
	// Write code here that turns the phrase above into concrete actions
	// For automatic transformation, change DataTable to one of
	// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	// Double, Byte, Short, Long, BigInteger or BigDecimal.
	//
	// For other transformations you can register a DataTableType.
	// Without header
	List<List<String>> asLists = dataTable.asLists();
	List<String> list = asLists.get(2);
	String string = list.get(3);
	System.out.println(string);

	// With header
	List<Map<String, String>> asMaps = dataTable.asMaps();
	Map<String, String> map = asMaps.get(2);
	String string2 = map.get("Netbanking");
	System.out.println(string2);
    }

    @When("user confirm payment option")
    public void userConfirmPaymentOption() {

    }

}
