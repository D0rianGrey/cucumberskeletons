package stepDefinitions;

import PageObjects.CheckOutPage;
import PageObjects.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Cucumber.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base {
    public WebDriverWait wait;
    HomePage homePage;
    CheckOutPage checkOutPage;

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws IOException {
        driver = Base.getDriver();
    }

    @When("^User searched for (.+) Vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.getSearch().sendKeys(strArg1);
        Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"products-wrapper\"]//h4[@class=\"product-name\"]"))
                .getText().contains(strArg1));
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() {
        driver.findElement(By.xpath("//a[@class=\"increment\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"product-action\"]//button[@type=\"button\"]")).click();
        //driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();

    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class=\"cart-icon\"]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

    }

    @Then("^Verify selected (.+) items are displayed in Check out page$")
    public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) {
        checkOutPage = new CheckOutPage(driver);
        Assert.assertTrue(checkOutPage.getProductName().contains(strArg1));
        //Assert.assertTrue(driver.findElement(By.xpath("//p[@class=\"product-name\"]")).getText().contains(strArg1));
    }

}
