package Express_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_Checkout extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public Express_Checkout(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement you need using @FindBy concept
    @FindBy(xpath = "//*[@id='contact-information-firstname']")
    WebElement firstName;
    @FindBy(xpath = "//*[@name='lastname']")
    WebElement lastName;
    @FindBy(xpath = "//*[@name='email']")
    WebElement email;
    @FindBy(xpath = "//*[@name='confirmEmail']")
    WebElement confirmEmail;
    @FindBy(xpath = "//*[@name='phone']")
    WebElement phone;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement continue1;

    @FindBy(xpath = "//*[@name='shipping.line1']")
    WebElement address;
    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement zipCode;
    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement city;
    @FindBy(xpath = "//select[@name='shipping.state']")
    WebElement state;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement continue2;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement continue3;

    @FindBy(xpath = "//input[@id='creditCardNumberInput']")
    WebElement creditCard;
    @FindBy(xpath = "//select[@name='expMonth']")
    WebElement expirationDate;
    @FindBy(xpath = "//select[@name='expYear']")
    WebElement expirationYear;
    @FindBy(xpath = "//*[@name='cvv']")
    WebElement cvv;
    @FindBy(xpath = "//span[text()='Place Order']")
    WebElement placeOrder;

    @FindBy(xpath = "//div[@aria-label='Alert!']")
    WebElement errorMessage;




    //create a method for first name
    public void enterFirstName(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,firstName,userValue,logger,"Enter first name");
    }//end of first name method


    //create a method for last name
    public void enterLastName(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,lastName,userValue,logger,"Enter last name");
    }//end of last name method


    //create a method for email
    public void enterEmail(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,email,userValue,logger,"Enter email");
    }//end of email method


    //create a method for confirmation email
    public void enterConfirmationEmail(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,confirmEmail,userValue,logger,"Enter confirmation email");
    }//end of confirmation email method


    //create a method for phone number
    public void enterPhoneNumber(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,phone,userValue,logger,"Enter phone number");
    }//end of phone number method


    //create a method for continue
    public void clickOnContinue1() {
        Reusable_Actions_PageObject.clickOnElement(driver, continue1, logger, "Click on continue");
    }//end of continue method


    //create a method for address
    public void enterAddress(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,address,userValue,logger,"Enter address");
    }//end of address method


    //create a method for zipcode
    public void enterZipCode(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,zipCode,userValue,logger,"Enter zipcode");
    }//end of zipcode method


    //create a method for city
    public void enterCity(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,city,userValue,logger,"Enter city");
    }//end of city method


    //create a method for state
    public void enterState(String userValue){
        Reusable_Actions_PageObject.dropdownByText(driver,state,userValue,logger,"Enter state");
    }//end of state method


    //create a method for continue
    public void clickOnContinue2() {
        Reusable_Actions_PageObject.clickOnElement(driver, continue2, logger, "Click on continue");
    }//end of continue method


    //create a method for continue
    public void clickOnContinue3() {
        Reusable_Actions_PageObject.clickOnElement(driver, continue3, logger, "Click on continue");
    }//end of continue method


    //create a method for credit card
    public void enterCreditCard(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,creditCard,userValue,logger,"Enter credit card");
    }//end of credit card method


    //create a method for expiration date
    public void enterExpDate(String userValue){
        Reusable_Actions_PageObject.dropdownByText(driver,expirationDate,userValue,logger,"Enter expiration date");
    }//end of expiration date method


    //create a method for expiration year
    public void enterExpYear(String userValue){
        Reusable_Actions_PageObject.dropdownByText(driver,expirationYear,userValue,logger,"Enter expiration year");
    }//end of expiration date method


    //create a method for cvv
    public void enterCvv(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,cvv,userValue,logger,"Enter cvv");
    }//end of cvv method


    //create a method for place order
    public void placeOrder() {
        Reusable_Actions_PageObject.clickOnElement(driver, placeOrder, logger, "Click on place order");
    }//end of place order method


    //create a method for error message
    public void errorMessage(){
        String result = Reusable_Actions_PageObject.captureText(driver,errorMessage, 0,logger,"Error Message");
        logger.log(LogStatus.INFO, "The error message is: " + result);
    }//end of error message method


}