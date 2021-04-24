package Day6_032121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PracticeActionItem {

    public static void main(String[] args) throws InterruptedException {

        // set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        // define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();

        // set the drive to incognito (private)
        options.addArguments("incognito");

        // define the WebDriver
        WebDriver driver = new ChromeDriver(options);


        // navigate to mortgage calc Homepage
        driver.navigate().to("https://www.mlcalc.com/");
        Thread.sleep(2000);



        // verify the title with your expected

        String acutalTitle = driver.getTitle();
        if(acutalTitle.equals("Auto Loan Calculator")){
            System.out.println("Title matches");
        }else {
            System.out.println("Title does not match. Title is " + acutalTitle);
        } // end of condition




        // select, clear and store purchase price
        WebElement purchasePrice = driver.findElement(By.xpath("//input[@id='ma']"));
        purchasePrice.clear();
        purchasePrice.sendKeys("350000");

        // select, clear and store down payment
        WebElement downPayment = driver.findElement(By.xpath("//input[@id='dp']"));
        downPayment.clear();
        downPayment.sendKeys("5");

        // select, clear and store mortgage term
        WebElement mortgageTerm = driver.findElement(By.xpath("//input[@id='mt']"));
        mortgageTerm.clear();
        mortgageTerm.sendKeys("10");

        // select, clear and store interest rate
        WebElement interestRate = driver.findElement(By.xpath("//input[@id='ir']"));
        interestRate.clear();
        interestRate.sendKeys("2.5");


        // select start date month dropdown
        WebElement startMonth = driver.findElement(By.xpath("//select[@name='sm']"));
        Select dropdown = new Select(startMonth);
        dropdown.selectByVisibleText("May");

        // click and click on start date year dropdown
        WebElement startYear = driver.findElement(By.xpath("//select[@name='sy']"));
        startYear.click();
        driver.findElement(By.xpath("//*[text()='2020']")).click();

        Thread.sleep(2000);



        // click on calculate button
        driver.findElement(By.xpath("//input[@class='action-button button-danger button-main']")).click();



        // capture the monthly payment using findElements with first index
        String monthlyPayment = driver.findElements(By.xpath("//td[@class='big']")).get(0).getText();
        System.out.println("My monthly payment is " + monthlyPayment);



    } // end of main method
} // end of java class

