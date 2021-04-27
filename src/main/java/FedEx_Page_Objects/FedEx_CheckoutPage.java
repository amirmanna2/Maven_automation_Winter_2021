package FedEx_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedEx_CheckoutPage extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public FedEx_CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement on page
    @FindBy(xpath = "//input[@name='locSearchTxt']")
    WebElement enterZipcode;
    @FindBy(xpath = "//li[@id='0267']")
    WebElement pickLocation;
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueToNextStep;
    @FindBy(xpath = "//area[@alt()='no']")
    WebElement closePopUp;
    @FindBy(xpath = "//a[@name='fedexLocation-saveNCont']")
    WebElement continueToNextStep2;
    @FindBy(xpath = "//input[@name='CustFirstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@name='CustLastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@name='CustPhone']")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@name='CustEmail']")
    WebElement email;
    @FindBy(xpath = "//a[@id='checkout-show-payment']")
    WebElement continueToNextStep3;
    @FindBy(xpath = "//select[@name='polSelectCardType']")
    WebElement dropDown;
    @FindBy(xpath = "//input[@id='frmCCNum']")
    WebElement enterYourCardNumber;
    @FindBy(xpath = "//input[@id='csv_number']")
    WebElement cvv;
    @FindBy(xpath = "//select[@id='selected_Month']")
    WebElement expMonth;
    @FindBy(xpath = "//select[@id='selected_Year']")
    WebElement expYear;
    @FindBy(xpath = "//input[@id='name_card']")
    WebElement enterYourNameOnCard;
    @FindBy(xpath = "//input[@id='name_on_card_billing']")
    WebElement enterYourName;
    @FindBy(xpath = "//input[@id='address_billing_1']")
    WebElement address;
    @FindBy(xpath = "//input[@id='city_billing']")
    WebElement city;
    @FindBy(xpath = "//select[@id='state_billing']")
    WebElement state;
    @FindBy(xpath = "//input[@id='zip_code']")
    WebElement enterZipCode2;
    @FindBy(xpath = "//a[@id='checkout-show-rewiew']")
    WebElement continueToNextStep4;
    @FindBy(xpath = "//div[@class='review-order-col']")
    WebElement capturePickUp;

    //create a method for sendkeys
    public void enterZipcode(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, enterZipcode,userValue, logger, "enter zipcode");
    }//end of sendkeys method

    //create a method for click
    public void pickLcocation() {
        Reusable_Actions_PageObject.clickOnElement(driver, pickLocation, logger, "click on location");
    }//end of click method

    //create a method for click
    public void clickOnContinue() {
        Reusable_Actions_PageObject.clickOnElement(driver, continueToNextStep, logger, "click on continue");
    }//end of click method

    //create a method for click
    public void closePopUp() {
        Reusable_Actions_PageObject.closePopupIfExist(driver, closePopUp, logger, "close pop up");
    }//end of click method

    //create a method for click
    public void clickOnContinue2() {
        Reusable_Actions_PageObject.clickOnElement(driver, continueToNextStep2, logger, "click on continue");
    }//end of click method

    //create a method for sendkeys
    public void enterFirstName(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, firstName,userValue, logger, "enter first name");
    }//end of sendkeys method

    //create a method for sendkeys
    public void enterLastName(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, lastName,userValue, logger, "enter last name");
    }//end of sendkeys method

    //create a method for sendkeys
    public void enterPhoneNumber(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, phoneNumber,userValue, logger, "enter phone number");
    }//end of sendkeys method

    //create a method for sendkeys
    public void enterEmail(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, email,userValue, logger, "enter email");
    }//end of sendkeys method

    //create a method for click
    public void clickOnContinue3() {
        Reusable_Actions_PageObject.clickOnElement(driver, continueToNextStep3, logger, "click on continue");
    }//end of click method

    //create a method for dropdown
    public void clickDropDown(String userValue) {
        Reusable_Actions_PageObject.dropdownByText(driver, dropDown, userValue, logger, "Select payment");
    }//end of dropdown method

    //create a method for sendkeys
    public void enterCardNumber(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, enterYourCardNumber,userValue, logger, "enter card number");
    }//end of sendkeys method

    //create a method for sendkeys
    public void enterCvv(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, cvv,userValue, logger, "enter cvv");
    }//end of sendkeys method

    //create a method for dropdown
    public void clickExpMonth(String userValue) {
        Reusable_Actions_PageObject.dropdownByText(driver, expMonth, userValue, logger, "Select exp month");
    }//end of dropdown method

    //create a method for dropdown
    public void clickExpYear(String userValue) {
        Reusable_Actions_PageObject.dropdownByText(driver, expYear, userValue, logger, "Select exp year");
    }//end of dropdown method

    //create a method for sendkeys
    public void enterNameOnCard(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, enterYourNameOnCard,userValue, logger, "enter name on card");
    }//end of sendkeys method

    //create a method for sendkeys
    public void enterName(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, enterYourName,userValue, logger, "enter name");
    }//end of sendkeys method

    //create a method for sendkeys
    public void enterAddress(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, address,userValue, logger, "enter address");
    }//end of sendkeys method

    //create a method for sendkeys
    public void enterCity(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, city,userValue, logger, "enter city");
    }//end of sendkeys method

    //create a method for dropdown
    public void enterState(String userValue) {
        Reusable_Actions_PageObject.dropdownByText(driver, state, userValue, logger, "enter state");
    }//end of dropdown method

    //create a method for sendkeys
    public void enterZipcode2(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, enterZipCode2,userValue, logger, "enter zipcode");
    }//end of sendkeys method

    //create a method for click
    public void clickOnContinue4() {
        Reusable_Actions_PageObject.clickOnElement(driver, continueToNextStep4, logger, "click on continue");
    }//end of click method


    //create a method for capture text
    public void capturePickupText() {
        String result = Reusable_Actions_PageObject.captureText(driver, capturePickUp, 0, logger, "Capture pick up location");
        logger.log(LogStatus.INFO, " " + result);
    }//end of capture text method


}//end of java class