package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class LoginPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(id="username")
    private ExtendedWebElement userName;

    @FindBy(id="password")
    private ExtendedWebElement passInput;

    @FindBy(id="submit")
    private ExtendedWebElement submitBtn;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void Login (String login , String pass) {
        LOGGER.info("Enter credencials");
        userName.type(login);
        passInput.type(pass);
        submitBtn.click();
      }
}
