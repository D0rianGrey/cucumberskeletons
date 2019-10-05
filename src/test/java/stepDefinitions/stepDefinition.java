package stepDefinitions;

import PageObjects.CheckOutPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

@RunWith(Cucumber.class)
public class stepDefinition {
    public WebDriver driver;
    CheckOutPage checkOutPage;

    @Given("^User in on Netbanking landing page$")
    public void user_is_netbanking_landing_page() {

        //code to navigate to ogin url
        System.out.println("Navigate to login url");
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String login, String password) {
        System.out.println(login);
        System.out.println(password);
        System.out.println("Logged is successfully ");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {

        //home page validation
        System.out.println("Validated homepage");
    }

    @And("Cards displayed are \"([^\"]*)\"")
    public void cards_displayed_are(String string) {
        System.out.println(string);
        System.out.println("Validated cards");
    }

    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) {
        List<List<String>> object = data.raw();
        System.out.println(object.get(0).get(0));
        System.out.println(object.get(0).get(1));
        System.out.println(object.get(0).get(2));
        System.out.println(object.get(0).get(3));
        System.out.println(object.get(0).get(4));
    }

    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {

        System.out.println("deciding the browser to open");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered");

    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("Browser is started");

    }

}
