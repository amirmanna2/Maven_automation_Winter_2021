package Day12_041121;

import ReusableLibrary.Abstract_Class;
import ReusableLibrary.Reusable_Actions;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class testZillow extends Abstract_Class {

    @Test
    public void houseByZipCode() throws InterruptedException {



        // Create array list


        ArrayList<String> findByZip = new ArrayList<String>();

        findByZip.add("10462");
        findByZip.add("10451");
        findByZip.add("10452");


        for (int i = 0; i < findByZip.size(); i++) {

            //navigate to homepage
            driver.navigate().to("https://www.century21.com/");
            Thread.sleep(2500);

            //enter zipcode
            try {
                Reusable_Actions.sendKeysMethod(driver, "//input[@name='firstname']", findByZip.get(i), logger, "Enter ZipCode");
            } catch (Exception e) {
                System.out.println("Unable to navigate to usps. " + e);
            }//end of navigate exception

            Thread.sleep(2000);



            //click on search button
            Reusable_Actions.clickOnHoverElement(driver,"//button[@id='free-text-search-button']",0,logger,"Click on search icon");

            Thread.sleep(3000);


            //click on first house
            Reusable_Actions.clickOnHoverElement(driver,"//div[contains(@class, 'infinite-item')]",0,logger,"Click on first house");

            Thread.sleep(3000);





            // capture the monthly payment using findElements with first index
            String houseDetails = driver.findElements(By.xpath("//div[@class='pdp-info-price-wrap']")).get(0).getText();
            System.out.println("This house details contains the following: " + houseDetails);
            logger.log(LogStatus.INFO, "This house details contains the following: " + houseDetails);

            Thread.sleep(2000);

        }

    }
}//end of java class