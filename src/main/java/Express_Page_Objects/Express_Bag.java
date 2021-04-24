package Express_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_Bag extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public Express_Bag(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement you need using @FindBy concept
    @FindBy(xpath = "//select[@id='qdd-0-quantity']")
    WebElement quantity;
    @FindBy(xpath = "//button[text()='Checkout']")
    WebElement checkout;
    @FindBy(xpath = "//button[text()='Checkout as Guest']")
    WebElement guest;

    //create a method for quantity
    public void clickOnQuantity(String userValue) {
        Reusable_Actions_PageObject.dropdownByText(driver, quantity,userValue, logger, "Click on quantity");
    }//end of quantity method


    //create a method for checkout
    public void clickOnCheckout() {
        Reusable_Actions_PageObject.clickOnElement(driver, checkout, logger, "Click on checkout");
    }//end of checkout method


    //create a method for guest
    public void clickOnContinueAsGuest() {
        Reusable_Actions_PageObject.clickOnElement(driver, guest, logger, "Click on continue as guest");
    }//end of guest method

}