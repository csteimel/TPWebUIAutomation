package com.googlecode.selenium.mds;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

/**
 * Created by coreysteimel on 9/19/14.
 */
public class lbcOneFreePremFourPaidPrem {
    @Test
    public void testlbcOneFreePremFourPaidPrem() {

        //Open Chrome and go to home.trainingpeaks
        System.setProperty("webdriver.chrome.driver", "my-drunken-selenium/lib/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        WebDriver driver = new ChromeDriver(options);
//        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        driver.get("https://cat6.dev.trainingpeaks.com/account-professional-edition.aspx");

        WebDriverWait wait = new WebDriverWait(driver, 30);

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

        //Click Test Ride Beta, bc Flex sux and Flash is stupid and difficult to work with ... Go HTML5 app
        WebElement betaButton = driver.findElement(By.className("beta"));
        betaButton.click();

        //Wait for it ...
        WebElement betaLoginUNTextBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("Username")));

        //Enter UN
        betaLoginUNTextBox.sendKeys(userName);

        //Enter PW
        WebElement betaLoginPWTextBox = driver.findElement(By.name("Password"));
        betaLoginPWTextBox.sendKeys(passWord);

        //Click Login Button
        WebElement betaLoginButton = driver.findElement(By.name("submit"));
        betaLoginButton.click();

        //Wait for Continue To Account
        //IMPORTANT NOTICE ... NOT PERMANENT
        WebElement continueToAcct = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Continue to My Account']")));
        continueToAcct.click();

        //IN BETA APP FROM HERE ON OUT ... BC HTML5 IS WHERE IT IS AT

        //Wait for it ...
        WebElement featureTourCloseIcon = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[contains(@class, 'closeIcon')]")));

        if (featureTourCloseIcon.isDisplayed()) {
            featureTourCloseIcon.click();
        }


        //Create One Free Premium Client

        //Declare Athlete Button
        WebElement athleteLibraryButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("athleteLibrary")));

        //Click Athlete Library
        athleteLibraryButton.click();

        //Create 5 Prem (One Free Prem, Four Paid Prems) Clients
        for (int i = 0; i < 5; i++) {
            //Click My Athletes Title
            WebElement myAthleteTitle = wait.until(ExpectedConditions.elementToBeClickable(By.className("groupTitle")));
            myAthleteTitle.click();
            //Click Athlete List Settings
            WebElement athleteListSettings = driver.findElement(By.className("listSettings"));
            athleteListSettings.click();
            WebElement addAthlete2 = wait.until(ExpectedConditions.elementToBeClickable(By.className("addAthlete")));
            addAthlete2.click();
            WebElement userTypeRadioBasic = driver.findElement(By.xpath("//label[contains(.,' Premium')]/input"));
            userTypeRadioBasic.click();
            String clientUserTypePremium = "Premium";
            String clientUserFirstNamePremium = clientUserTypePremium + "User";
            String clientUserLastNamePremium = clientUserTypePremium + "Athlete";
            String newClientUserFullNamePremium = clientUserFirstNamePremium + " " + clientUserLastNamePremium + sb + i;
            WebElement clientUserFirstLastNameTextBox2 = driver.findElement(By.name("firstAndLastName"));
            clientUserFirstLastNameTextBox2.sendKeys(newClientUserFullNamePremium);
            Select genderDropDown2 = new Select(driver.findElement(By.name("gender")));
            genderDropDown2.selectByValue("0");
            Select athleteDropDown2 = new Select(driver.findElement(By.name("athleteType")));
            athleteDropDown2.selectByValue("4");
            String clientUserEmail = "corey@peaksware.com";
            WebElement clientUserEmailTextBox2 = driver.findElement(By.name("email"));
            clientUserEmailTextBox2.sendKeys(clientUserEmail);
            String clientUserUserNameBasic = clientUserFirstNamePremium+clientUserLastNamePremium+sb+i;
            WebElement clientUserUserNameTextBox2 = driver.findElement(By.name("username"));
            clientUserUserNameTextBox2.sendKeys(clientUserUserNameBasic);
            WebElement createAthleteContinueButton2 = driver.findElement(By.xpath("//button[contains(.,'Continue')]"));
            createAthleteContinueButton2.click();
            WebElement createAthleteSaveButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save & Close')]")));
            createAthleteSaveButton2.click();
            WebElement createAthleteOKButton2 = wait.until(ExpectedConditions.elementToBeClickable(By.name("ok")));
            createAthleteOKButton2.click();
        }



    }
}
