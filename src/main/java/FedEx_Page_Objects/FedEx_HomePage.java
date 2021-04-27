package FedEx_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FedEx_HomePage extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public FedEx_HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement on page
    @FindBy(xpath = "//*[contains(@aria-label,'Open Design')]")
    WebElement DesignPrint;
    @FindBy(xpath = "//*[contains(@aria-label,'Print-Ready')]")
    WebElement explorePrintProducts;



    //create a method for click
    public void clickOnDesignPrint() {
        Reusable_Actions_PageObject.clickOnElement(driver, DesignPrint, logger, "click on design & print");
    }//end of click method

    //create a method for click
    public void clickOnPrintReadFile() {
        Reusable_Actions_PageObject.clickOnElement(driver, explorePrintProducts, logger, "click on upload a print-ready file");
    }//end of click method

}//end of java class