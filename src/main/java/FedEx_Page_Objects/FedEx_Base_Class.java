package FedEx_Page_Objects;

import ReusableLibrary.Abstract_Class;

import java.awt.*;
import java.io.File;

public class FedEx_Base_Class extends Abstract_Class {



    public static FedEx_HomePage fedExHomePage(){
        FedEx_HomePage fedExHomePage = new FedEx_HomePage(driver);
        return  fedExHomePage;
    }//end of method

    public static FedEx_SelectAProductPage fedExSelectAProductPage(){
        FedEx_SelectAProductPage fedExSelectAProductPage = new FedEx_SelectAProductPage(driver);
        return  fedExSelectAProductPage;
    }//end of method

    public static FedEx_DocumentPrintingPage fedExDocumentPrintingPage(){
        FedEx_DocumentPrintingPage fedExDocumentPrintingPage = new FedEx_DocumentPrintingPage(driver);
        return  fedExDocumentPrintingPage;
    }//end of method

    public static FedEx_UploadPage fedExUploadPage(){
        FedEx_UploadPage fedExUploadPage = new FedEx_UploadPage(driver);
        return  fedExUploadPage;
    }//end of method

    public static FedEx_UploadFilePage fedExUploadFilePage(File file) throws AWTException {
        FedEx_UploadFilePage fedExUploadFilePage = new FedEx_UploadFilePage(driver);
        return  fedExUploadFilePage;
    }//end of method

    public static FedEx_OrderPage fedExOrderPage(){
        FedEx_OrderPage fedExOrderPage = new FedEx_OrderPage(driver);
        return  fedExOrderPage;
    }//end of method

    public static FedEx_CartSummaryPage fedExCartSummaryPage(){
        FedEx_CartSummaryPage fedExCartSummaryPage = new FedEx_CartSummaryPage(driver);
        return  fedExCartSummaryPage;
    }//end of method

    public static FedEx_CheckoutPage fedExCheckoutPage(){
        FedEx_CheckoutPage fedExCheckoutPage = new FedEx_CheckoutPage(driver);
        return  fedExCheckoutPage;
    }//end of method


}//end of java class
