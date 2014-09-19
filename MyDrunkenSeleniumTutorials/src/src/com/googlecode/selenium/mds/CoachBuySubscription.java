package com.googlecode.selenium.mds;

import org.apache.bcel.generic.Select;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

/**
 * Created by coreysteimel on 9/11/14.
 */
public class CoachBuySubscription {
    @Test
    public void testCoachBuySubscription() {

        //Open Chrome and go to home.trainingpeaks
        System.setProperty("webdriver.chrome.driver", "my-drunken-selenium/lib/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        WebDriver driver = new ChromeDriver(options);
        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        driver.get("https://cat6.dev.trainingpeaks.com/account-professional-edition.aspx");

        //Random String Generator
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();

        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        //Coach Trial Info

        //Enter First Name
        String firstName = "Corey";
        WebElement firstNameTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtFirstName"));
        firstNameTextBox.sendKeys(firstName);

        //Enter Last Name
        String lastName = "SeleniumDev" + sb;
        WebElement lastNameTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtLastName"));
        lastNameTextBox.sendKeys(lastName);

        //Enter City
        String cityName = "Boulder";
        WebElement cityNameTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtCity"));
        cityNameTextBox.sendKeys(cityName);

        //Click Country List Drop Down
        WebElement countryDropDown = driver.findElement(By.id("ProfessionalAccount_9_ddCountry"));
        countryDropDown.click();

        //Select US
        org.openqa.selenium.support.ui.Select dropdown = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ProfessionalAccount_9_ddCountry")));
        dropdown.selectByValue("US");

        //Enter Phone
        String phoneNumber = "555 555 5555";
        WebElement phoneNumberTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtPhone"));
        phoneNumberTextBox.sendKeys(phoneNumber);

        //Enter User Name
        String userName = firstName + lastName;
        WebElement userNameTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtUserName"));
        userNameTextBox.sendKeys(userName);

        //Enter Password
        String passWord = "password";
        WebElement passWordTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtPassword"));
        passWordTextBox.sendKeys(passWord);

        //Confirm Password
        WebElement passWordConfirmTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtPasswordConfirm"));
        passWordConfirmTextBox.sendKeys(passWord);

        //Enter Email
        String emailAddress = "corey@peaksware.com";
        WebElement emailAddressTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtEmail"));
        emailAddressTextBox.sendKeys(emailAddress);

        //Confirm Email
        WebElement emailAddressConfirmTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtEmailConfirm"));
        emailAddressConfirmTextBox.sendKeys(emailAddress);

        //Click Primary Certification
        WebElement primaryCertificationDropDown = driver.findElement(By.id("ProfessionalAccount_9_ddCertification"));
        primaryCertificationDropDown.click();

        //Select British Cycling 1
        org.openqa.selenium.support.ui.Select dropdownCert = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ProfessionalAccount_9_ddCertification")));
        dropdownCert.selectByValue("4");

        //Click Primary Interest
        WebElement primaryInterestDropDown = driver.findElement(By.id("ProfessionalAccount_9_ddInterest"));
        primaryInterestDropDown.click();

        //Select Endurance
        org.openqa.selenium.support.ui.Select dropdownInterest = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ProfessionalAccount_9_ddInterest")));
        dropdownInterest.selectByValue("Endurance");

        //Enter Credit Card Number
        String creditCardNumber = "4809248974388639";
        WebElement creditCardNumberTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtCCNumber"));
        creditCardNumberTextBox.sendKeys(creditCardNumber);

        //Enter cvv
        String cvvNumber = "123";
        WebElement cvvTextBox = driver.findElement(By.id("ProfessionalAccount_9_txtCVV2"));
        cvvTextBox.sendKeys(cvvNumber);

        //Click Month Drop Down
        WebElement monthDropDown = driver.findElement(By.id("ProfessionalAccount_9_ddExpMonth"));
        monthDropDown.click();

        //Select January
        org.openqa.selenium.support.ui.Select dropdownMonth = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ProfessionalAccount_9_ddExpMonth")));
        dropdownMonth.selectByValue("01");

        //Click Year Drop Down
        WebElement yearDropDown = driver.findElement(By.id("ProfessionalAccount_9_ddExpYear"));
        yearDropDown.click();

        //Select 2024
        org.openqa.selenium.support.ui.Select dropdownYear = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ProfessionalAccount_9_ddExpYear")));
        dropdownYear.selectByValue("24");

        //Click Agree to Terms
        WebElement termsCheckBox = driver.findElement(By.id("ProfessionalAccount_9_rbTerms"));
        termsCheckBox.click();

        //Click Submit
        WebElement submitBox = driver.findElement(By.name("ProfessionalAccount_9$btnSubmitAccount"));
        submitBox.click();

        //Go to new coach account
        WebElement goToAccountBox = driver.findElement(By.id("AccountProfessionalThankyou_8_btnSubmit"));
        goToAccountBox.click();


    }
}
