package Day15_042521;

import Express_Page_Objects.Express_Base_Class;
import FedEx_Page_Objects.FedEx_Base_Class;
import FedEx_Page_Objects.FedEx_HomePage;
import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions_PageObject;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;

public class FedEx_E2E_PageObject extends Abstract_Class {

    @Test
    public void expressEnd2End() throws InterruptedException, AWTException {


        driver.manage().deleteAllCookies();
        driver.navigate().to("https://www.fedex.com/en-us/home.html");
        Thread.sleep(3000);



        FedEx_Base_Class.fedExHomePage().clickOnDesignPrint();
        FedEx_Base_Class.fedExHomePage().clickOnPrintReadFile();
        Thread.sleep(2000);

        FedEx_Base_Class.fedExSelectAProductPage().clickOnDocumentPrinting();
        Thread.sleep(2000);

        FedEx_Base_Class.fedExDocumentPrintingPage().AssertTitle();
        FedEx_Base_Class.fedExDocumentPrintingPage().clickOnCopiesAndCustom();
        Thread.sleep(2000);

        FedEx_Base_Class.fedExUploadPage().useYourFile();
        Thread.sleep(2000);


        FedEx_Base_Class.fedExUploadFilePage(new File("/Users/qa/Downloads/FedEx_Logo.png"));
        Thread.sleep(5000);


        FedEx_Base_Class.fedExOrderPage().clickOnPopUp();
        Thread.sleep(2000);
        FedEx_Base_Class.fedExOrderPage().quantity("5");
        FedEx_Base_Class.fedExOrderPage().clickOnAddToCart();
        Thread.sleep(3000);

        FedEx_Base_Class.fedExCartSummaryPage().clickOnCheckout();
        Thread.sleep(2000);
        FedEx_Base_Class.fedExCartSummaryPage().clickOnProceedAsGuest();
        Thread.sleep(2000);


        FedEx_Base_Class.fedExCheckoutPage().enterZipcode("10002");
        FedEx_Base_Class.fedExCheckoutPage().pickLcocation();
        FedEx_Base_Class.fedExCheckoutPage().clickOnContinue();
        FedEx_Base_Class.fedExCheckoutPage().closePopUp();
        FedEx_Base_Class.fedExCheckoutPage().clickOnContinue2();
        FedEx_Base_Class.fedExCheckoutPage().closePopUp();
        FedEx_Base_Class.fedExCheckoutPage().enterFirstName("Jane");
        FedEx_Base_Class.fedExCheckoutPage().enterLastName("Doe");
        FedEx_Base_Class.fedExCheckoutPage().enterPhoneNumber("8773934448");
        FedEx_Base_Class.fedExCheckoutPage().enterEmail("janedoe@gmail.com");
        FedEx_Base_Class.fedExCheckoutPage().closePopUp();
        FedEx_Base_Class.fedExCheckoutPage().clickOnContinue3();
        FedEx_Base_Class.fedExCheckoutPage().clickDropDown("VISA");
        FedEx_Base_Class.fedExCheckoutPage().enterCardNumber("4024007103939509");
        FedEx_Base_Class.fedExCheckoutPage().enterCvv("393");
        FedEx_Base_Class.fedExCheckoutPage().clickExpMonth("01");
        FedEx_Base_Class.fedExCheckoutPage().clickExpYear("2022");
        FedEx_Base_Class.fedExCheckoutPage().enterNameOnCard("Jane Doe");
        FedEx_Base_Class.fedExCheckoutPage().closePopUp();
        FedEx_Base_Class.fedExCheckoutPage().enterName("Jane Doe");
        FedEx_Base_Class.fedExCheckoutPage().enterAddress("123 Kings Road");
        FedEx_Base_Class.fedExCheckoutPage().enterCity("Bronx");
        FedEx_Base_Class.fedExCheckoutPage().enterState("NY");
        FedEx_Base_Class.fedExCheckoutPage().enterZipcode2("10002");
        FedEx_Base_Class.fedExCheckoutPage().closePopUp();
        FedEx_Base_Class.fedExCheckoutPage().clickOnContinue4();
        FedEx_Base_Class.fedExCheckoutPage().capturePickupText();

    }//end of test

}//end of java class
