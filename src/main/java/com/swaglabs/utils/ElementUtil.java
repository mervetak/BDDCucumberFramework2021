package com.swaglabs.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.swaglabs.base.BasePage.driver;

public class ElementUtil {

    static WebDriverWait wait = new WebDriverWait(driver, 15);
    public static void waitForElementVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static String doGetPageTitle(){
        try {
            return driver.getTitle();
        }catch (Exception e){
            System.out.println("Some exception occured while getting the page title");
            return null;
        }

    }
    public static void doSendText(WebElement element, String value){
        try {
            element.sendKeys(value);
        } catch (Exception e ){
            System.out.println("Some exception occured while sending text at " + element);
        }
    }

    public static void doClick(WebElement element){
        try {
            element.click();
        } catch (Exception e ){
            System.out.println("Some exception occured while sending text at " + element);
        }
    }

    public static String doGetText(WebElement element){
        try {
            return element.getText();
        }catch (Exception e) {
            System.out.println("Some exception occurred while getting text from " + element);
            return null;
        }
    }

    public static boolean doIsDisplayed(WebElement element){
        try {
            return element.isDisplayed();
        }catch (Exception e){
            System.out.println("Some exception occurred while checking if element is displayed or not" + element);
            return false;
        }
    }

}
