package Day7_032721;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class HandlingTabs {

    public static void main(String[] args) throws InterruptedException {

        // kill all chrome instances that are opened
        //Runtime.getRuntime().exec("killall -KILL chromedriver");

        Thread.sleep(1500);

        // set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        // define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();

        // set the drive to incognito (private)
        options.addArguments("incognito");

        // define the WebDriver
        WebDriver driver = new ChromeDriver(options);


        // navigate to oxford health homepage
            driver.navigate().to("https://www.oxhp.com/");

        Thread.sleep(3000);


        // using contains only choose the unique portion of the value
        // to click on members link
        driver.findElement(By.xpath("//*[contains(@onmouseover, '/images/home/members_hm_on')]")).click();

        Thread.sleep(3000);


        // click on find a physician link
        driver.findElement(By.xpath("//*[contains(@onclick, '/secure/providerSearch/DoctorNetwork')]")).click();


        // using Arraylist we can switch to new tab (1)
        ArrayList tabs = new ArrayList<String>(driver.getWindowHandles());

        // switch to new tab 2
        driver.switchTo().window((String) tabs.get(1));

        Thread.sleep(1000);


        // click on metro to verify you are on that new tab
        try{
            driver.findElements(By.xpath("//a[@target='_blank']")).get(0).click();
        }
        catch (Exception e){
            System.out.println("Unable to click on Metro link. " + e);
        }


        // close the new tab
        driver.close();

        //switch back to old tab
        driver.switchTo().window((String) tabs.get(0));


    } // end of main method
} // end of java class
