package FedEx_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedEx_SelectAProductPage extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public FedEx_SelectAProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement on page
    @FindBy(xpath = "//a[@title='Document Printing']")
    WebElement documentPrinting;


    //create a method for click
    public void clickOnDocumentPrinting() {
        Reusable_Actions_PageObject.clickOnElement(driver, documentPrinting, logger, "click on document printing");
    }//end of click method

}//end of java class