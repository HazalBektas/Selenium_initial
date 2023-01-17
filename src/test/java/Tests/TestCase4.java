package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilites.Driver;

public class TestCase4 {

    public static void main(String[] arg) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");
        String expectedFooter = "Copyright © 2021 All rights reserved";


        WebElement actualFooter = driver.findElement(By.cssSelector("p[class='pull-left']"));

        if (actualFooter.getText().equals(expectedFooter)) System.out.println("Footer validation PASSED");
        else System.out.println("Footer validation FAILED");

        Driver.quitDriver();
    }
}
