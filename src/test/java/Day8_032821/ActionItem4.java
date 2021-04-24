package Day8_032821;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class ActionItem4 {

    public static void main(String[] args) throws InterruptedException {

        // kill all chrome instances that are opened
        //Runtime.getRuntime().exec("killall -KILL chromedriver");

        //Thread.sleep(1500);

        // set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        // define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();

        // set the drive to incognito (private)
        options.addArguments("incognito");

        // define the WebDriver
        WebDriver driver = new ChromeDriver(options);


        // Create array list

        ArrayList<String> findLocationByZip = new ArrayList<String>();

        findLocationByZip.add("10462");
        findLocationByZip.add("10451");
        findLocationByZip.add("10452");


        ArrayList<String> locationType = new ArrayList<String>();

        locationType.add("Post Office");
        locationType.add("Collection Boxes");
        locationType.add("Self-Service Kiosks");


        ArrayList<String> locationMile = new ArrayList<String>();

        locationMile.add("1 Mile");
        locationMile.add("10 Miles");
        locationMile.add("20 Miles");


        //1. navigate to usps home page
        try {
            driver.navigate().to("https://www.usps.com");
        } catch (Exception e) {
            System.out.println("Unable to navigate to usps. " + e);
        }//end of navigate exception

        Thread.sleep(2000);


        //2. verify the title with expected

        try {
            String acutalTitle = driver.getTitle();
            if (acutalTitle.equals("Welcome | USPS")) {
                System.out.println("Title matches");
            } else {
                System.out.println("Title does not match. Title is " + acutalTitle);
            } // end of condition
        }catch (Exception e){
            System.out.println("Unable to verify title. " + e);
        }

        //define the mouse actions
        Actions actions = new Actions(driver);


        for (int i = 0; i < findLocationByZip.size(); i++) {

            //navigate to usps home page
            try {
                driver.navigate().to("https://www.usps.com");
            } catch (Exception e) {
                System.out.println("Unable to navigate to usps. " + e);
            }//end of navigate exception

            Thread.sleep(2000);

            //3. hover over to 'Send' tab using mouse actions
            try {
                WebElement quickTools = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
                actions.moveToElement(quickTools).perform();
            } catch (Exception e) {
                System.out.println("Unable to hover to Send tab. " + e);
            }//end of send exception


            //4. click on 'Find USPS Locations'
            try {
                WebElement trackPackage = driver.findElement(By.xpath("//*[@class='tool-find']"));
                actions.moveToElement(trackPackage).click().perform();
            } catch (Exception e) {
                System.out.println("Unable to click on Find USPS Locations. " + e);
            }//end of track a package exception

            Thread.sleep(3000);


            //5. Enter desired zipcode from array list onto Find a Location
            try {
                WebElement trackingField1 = driver.findElement(By.xpath("//*[@id='city-state-input']"));
                trackingField1.click();
                trackingField1.sendKeys(findLocationByZip.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter value on zipcode. " + e);
            }//end of desired zipcode input exception


            //6. Enter location type from array list
            try {
                //store your element as WebElement
                WebElement trackingField2 = driver.findElement(By.xpath("//*[@id='post-offices-select']"));
                trackingField2.click();
                WebElement locationsTypes = driver.findElement(By.xpath("//*[text()='"+locationType.get(i)+"']"));
                actions.moveToElement(locationsTypes).click().perform();
            } catch (Exception e) {
                System.out.println("Unable to click on location type. " + e);
            }//end of desired zipcode input exception


            //7. Enter desired mile from array list
            try {
                //store your element as WebElement
                WebElement trackingField3 = driver.findElement(By.xpath("//*[@id='within-select']"));
                trackingField3.click();
               WebElement Miles = driver.findElement(By.xpath("//*[text()='"+locationMile.get(i)+"']"));
                actions.moveToElement(Miles).click().perform();
            } catch (Exception e) {
                System.out.println("Unable to click on miles. " + e);
            }//end of desired zipcode input exception


            Thread.sleep(1000);

            //8. click on search button using mouse actions
            try {
                //store your element as WebElement
                WebElement trackPackage = driver.findElement(By.xpath("//*[@id='searchLocations']"));
                actions.moveToElement(trackPackage).click().perform();
            } catch (Exception e) {
                System.out.println("Unable to click on search button. " + e);
            }//end of track a package exception

            Thread.sleep(3000);


            //9. Iteration of links

            try {
                ArrayList<WebElement> links = new ArrayList<>(driver.findElements(By.xpath("//div[@role='button']")));
                if (i==0) {
                    links.get(0).click();
                } else if (i==1){
                    links.get(1).click();
                }else  if(i==2){
                    links.get(2).click();
                }
            } catch (Exception e) {
                System.out.println("Iteration failed" + e);

            }
            Thread.sleep(2000);



            //10. Capture the address
            try {
                String address = driver.findElement(By.xpath("//*[@class=' address-wrapper']")).getText();
                System.out.println(address);
            }catch (Exception e){
                System.out.println("Cannot print out address. " + e);
            }

            //11. Capture the hours
            try {
                String hours = driver.findElement(By.xpath("//*[@class='hours-flex-section']")).getText();
                System.out.println(hours);
            }catch (Exception e){
                System.out.println("Cannot print out hours. " + e);
            }

            // divide the results to make it look better
            System.out.println("_____________________________________");

        } // end of for loop


    } // end of main method
} // end of java class
