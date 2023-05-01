package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "input[name='username']")
    private WebElement username;

    @FindBy(css = "input[name='password']")
    private WebElement password;

    @FindBy(css = "button[type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashboard;

    @FindBy(xpath = "//span[text()='Recruitment']")
    private WebElement recruitmentClick;

    @FindBy(xpath = "//a[text()='Vacancies']")
    private WebElement vacanciesClick;

    @FindBy(css = "div[class=oxd-form-row]")
    public WebElement addScroll;

    @FindBy(xpath = "//button[text()=' Add ']")
    public WebElement addButton;

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement vacancyName;

    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    public WebElement jobTitleSelect;

    @FindBy(css = "[placeholder='Type description here']")
    public WebElement description;

    @FindBy(css = "[placeholder='Type for hints...']")
    public WebElement hiringManager;

    @FindBy(css = "div[class='oxd-autocomplete-dropdown --positon-bottom']")
    public WebElement hiringManagerSelect;


    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
    private WebElement numberOfPositions;

    @FindBy(xpath = "//button[text()=' Save ']")
    private WebElement saveButton;

    @FindBy(css = "div[class='oxd-toast-container oxd-toast-container--bottom']")
    private WebElement messageVerify;

    @FindBy(css = "li[class='--active oxd-userdropdown']")
    private WebElement accountIcon;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logOut;























    WebElement myElement;

    public void findAndClick(String element){
        switch (element){
            case "submitButton":myElement=submitButton;break;
            case "recruitmentClick":myElement=recruitmentClick;break;
            case "vacanciesClick":myElement=vacanciesClick;break;
            case "addButton":myElement=addButton;break;
            case "jobTitleSelect":myElement=jobTitleSelect;break;
            case "saveButton":myElement=saveButton;break;
            case "accountIcon":myElement=accountIcon;break;
            case "logOut":myElement=logOut;break;
        }
        clickFunction(myElement);
    }

    public void findAndSend (String element, String value){
        switch (element){
            case "username":myElement=username;break;
            case "password":myElement=password;break;
            case "vacancyName":myElement=vacancyName;break;
            case "description":myElement=description;break;
            case "hiringManager":myElement=hiringManager;break;
            case "numberOfPositions":myElement=numberOfPositions;break;

        }
        sendKeysFunction(myElement,value);
    }

    public void verifyText(String element, String text){
        switch (element){
            case "dashboard":myElement=dashboard;break;
            case "messageVerify":myElement=messageVerify;break;
        }
        verifyContainsText(myElement,text);
    }






}
