package com.googlecode.selenium.mds;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by coreysteimel on 9/20/14.
 */
public class LoginPremUser extends Utils {

    @Test
    public void testLoginPremUser() throws Exception {

        //Go To TrainingPeaks.com
        super.setUp();

        super.loginTest("tester3prem", "password");





    }
}
