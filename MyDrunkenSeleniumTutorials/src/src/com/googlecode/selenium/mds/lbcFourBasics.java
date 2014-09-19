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
public class lbcFourBasics {
    @Test
    public void testlbcFourBasics() {

        //Open Chrome and go to home.trainingpeaks
        System.setProperty("webdriver.chrome.driver", "my-drunken-selenium/lib/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        WebDriver driver = new ChromeDriver(options);
//        Wait<WebDriver> wait = new WebDriverWait(driver, 30);
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

        //Click Test Ride Beta, bc Flex sux and Flash is stupid and difficult to work with ... Go HTML5 app
        WebElement betaButton = driver.findElement(By.className("beta"));
        betaButton.click();

        //IN BETA APP FROM HERE ON OUT ... BC HTML5 IS WHERE IT IS AT

        //Create One Free Premium Client

        //Explicit Wait for Athlete Library Button
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement athleteLibraryButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("athleteLibrary")));

        //Click Athlete Library
        athleteLibraryButton.click();

        //Click My Athletes Title
        WebElement myAthleteTitle = driver.findElement(By.className("groupTitle"));
//        myAthleteTitle.click();

        //Click Athlete List Settings
        WebElement athleteListSettings = driver.findElement(By.className("listSettings"));
//        athleteListSettings.click();

        //Click Add Athlete
        WebElement addAthlete = driver.findElement(By.className("addAthlete"));
//        addAthlete.click();

        //Create Athlete
        //If creating multi athletes in for loop add iteration to name and user name
        //You can sub out Premium and Basic in the userTypeRadio button and in the clientUserType String

        //Select Premium Radio Button
        WebElement userTypeRadio = driver.findElement(By.xpath("//label[contains(.,' Premium')]/input"));
//        userTypeRadio.click();

        //Enter Premium First and Last Name
        String clientUserType = "Premium";
        String clientUserFirstName = clientUserType + "User";
        String clientUserLastName = clientUserType + "Athlete";
        String newClientUserFullName = clientUserFirstName + " " + clientUserLastName + sb;
        WebElement clientUserFirstLastNameTextBox = driver.findElement(By.name("firstAndLastName"));
//        clientUserFirstLastNameTextBox.sendKeys(newClientUserFullName);

        //Select Gender
        Select genderDropDown = new Select(driver.findElement(By.name("gender")));
//        genderDropDown.selectByValue("0");

        //Select Athlete Type
        Select athleteDropDown = new Select(driver.findElement(By.name("athleteType")));
//        athleteDropDown.selectByValue("4");

        //Enter Client's Email Address
        String clientUserEmail = "corey@peaksware.com";
        WebElement clientUserEmailTextBox = driver.findElement(By.name("email"));
//        clientUserEmailTextBox.sendKeys(clientUserEmail);

        //Enter Client's Username
        String clientUserUserName = clientUserFirstName+clientUserLastName+sb;
        WebElement clientUserUserNameTextBox = driver.findElement(By.name("username"));
//        clientUserUserNameTextBox.sendKeys(clientUserUserName);

        //Click Continue Button
        WebElement createAthleteContinueButton = driver.findElement(By.xpath("//button[contains(.,'Continue')]"));
//        createAthleteContinueButton.click();

        //Explicit Wait for Save Button
        WebElement createAthleteSaveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save & Close')]")));
//        createAthleteSaveButton.click();

        //Explicit Wait for OK Button
        WebElement createAthleteOKButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("ok")));
//        createAthleteOKButton.click();

        //Create 4 Basic Clients
        for (int i = 0; i < 4; i++) {
            myAthleteTitle.click();
            athleteListSettings.click();
            addAthlete.click();
            WebElement userTypeRadioBasic = driver.findElement(By.xpath("//label[contains(.,' Basic')]/input"));
            userTypeRadioBasic.click();
            String clientUserTypeBasic = "Basic";
            String clientUserFirstNameBasic = clientUserTypeBasic + "User";
            String clientUserLastNameBasic = clientUserTypeBasic + "Athlete";
            String newClientUserFullNameBasic = clientUserFirstNameBasic + " " + clientUserLastNameBasic + sb + i;
            clientUserFirstLastNameTextBox.sendKeys(newClientUserFullNameBasic);
            athleteDropDown.selectByValue("4");
            clientUserEmailTextBox.sendKeys(clientUserEmail);
            String clientUserUserNameBasic = clientUserFirstNameBasic+clientUserLastNameBasic+sb+i;
            clientUserUserNameTextBox.sendKeys(clientUserUserNameBasic);
            createAthleteContinueButton.click();
            createAthleteSaveButton.click();
            createAthleteOKButton.click();

        }



    }
}
