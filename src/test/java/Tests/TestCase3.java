package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilites.Driver;

public class TestCase3 {

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com");

        //Assert.assertTrue(driver.findElement(By.cssSelector("div[class='single-widget']>h2")).isDisplayed();

        WebElement h2Subscription = driver.findElement(By.cssSelector("div[class='single-widget']>h2"));

        if (h2Subscription.isDisplayed()) System.out.println("PASSEDASSED");
        else System.out.println(" H2subscription validation FAILED");

        if (h2Subscription.getText().equals("SUBSCRIPTION"))
            System.out.println("H2 subscription text validation PASSED");
        else System.out.println("H2 subscription text validation FAILED");

        WebElement emailInputPlaceholder = driver.findElement(By.id("susbscribe_email"));

        if (emailInputPlaceholder.isDisplayed()) System.out.println(" email placeholder validation PASSED");
        else System.out.println(" email placeholder validation FAILED");

        if (emailInputPlaceholder.getAttribute("placeholder").equals("Your email address"))
            System.out.println(" Place holder attribute validation PASSED");
        else System.out.println("Place holder attribute validation FAILED");

        WebElement subscribeButton = driver.findElement(By.id("subscribe"));

        if (subscribeButton.isDisplayed()) System.out.println("Subscribe button validation PASSED");
        else System.out.println(("Subscribe button validation FAILED"));

        WebElement textUnderSubscribeBox = driver.findElement(By.xpath("//div[@class='single-widget']//p"));

        if (textUnderSubscribeBox.isDisplayed())
            System.out.println("The " + textUnderSubscribeBox.getText() + " text validation PASSED");
        else System.out.println("The" + textUnderSubscribeBox.getText() + " text validation FAILED");


        Driver.quitDriver();
    }


}
