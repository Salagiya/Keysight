package com.keysight.pages;

import com.keysight.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestAutomationSoftwarePage extends Utility {

    //It consists of all different page classes with their objects and methods
    private static final Logger log = LogManager.getLogger(TestAutomationSoftwarePage.class.getName());

    public TestAutomationSoftwarePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Optimize Test Plans and Increase Test Efficiency')]")
    WebElement getText;

    public String verifyOptimizeTestPlansAndIncreaseText(){
        log.info(" Verify Optimize Test Plans text" + getText.getText());
        return getTextFromElement(getText);
    }
}
