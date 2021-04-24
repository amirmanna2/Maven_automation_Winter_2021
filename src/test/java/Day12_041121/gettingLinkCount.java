package Day12_041121;

import Day9_040321.Reusable_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class gettingLinkCount {

    @Test
    public void linkCount() throws InterruptedException, IOException {

        WebDriver driver = Reusable_Methods.defineTheDriver();

        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(3000);


        // store the arraylist with class attribute for the links
        ArrayList <WebElement> linkCount = new ArrayList(driver.findElements(By.xpath("//*[contains(@class,'_yb_12gb1')]")));

        // print out the count links
        System.out.println("Link count is " + linkCount.size());


        // I want to click on each link and navigate back to the page

        for(int i = 0; i < linkCount.size(); i++){

            driver.navigate().to("https://www.yahoo.com");
            ArrayList <WebElement> clickLink = new ArrayList(driver.findElements(By.xpath("//*[contains(@class,'_yb_12gb1')]")));

            Thread.sleep(5000);
            clickLink.get(i).click();
            Thread.sleep(5000);


        }



    } // end of test


} // end of java class
