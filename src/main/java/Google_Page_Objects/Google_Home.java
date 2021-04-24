package Google_Page_Objects;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Home extends Abstract_Class{

    //declare a local logger so you can use it in your page class
    ExtentTest logger;
    public Google_Home(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement you need using @FindBy concept
    @FindBy(xpath = "//*[@name='q']")
    WebElement googleSearch;
    @FindBy(xpath = "//*[@name='btnK']")
    WebElement googleSearchButton;


    // when there is a element which doesn't have unique property soo you create a web element as a list. Then later you pass .get
    //@FindBy(xpath = "//*[@name='btnK']")
    //List<WebElement> list;
    //Reusable_Actions_PageObject.sendKeysMethod(driver,list.get(0),userValue,logger,"Google Search");


    //create a method for google search
    public void EnterKeywordOnGoogleSearch(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,googleSearch,userValue,logger,"Google Search");
    }//end of google search

    //create a method for google search button
    public void SubmitOnGoogleSearchButton(){
        Reusable_Actions_PageObject.submitOnElement(driver,googleSearchButton,logger,"Google Search button");
    }//end of google search



}
