package Day4_031421;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchResults {

    public static void main(String[] args) {


        // set the System property

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        // define the WebDriver with a variable to use

        WebDriver driver = new ChromeDriver();


        // navigate to Google Homepage

        driver.navigate().to("https://www.google.com");

        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("cars");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).click();




    } // end of main method

} // end of java class
