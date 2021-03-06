package com.swaglabs.pages;

import com.swaglabs.utils.ElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.swaglabs.base.BasePage.driver;

public class LoginPage {

    // locators using FindBy
    @FindBy(id = "user-name")
    private static WebElement userName;

    @FindBy(id = "password")
    private static WebElement password;

    @FindBy(id = "login-button")
    private static WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    private static WebElement errorMsg;

    // Constructor
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public static  String verifyTitle(){
        return ElementUtil.doGetPageTitle();
    }

    public static void enterUserName(String user){
        ElementUtil.waitForElementVisible(userName);
        ElementUtil.doSendText(userName, user);

    }
    public static void enterPassword(String pass){
        ElementUtil.waitForElementVisible(password);
        ElementUtil.doSendText(password, pass);
    }
    public static void clickLoginBtn(){
        ElementUtil.waitForElementVisible(loginBtn);
        ElementUtil.doClick(loginBtn);
    }
    public static String getErrorMessage(){
        ElementUtil.waitForElementVisible(errorMsg);
        return ElementUtil.doGetText(errorMsg);
    }

}
