package Day7_032721;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Exception_Example {

    public static void main(String[] args) throws InterruptedException, IOException {

        // kill all chrome instances that are opened
        Runtime.getRuntime().exec("killall -KILL chromedriver");

        Thread.sleep(1500);

        // set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        // define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();

        // set the drive to incognito (private)
        options.addArguments("incognito");

        // define the WebDriver
        WebDriver driver = new ChromeDriver(options);


        // navigate to  bing Homepage
        try{
            driver.navigate().to("https://www.bing.com/");
        } catch (Exception e) {
            System.out.println("Unable to navigate to bing. " + e);
        } // end of of navigate exception

        Thread.sleep(2500);



        // enter a keyword on search field
        try{
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

        } catch (Exception e) {
            System.out.println("Unable to enter keyword on search field. " + e);
        } // end of search exception



        // click on search icon
        try{
            driver.findElement(By.xpath("//*[@for='sb_form_goo']")).click();

        } catch (Exception e) {
            System.out.println("Unable to click on search icon. " + e);
        } // end of search icon exception



    } // end of main method
} // end of java class
