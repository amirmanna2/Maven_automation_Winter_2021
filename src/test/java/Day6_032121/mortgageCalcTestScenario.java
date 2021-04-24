package Day6_032121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class mortgageCalcTestScenario {

    public static void main(String[] args) throws InterruptedException {

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


        // navigate to mortgage calc Homepage
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);



        // verify the title with your expected

        String acutalTitle = driver.getTitle();
        if(acutalTitle.equals("Mortgage Calculator")){
            System.out.println("Title matches");
        }else {
            System.out.println("Title does not match. Title is " + acutalTitle);
        } // end of condition




        // store home value first
        WebElement downPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));

        // clear home value and enter new data
        downPayment.clear();

        // enter the new down payment
        downPayment.sendKeys("220000");


        // select april on month dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        // select the locator using Select command
        Select dropdown = new Select(startMonth);

        // using by visible text command select month April
        dropdown.selectByVisibleText("Apr");


        // if dropdown is not under select tag then you have to use click command twice
        //click on dropdown
        startMonth.click();

        // click on dropdown value by text
        driver.findElement(By.xpath("//*[text()='May']")).click();

        Thread.sleep(4000);

        // capture the monthly payment using findElements with first index
        String monthlyPayment = driver.findElements(By.xpath("//div[@class='left-cell']")).get(0).getText();
        System.out.println("My monthly payment is " + monthlyPayment);

    } // end of main method
} // end of java class
