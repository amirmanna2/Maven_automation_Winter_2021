package FedEx_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class FedEx_DocumentPrintingPage extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public FedEx_DocumentPrintingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement on page
    @FindBy(xpath = "//img[@title='Copies & Custom Projects']")
    WebElement copiesAndCustom;


    //create a method for click
    public void clickOnCopiesAndCustom() {
        Reusable_Actions_PageObject.clickOnElement(driver, copiesAndCustom, logger, "click on copies and custom projects");
    }//end of click method


    public void AssertTitle(){
        String acutalTitle = driver.getTitle();
        SoftAssert softAssertion = new SoftAssert();

        try{
            softAssertion.assertEquals("FedEx Office Print Online", driver.getTitle());
            logger.log(LogStatus.PASS,"Page title matches: "+ acutalTitle);
        }catch (Exception e){
            logger.log(LogStatus.FAIL, "Title does not match with: " + acutalTitle + e);
            Reusable_Actions_PageObject.getScreenShot(driver, "Page title", logger);
        }
        softAssertion.assertAll();
    }//end of assert title

}//end of java class