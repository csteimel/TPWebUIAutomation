package com.googlecode.selenium.mds;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by coreysteimel on 9/15/14.
 */
public class Utils {


    static WebDriver driver;

    @Before
    public void setUp() throws Exception {

        //Open Chrome and go to home.trainingpeaks
        System.setProperty("webdriver.chrome.driver", "my-drunken-selenium/lib/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        driver = new ChromeDriver(options);
        String baseUrl = "http://home.trainingpeaks.com/";
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        driver.get(baseUrl);

    }

    public void loginTest(String userNameValue, String passWordValue) throws Exception {

        //click login
        WebElement loginButton = driver.findElement(By.xpath("//a[text()='Log in']"));
        loginButton.click();

        //enter username
        WebElement userNameTextField = driver.findElement(By.id("Username"));
        userNameTextField.sendKeys(userNameValue);

        //enter password
        WebElement passWordTextField = driver.findElement(By.id("Password"));
        passWordTextField.sendKeys(passWordValue);

        //click submit
        WebElement submitBtn = driver.findElement(By.id("btnSubmit"));
        submitBtn.click();
    }



}
