package Day8_032821;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MortgageCalc_ScrollByElement {

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


        // navigate to Yahoo homepage
        driver.navigate().to("https://www.mortgagecalculator.org/");

        Thread.sleep(3000);


        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //store the locator as a element that I want to scroll by for a view
        WebElement viewLoan = driver.findElement(By.xpath("//*[text()='View Loan Breakdown']"));
        jse.executeScript("arguments[0].scrollIntoView(true);",viewLoan);




    } // end of main method
} // end of java class
