package com.googlecode.selenium.mds;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;

import javax.xml.xpath.XPath;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Created by coreysteimel on 8/29/14.
 */
public class CoachDemoSignUp extends Utils {
    @Test
    public void testCoachDemoSignUp() {

        //Open Chrome and go to home.trainingpeaks
        System.setProperty("webdriver.chrome.driver", "my-drunken-selenium/lib/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--test-type");
        WebDriver driver = new ChromeDriver(options);
        //Wait<WebDriver> wait = new WebDriverWait(driver, 30);
        driver.get("http://home.sandbox.trainingpeaks.com/");

        //Click Coach link
        WebElement coachesDropDown = driver.findElement(By.id("lnkCoaches"));
        coachesDropDown.click();

        //Click Free Trial Button
        WebElement freeTrialButton = driver.findElement(By.id("btnFree7DayTrial1"));
        freeTrialButton.click();

        //Random String Generator
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();

        StringBuilder sb = new StringBuilder(8);
        for (int i = 0; i < 8; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        //Coach Trial Info

        //Enter First Last Name
        String firstName = "Corey";
        String lastName = "SeleniumDev";
        String newName = firstName + " " + lastName + sb;
        WebElement firstLastNameTextBox = driver.findElement(By.id("Name"));
        firstLastNameTextBox.sendKeys(newName);

        //Enter Email
        String email = "corey@peaksware.com";
        WebElement emailTextBox = driver.findElement(By.id("Email"));
        emailTextBox.sendKeys(email);

        //Click Coaching Focus Drop Down
        WebElement focusDropDown = driver.findElement(By.id("CoachingFocusSelectBoxIt"));
        focusDropDown.click();

        //Select Swimming
        WebElement swimFocus = driver.findElement(By.id("2"));
        swimFocus.click();

        //Enter Phone Number
        String phoneNumber = "303 555 5555";
        WebElement phoneTextBox = driver.findElement(By.id("Phone"));
        phoneTextBox.sendKeys(phoneNumber);

        //Click Country Drop Down
        WebElement countryDropDown = driver.findElement(By.id("CountrySelectBoxIt"));
        countryDropDown.click();

        //Select Country
        WebElement countryAnt = driver.findElement(By.linkText("United States"));
        countryAnt.click();

        //Enter UserName
        String newUserName = firstName + lastName + sb;
        WebElement userNameTextBox = driver.findElement(By.id("Username"));
        userNameTextBox.sendKeys(newUserName);

        //Enter Password
        String passWord = "password";
        WebElement passWordTextBox = driver.findElement(By.id("Password"));
        passWordTextBox.sendKeys(passWord);

        //Click Create Account
        WebElement createAcctBtn = driver.findElement(By.name("submit"));
        createAcctBtn.click();

        //Click Test Ride Beta, bc Flex sux and Flash is stupid and difficult to work with ... Go HTML5 app
        WebElement betaButton = driver.findElement(By.className("beta"));
        betaButton.click();

        //IN BETA APP FROM HERE ON OUT ... BC HTML5 IS WHERE IT IS AT

        //Explicit Wait for Athlete Library Button
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement athleteLibraryButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("athleteLibrary")));

        //Click Athlete Library
        athleteLibraryButton.click();

        //Click My Athletes Title
        WebElement myAthleteTitle = driver.findElement(By.className("groupTitle"));
        myAthleteTitle.click();

        //Click Athlete List Settings
        WebElement athleteListSettings = driver.findElement(By.className("listSettings"));
        athleteListSettings.click();

        //Click Add Athlete
        WebElement addAthlete = driver.findElement(By.className("addAthlete"));
        addAthlete.click();

        //Create Athlete
        //If creating multi athletes in for loop add iteration to name and user name
        //You can sub out Premium and Basic in the userTypeRadio button and in the clientUserType String

        //Select Premium Radio Button
        WebElement userTypeRadio = driver.findElement(By.xpath("//label[contains(.,' Premium')]/input"));
        userTypeRadio.click();

