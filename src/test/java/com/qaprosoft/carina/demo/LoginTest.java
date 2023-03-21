package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.LoginPage;
import com.qaprosoft.carina.demo.SuccessfullyLoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest implements IAbstractTest {

    LoginPage loginPage=null;

    @BeforeSuite
    public void startDriver() {
        loginPage = new LoginPage(getDriver());
    }

    @Test
    public void testOpenPage() {
        loginPage.open();
        loginPage.Login("student", "Password123");
        Assert.assertEquals(getDriver().getTitle(), "Logged In Successfully | Practice Test Automation");
           }


}

