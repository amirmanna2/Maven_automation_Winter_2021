package Package14_041821;

import Express_Page_Objects.Express_Base_Class;
import Google_Page_Objects.Base_Class;
import ReusableLibrary.Abstract_Class;
import org.testng.annotations.Test;

public class Express_End2End_PageObject extends Abstract_Class {

    @Test
    public void expressEnd2End() throws InterruptedException {

        driver.navigate().to("https://www.express.com/");
        Thread.sleep(3000);

        Express_Base_Class.expressHomepage().dismissPopUp();
        Express_Base_Class.expressHomepage().hoverOverMenTab();
        Express_Base_Class.expressHomepage().clickOnSweatshirtsAndHoodies();

        Thread.sleep(2500);

        Express_Base_Class.expressHoodiesAndSweatshirts().clickOnFirstSweater();

        Thread.sleep(2500);

        Express_Base_Class.expressSweatshirt().clickOnSmallSize();
        Express_Base_Class.expressSweatshirt().clickOnAddToCart();
        Express_Base_Class.expressSweatshirt().clickOnViewBag();

        Thread.sleep(2500);

        Express_Base_Class.expressBag().clickOnQuantity("2");
        Express_Base_Class.expressBag().clickOnCheckout();
        Express_Base_Class.expressBag().clickOnContinueAsGuest();

        Thread.sleep(2500);

        Express_Base_Class.expressCheckout().enterFirstName("Jane");
        Express_Base_Class.expressCheckout().enterLastName("Doe");
        Express_Base_Class.expressCheckout().enterEmail("janedoe@gmail.com");
        Express_Base_Class.expressCheckout().enterConfirmationEmail("janedoe@gmail.com");
        Express_Base_Class.expressCheckout().enterPhoneNumber("8773934448");
        Express_Base_Class.expressCheckout().clickOnContinue1();
        Express_Base_Class.expressCheckout().enterAddress("123 Kings Road");
        Express_Base_Class.expressCheckout().enterZipCode("10462");
        Express_Base_Class.expressCheckout().enterCity("Bronx");
        Express_Base_Class.expressCheckout().enterState("NY");
        Express_Base_Class.expressCheckout().clickOnContinue2();
        Express_Base_Class.expressCheckout().clickOnContinue3();
        Express_Base_Class.expressCheckout().enterCreditCard("4024007103939509");
        Express_Base_Class.expressCheckout().enterExpDate("10");
        Express_Base_Class.expressCheckout().enterExpYear("21");
        Express_Base_Class.expressCheckout().enterCvv("393");
        Express_Base_Class.expressCheckout().placeOrder();
        Express_Base_Class.expressCheckout().errorMessage();
    }
}