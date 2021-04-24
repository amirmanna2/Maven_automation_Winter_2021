package Day5_032021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingIterationWithGoogleSearch {

    public static void main(String[] args) throws InterruptedException {

        // iterate through multiple cities on google search and print out the number each time

        // declare and define the array list
        String[] cities = new String[3];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Bronx";


        // set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        // define the WebDriver
        WebDriver driver = new ChromeDriver();


        // you actual use case from start to end should go inside for/while loop for multiple iteration
        for (int i = 0; i < cities.length; i++){

            // navigate to Google Homepage
            driver.navigate().to("https://www.google.com");

            // maximize the driver
            driver.manage().window().maximize();

            // sleep statement when you go to a specific url page
            Thread.sleep(3000);

            // enter a keyword on google search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities[i]);

            // hit submit on google search button
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();

            // capture the search result but only print out the search number
            String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

            // Split and extract out the search number
            String[] arrayResults = searchResult.split(" ");

            // Print the search number
            System.out.println("The city " + cities [i] + " search number is " + arrayResults[1]);

        } // end of for loop


        // quit the driver
        driver.quit();


    } // end of main method
} // end of java class
