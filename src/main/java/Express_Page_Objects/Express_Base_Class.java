package Express_Page_Objects;

import Google_Page_Objects.Google_Home;
import Google_Page_Objects.Search_Result;
import ReusableLibrary.Abstract_Class;

public class Express_Base_Class extends Abstract_Class {



    public static Express_Homepage expressHomepage(){
        Express_Homepage expressHomepage = new Express_Homepage(driver);
        return  expressHomepage;
    }//end of expressHomepage method


    public static Express_HoodiesAndSweatshirts expressHoodiesAndSweatshirts(){
        Express_HoodiesAndSweatshirts expressHoodiesAndSweatshirts = new Express_HoodiesAndSweatshirts(driver);
        return  expressHoodiesAndSweatshirts;
    }//end of expressHoodiesAndSweatshirts method


    public static Express_Sweatshirt expressSweatshirt(){
        Express_Sweatshirt expressSweatshirt = new Express_Sweatshirt(driver);
        return  expressSweatshirt;
    }//end of expressSweatshirt method


    public static Express_Bag expressBag(){
        Express_Bag expressBag = new Express_Bag(driver);
        return  expressBag;
    }//end of expressBag method


    public static Express_Checkout expressCheckout(){
        Express_Checkout expressCheckout = new Express_Checkout(driver);
        return  expressCheckout;
    }//end of expressCheckout method



}
