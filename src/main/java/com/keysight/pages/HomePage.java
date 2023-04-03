package com.keysight.pages;

import com.keysight.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    //It consists of all different page classes with their objects and methods
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "PRODUCTS AND SERVICES")
    WebElement productsAndServicesTab;

    @CacheLookup
    @FindBy(xpath = "//a[@data-value='Software']")
    WebElement softwareTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Test Automation Software')]")
    WebElement testAutomationSoftwareTab;

    public void clickOnProductsAndServicesTab() {
        log.info(" Click on Products and Services tab" + productsAndServicesTab.toString());
        clickOnElement(productsAndServicesTab);
    }

    public void mouseHooverOnSoftwareTab() {
        log.info(" Mouse Hoover on Software Tab" + softwareTab.toString());
        mouseHoverToElement(softwareTab);
    }

    public void clickOnTestAutomationSoftwareTab(){
        log.info("Click on Test automation software tab" + testAutomationSoftwareTab.toString());
        clickOnElement(testAutomationSoftwareTab);
    }
}