        //Enter Premium First and Last Name
        String clientUserType = "Premium";
        String clientUserFirstName = clientUserType + "User";
        String clientUserLastName = clientUserType + "Athlete";
        String newClientUserFullName = clientUserFirstName + " " + clientUserLastName + sb;
        WebElement clientUserFirstLastNameTextBox = driver.findElement(By.name("firstAndLastName"));
        clientUserFirstLastNameTextBox.sendKeys(newClientUserFullName);

        //Select Gender
        Select genderDropDown = new Select(driver.findElement(By.name("gender")));
        genderDropDown.selectByValue("0");

        //Select Athlete Type
        Select athleteDropDown = new Select(driver.findElement(By.name("athleteType")));
        athleteDropDown.selectByValue("4");

        //Enter Client's Email Address
        String clientUserEmail = "corey@peaksware.com";
        WebElement clientUserEmailTextBox = driver.findElement(By.name("email"));
        clientUserEmailTextBox.sendKeys(clientUserEmail);

        //Enter Client's Username
        String clientUserUserName = clientUserFirstName+clientUserLastName+sb;
        WebElement clientUserUserNameTextBox = driver.findElement(By.name("username"));
        clientUserUserNameTextBox.sendKeys(clientUserUserName);

        //Click Continue Button
        WebElement createAthleteContinueButton = driver.findElement(By.xpath("//button[contains(.,'Continue')]"));
        createAthleteContinueButton.click();

        //Explicit Wait for Save Button
        WebElement createAthleteSaveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Save & Close')]")));
        createAthleteSaveButton.click();

        //Explicit Wait for OK Button
        WebElement createAthleteOKButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("ok")));
        createAthleteOKButton.click();






//        //Click Primary Interest
//        WebElement primaryInterestDropDown = driver.findElement(By.id("ProfessionalAccount_10_ddInterest"));
//        primaryInterestDropDown.click();
//
//        //Select Endurance
//        org.openqa.selenium.support.ui.Select dropdownInterest = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ProfessionalAccount_10_ddInterest")));
//        dropdownInterest.selectByValue("Endurance");



//
//        //Open New Window and go to Site Admin
//        WebDriver driverTwo = new ChromeDriver(options);
//        driverTwo.get("https://www.dev.trainingpeaks.com/siteadmin/V2/Accounts/Login.aspx?ReturnUrl=%2fsiteadmin%2fV2");
//
//        //Enter Site Admin User Name
//        WebElement userNameSA = driverTwo.findElement(By.id("Login1_UserName"));
//        userNameSA.sendKeys("csteimel");
//
//        //Enter Site Admin Password
//        WebElement passWordSA = driverTwo.findElement(By.id("Login1_Password"));
//        passWordSA.sendKeys("sharkweek");
//
//        //Click Log In
//        WebElement logInSA = driverTwo.findElement(By.id("Login1_LoginButton"));
//        logInSA.click();
//
//        //Enter First Name
//        WebElement unNameSA = driverTwo.findElement(By.id("ctl00_txtUserName"));
//        unNameSA.sendKeys(newUserName);
//
//        //Search
//        WebElement searchBtn = driverTwo.findElement(By.id("ctl00_btnSearch"));
//        searchBtn.click();
//
//        //Click Settings
//        WebElement settingsLinkSA = driverTwo.findElement(By.id("ctl00_SearchUsers_ctl02_linkSettings"));
//        settingsLinkSA.click();
//
//        //Click Person Info
//        WebElement personInfoSA = driverTwo.findElement(By.cssSelector("a[href='#tab1']"));
//        personInfoSA.click();
//
//        //NEED TO FIGURE OUT HOW TO FIND THE DEFAULT COACH GROUP ELEMENT!
//        //Verify Coaching Group
//        WebElement coachingGroup = driverTwo.findElement(By.partialLinkText(newName));
//
//        if(coachingGroup == coachingGroup) {
//            System.out.println("Verified Default Coaching Group");
//        } else {
//            System.out.println("Error ... Could NOT verify Default Coaching Group");
//        }






    }
}
