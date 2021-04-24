package Day6_032121;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {

    public static void main(String[] args) {

        // set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        // define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();

        // maximize my driver // does not work on mac
        //options.addArguments("start-maximized");

        // set the drive to incognito (private)
        options.addArguments("incognito");

        // set it to headless
        //options.addArguments("headless");


        // define the WebDriver
        WebDriver driver = new ChromeDriver(options);


        // navigate to Google Homepage
        driver.navigate().to("https://www.google.com");






    } // end of main method
} // end of java class
