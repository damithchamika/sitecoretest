package com.sitecore.automation.testStepDefinition;

import com.Agorial.automation.seleniumpages.LoginPage;
import com.Agorial.automation.seleniumpages.SearchProductPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class searchStepDefinition {
    LoginPage loginPage = new LoginPage();
    SearchProductPage searchProductPage = new SearchProductPage();

    @Given("^user navigates to the website amazon$")
    public void user_navigates_to_the_website_amazon() throws Throwable {
        loginPage.launchChromeBrowser();
    }

    @Then("^type \"([^\"]*)\" in the search textbox$")
    public void type_in_the_search_textbox(String arg1) throws Throwable {
        searchProductPage.enterProduct(arg1);
    }

    @Then("^click on search button$")
    public void click_on_search_button() throws Throwable {
        searchProductPage.clickSearch();
    }

    @Then("^click on first results$")
    public void click_on_first_results() throws Throwable {
        searchProductPage.clickFirstProduct();
    }

    @Then("^assert that the laptop price$")
    public void assert_that_the_laptop_price() throws Throwable {
        Assert.assertTrue("Product Price less than 100", searchProductPage.assertPrice());
    }

}
