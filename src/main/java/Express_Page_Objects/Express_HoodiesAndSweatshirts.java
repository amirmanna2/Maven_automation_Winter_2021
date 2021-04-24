package Express_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_HoodiesAndSweatshirts extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public Express_HoodiesAndSweatshirts(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement you need using @FindBy concept
    @FindBy(xpath = "//a[@class='_1-wQg']")
    WebElement firstSweater;



    //create a method for first sweater
    public void clickOnFirstSweater() {
        Reusable_Actions_PageObject.clickOnElement(driver, firstSweater, logger, "Click on first sweater");
    }//end of first sweater method


}