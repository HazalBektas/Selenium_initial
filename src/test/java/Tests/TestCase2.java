package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilites.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCase2 {

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");


        ArrayList<String> expectedElements = new ArrayList<>(Arrays.asList("Home", "Products", "Cart", "Signup / Login", "Test Cases",
                "API Testing", "Video Tutorials", "Contact us"));

        List<WebElement> actualElements = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));
        int e = 1;
        for (int i = 0; i < actualElements.size(); i++) {
            System.out.println("Header " + e + " displayed: " + actualElements.get(i).isDisplayed());
            System.out.println("Header " + e + " enabled: " + actualElements.get(i).isEnabled());
            System.out.println("Actual text of the header " + e + " matching expected text: "
                    + actualElements.get(i).getText().equals(expectedElements.get(i)));
            System.out.println("==============");
            e++;


        }
        Driver.quitDriver();


    }
}
