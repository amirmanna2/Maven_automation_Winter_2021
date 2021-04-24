package Day12_041121;

import Day9_040321.Reusable_Methods;
import ReusableLibrary.Abstract_Class_For_ActionItem6;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ActionItem6 extends Abstract_Class_For_ActionItem6{

        @Test
        public void end2EndExpressCheckout() throws IOException, BiffException, InterruptedException, WriteException {

        //locate the path for readable file that we created in excel
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/ActionItem5_Data.xls"));

        //create a writable workbook that will mimic the data from readable
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/ActionItem6_Data_Results.xls"), readableBook);

        //read everything from writable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //get the row count
        int rowCount = writableSheet.getRows();


        driver.navigate().to("https://www.express.com/");
        // close pop up
        Reusable_Actions.clickOnElement(driver,"//*[@id='closeModal']", logger, "Close Pop Up");

        //for loop will start to iterate through excel data
        for (int i = 1; i < rowCount; i++) {
            //columns are hard coded and row is dynamic(i)
            String size = writableSheet.getCell(0,i).getContents();
            String quantity = writableSheet.getCell(1,i).getContents();
            String firstName = writableSheet.getCell(2,i).getContents();
            String lastName = writableSheet.getCell(3,i).getContents();
            String email = writableSheet.getCell(4,i).getContents();
            String phone = writableSheet.getCell(5,i).getContents();
            String streetAddress = writableSheet.getCell(6,i).getContents();
            String zipcode = writableSheet.getCell(7,i).getContents();
            String city = writableSheet.getCell(8,i).getContents();
            String state = writableSheet.getCell(9,i).getContents();
            String ccNumber = writableSheet.getCell(10,i).getContents();
            String expMonth = writableSheet.getCell(11,i).getContents();
            String expYear = writableSheet.getCell(12,i).getContents();
            String cvvCode = writableSheet.getCell(13,i).getContents();

            //delete all cookies
            driver.manage().deleteAllCookies();

            //1. navigate to express website
            driver.navigate().to("https://www.express.com/");

            //2. Hover over to Men tab
            Reusable_Actions.hoverOverElement(driver,"//a[text()='Men']",logger, "Hover Men Tab");

            //3. On clothing section click on sweaters
            Reusable_Actions.clickOnHoverElement(driver,"//a[text()='Sweatshirts & Hoodies']", 0, logger, "Click on Sweaters");

            //4. Click on first sweater
            Reusable_Actions.clickOnElement(driver,"//a[@class='_1-wQg']", logger, "Click on first sweaters");

            //5. Click on a size
            Reusable_Actions.clickOnElement(driver,"//button[@value='"+ size +"']", logger, "Click on size");

            //6. Click on Add To Bag
            Reusable_Actions.clickOnElement(driver,"//button[text()='Add to Bag']",logger,"Click on Add To Bag");

            Thread.sleep(1000);

            //7. Click on View Bag on pop up
            Reusable_Actions.clickOnElement(driver,"//a[text()='View Bag']",logger,"Click on View Bag");

            //8. Change the quantity
            Reusable_Actions.dropdownByText(driver,"//select[@id='qdd-0-quantity']",quantity,logger,"Quantity");

            Thread.sleep(1000);

            //9. Click on Checkout
            Reusable_Actions.clickOnElement(driver,"//button[text()='Checkout']",logger,"Click on Checkout");

            //10. Click on Continue As Guest
            Reusable_Actions.clickOnElement(driver,"//button[text()='Checkout as Guest']",logger,"Click on Continue As Guest");

            Thread.sleep(3000);

            //11. Enter first name
            Reusable_Actions.sendKeysMethod(driver,"//*[@id='contact-information-firstname']",firstName,logger,"First Name");
            //12. Enter last name
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='lastname']",lastName,logger,"Last Name");
            //13. Enter email
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='email']",email,logger,"Email");
            //14. Re enter email to confirm
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='confirmEmail']",email,logger,"Confirm Email");
            //15. Enter Phone Number
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='phone']",phone,logger,"Phone Number");

            //16. Click on continue
            Reusable_Actions.clickOnHoverElement(driver,"//span[text()='Continue']",0,logger,"Click on continue");

            Thread.sleep(3000);

            //17. Enter street address
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='shipping.line1']",streetAddress,logger,"Street Address");
            //18. Enter zipcode
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='shipping.postalCode']",zipcode,logger,"zipcode");
            //19. Enter a city
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='shipping.city']",city,logger,"City");
            //20. Enter a state
            Reusable_Actions.dropdownByText(driver,"//select[@name='shipping.state']",state,logger,"State");
            //21. Click on continue
            Reusable_Actions.clickOnHoverElement(driver,"//span[text()='Continue']",0,logger,"Click on continue");

            Thread.sleep(3000);

            //21. Click on continue
            Reusable_Actions.clickOnElement(driver,"//span[text()='Continue']",logger,"Click on continue");

            //22. Enter fake credit card number
            Reusable_Actions.sendKeysMethod(driver,"//input[@id='creditCardNumberInput']",ccNumber,logger,"Credit Card");
            //23. Enter expiration date
            Reusable_Actions.dropdownByText(driver,"//select[@name='expMonth']",expMonth,logger,"Exp Month");
            //24. Enter expiration year
            Reusable_Actions.dropdownByText(driver,"//select[@name='expYear']",expYear,logger,"Exp Year");
            //25. Enter cvv code
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='cvv']",cvvCode,logger,"CVV Code");
            //26. Click on place order
            Reusable_Actions.clickOnElement(driver,"//span[text()='Place Order']",logger,"Place Order");

            Thread.sleep(3000);

            //27. Capture error message
            String errorMessage = Reusable_Methods.captureText(driver,"//div[@aria-label='Alert!']",0,"Error Message");

            //create a label so you can add it to a cell
            Label label = new Label(14,i,errorMessage);
            //add the label back to the sheet
            writableSheet.addCell(label);

            logger.log(LogStatus.INFO, "The error message is  " + errorMessage);

        }//end of loop



        //outside of the cell write back to writable workbook
        writableWorkbook.write();
        //close it
        writableWorkbook.close();


    }//end of test scenario

}//end of java class

















