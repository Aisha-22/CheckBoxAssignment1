package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //Check the first Checkbox and verify if it is successfully checked
        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected();
        //Checking if Checkbox is verified and is successfully checked
        System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());

        //Asserts in Selenium are used to validate the test cases. They help testers understand if tests have passed or failed.
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());

        Thread.sleep(3000);

        //Uncheck it again to verify if it is successfully Unchecked
        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected();
        //Checking if Checkbox is verified and is unsuccessfully checked
        System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());

        //Asserts in Selenium are used to validate the test cases. They help testers understand if tests have passed or failed.
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());

        //Count number of check boxes present in the page
        System.out.println(driver.findElements(By.cssSelector("input[type*='checkbox']")).size());
    }
}
