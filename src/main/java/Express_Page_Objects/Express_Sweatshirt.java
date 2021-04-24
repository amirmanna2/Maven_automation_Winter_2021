package Express_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_Sweatshirt extends Abstract_Class {

    //declare a local logger to use in page class
    ExtentTest logger;

    public Express_Sweatshirt(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement you need using @FindBy concept
    @FindBy(xpath = "//span[@class='_3mh2R']")
    WebElement smallSize;
    @FindBy(xpath = "//button[text()='Add to Bag']")
    WebElement addToCart;
    @FindBy(xpath = "//a[text()='View Bag']")
    WebElement viewBag;



    //create a method for small size
    public void clickOnSmallSize() {
        Reusable_Actions_PageObject.clickOnElement(driver, smallSize, logger, "Click on small size");
    }//end of small size method


    //create a method for add to cart
    public void clickOnAddToCart() {
        Reusable_Actions_PageObject.clickOnElement(driver, addToCart, logger, "Click on add to cart");
    }//end of add to cart method


    //create a method for view bag
    public void clickOnViewBag() {
        Reusable_Actions_PageObject.clickOnElement(driver, viewBag, logger, "Click on view bag");
    }//end of view bag method


}