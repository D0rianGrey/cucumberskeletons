package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    public WebDriver driver;

    public CheckOutPage(WebDriver driver){
        this.driver = driver;
    }

    By productName = By.xpath("//p[@class=\"product-name\"]");

    public String getProductName(){
        return driver.findElement(productName).getText();
    }

}
