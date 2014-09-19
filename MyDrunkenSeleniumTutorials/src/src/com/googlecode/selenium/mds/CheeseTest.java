package com.googlecode.selenium.mds;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class CheeseTest {
    @Test
    public void searchForCheese() {
        System.setProperty("webdriver.chrome.driver", "my-drunken-selenium/lib/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        WebDriver driver = new ChromeDriver(options);
//        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        driver.get("http://www.google.co.uk");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("cheese");

//        WebElement searchIcon = driver.findElement(By.name("btnG"));
//        searchIcon.click();

        searchBox.submit();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.findElement(By.xpath())
        WebElement link = driver.findElement(By.partialLinkText("World's Greatest"));



//        try {
            //WebElement cheese = driver.findElement(By.partialLinkText("cheese.com"));
//            WebElement link = wait.until(textIsPresent("com - World's Greatest "));
            link.click();
            //cheese.click();
//        }catch (StaleElementReferenceException e) {
//            System.out.println("Attempting to recover from StaleElementReferenceException ...");
//        }

    }

//    private ExpectedCondition<WebElement> textIsPresent(final String text) {
//        return new ExpectedCondition<WebElement>() {
//            @Override
//            public WebElement apply(WebDriver driver) {
//                List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//                for (WebElement link : allLinks) {
//                    if (link.getText().contains(text)) {
//                        return link;
//                    }
//                }
//
//                return null;
//
//            }
//        };
//    }

}
