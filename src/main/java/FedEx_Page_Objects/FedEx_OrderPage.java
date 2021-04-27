package FedEx_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedEx_OrderPage extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public FedEx_OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement on page
    @FindBy(xpath = "//a[text()='CONTINUE WITH EXISTING']")
    WebElement popUp;
    @FindBy(xpath = "//input[@name='item-quantity']")
    WebElement checkBox;
    @FindBy(xpath = "//button[@name='update_quanity-addToCart-lbl']")
    WebElement addToCart;


    //create a method for click
    public void clickOnPopUp() {
        Reusable_Actions_PageObject.clickOnElement(driver, popUp, logger, "click on pop up");
    }//end of click method
    //create a method for sendkeys
    public void quantity(String userValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, checkBox, userValue, logger, "click on quantity");
    }//end of sendkeys method

    //create a method for click
    public void clickOnAddToCart() {
        Reusable_Actions_PageObject.clickOnElement(driver, addToCart, logger, "click on add to cart");
    }//end of click method

}//end of java class