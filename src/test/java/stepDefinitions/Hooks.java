package stepDefinitions;

import Cucumber.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks extends Base {

    @Before("@MobileTest")
    public void beforeValidation() {
        System.out.println("Mobile before hook");
    }

    @After("@MobileTest")
    public void afterValidation() {
        System.out.println("After Mobile hook");
    }

    @After("@SeleniumTest1")
    public void afterSeleniumTest() {
        driver.close();
    }

}
