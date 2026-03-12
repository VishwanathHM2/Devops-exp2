package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class WebpageTest{

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://raushankumarbaitha.github.io/ex2DE/");
    }

    @Test
    public void titleValidationTest() {

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        String expectedTitle = "My Simple Website";

        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(actualTitle.contains("Website"));
    }

    @AfterTest
    public void closeBrowser() {

        driver.quit();
    }
}