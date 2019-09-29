package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User in on Netbanking landing page$")
    public void user_is_netbanking_landing_page(){

        //code to navigate to ogin url
        System.out.println("Navigate to login url");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() {

        //code to login
        System.out.println("Logged is successfully ");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated(){

        //home page validation
        System.out.println("Validated homepage");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed(){

        //validation he cards
        System.out.println("Validated cards");
    }

}
