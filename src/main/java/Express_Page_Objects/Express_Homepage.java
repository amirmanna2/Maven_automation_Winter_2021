package Express_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_Homepage extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public Express_Homepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement you need using @FindBy concept
    @FindBy(xpath = "//*[@id='closeModal']")
    WebElement popUp;
    @FindBy(xpath = "//a[text()='Men']")
    WebElement menTab;
    @FindBy(xpath = "//a[text()='Sweatshirts & Hoodies']")
    WebElement sweatshirtsAndHoodiesTab;


    //create a method for popup
    public void dismissPopUp() {
        Reusable_Actions_PageObject.clickOnElement(driver, popUp, logger, "Dismiss Popup");
    }//end of popup method

    //create a method for men tab
    public void hoverOverMenTab() {
        Reusable_Actions_PageObject.hoverOverElement(driver, menTab, logger, "Hover over Men Tab");
    }//end of men tab method

    //create a method for Sweatshirts and Hoodies
    public void clickOnSweatshirtsAndHoodies() {
        Reusable_Actions_PageObject.clickOnElement(driver, sweatshirtsAndHoodiesTab, logger, "Click on Sweatshirts and Hoodies");
    }//end of Sweatshirts and Hoodies method


}