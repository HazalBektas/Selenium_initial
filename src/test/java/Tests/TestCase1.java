package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilites.Driver;

import java.util.EventListener;

public class TestCase1 {

    /*
    Test Case 1: Validate Automation Exercise site logoGiven user navigates to “https://automationexercise.com/”
    Then user should see logo on top-left.
     */
public static void main(String[] args) {


    WebDriver driver = Driver.getDriver();

    driver.get("https://automationexercise.com/");

    if (driver.findElement(By.cssSelector("div[class='logo pull-left'] img")).isDisplayed()) System.out.println("PASSED");
    else System.out.println("FAILED");

    Driver.quitDriver();


}
}
