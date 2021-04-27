package FedEx_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedEx_CartSummaryPage extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public FedEx_CartSummaryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement on page
    @FindBy(xpath = "//a[@id='cartToCheckoutBtn']")
    WebElement checkOut;
    @FindBy(xpath = "//a[@id='continueAsGuest']")
    WebElement proceedAsGuest;

    //create a method for click
    public void clickOnCheckout() {
        Reusable_Actions_PageObject.clickOnElement(driver, checkOut, logger, "click on checkout");
    }//end of click method


    //create a method for click
    public void clickOnProceedAsGuest() {
        Reusable_Actions_PageObject.clickOnElement(driver, proceedAsGuest, logger, "click on proceed as guest");
    }//end of click method

}//end of java class