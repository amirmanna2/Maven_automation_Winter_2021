package Day6_032121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ActionItem3 {

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




        // Create array lists

        String[] purchasePrice;
        purchasePrice = new String[] {"350000", "300000", "250000"};

        String[] downPayment;
        downPayment = new String[] {"5", "4", "3"};

        String[] mortgageTerm;
        mortgageTerm = new String[] {"30", "20", "10"};

        String[] interestRate;
        interestRate = new String[] {"4.5", "3.5", "2.5"};

        String[] pMI;
        pMI = new String[] {"0.25", "0.50", "0.75"};

        String[] startMonth = new String[3];
        startMonth [0] = "May";
        startMonth [1] = "Jun";
        startMonth [2] = "Jul";

        String[] startYear = new String[3];
        startYear [0] = "2021";
        startYear [1] = "2022";
        startYear [2] = "2023";


        for (int i = 0; i < purchasePrice.length; i++) {


            // select, clear and store purchase price
            WebElement pP = driver.findElement(By.xpath("//input[@id='ma']"));
            pP.clear();
            pP.sendKeys(purchasePrice [i]);

            // select, clear and store down payment
            WebElement dP = driver.findElement(By.xpath("//input[@id='dp']"));
            dP.clear();
            dP.sendKeys(downPayment [i]);

            // select, clear and store mortgage term
            WebElement mT = driver.findElement(By.xpath("//input[@id='mt']"));
            mT.clear();
            mT.sendKeys(mortgageTerm [i]);

            // select, clear and store interest rate
            WebElement iR = driver.findElement(By.xpath("//input[@id='ir']"));
            iR.clear();
            iR.sendKeys(interestRate [i]);

            // select, clear and store PMI
            WebElement pMi = driver.findElement(By.xpath("//input[@id='mi']"));
            pMi.clear();
            pMi.sendKeys(pMI [i]);

            // select start date month dropdown
            WebElement sM = driver.findElement(By.xpath("//select[@name='sm']"));
            Select dropdownMonth = new Select(sM);
            dropdownMonth.selectByVisibleText(startMonth [i]);

            // click and click on start date year dropdown
            WebElement sY = driver.findElement(By.xpath("//*[@id='fpdy']"));
            Select dropdownYear = new Select(sY);
            dropdownYear.selectByVisibleText(startYear [i]);


            Thread.sleep(2000);


            // click on calculate button
            driver.findElement(By.xpath("//input[@class='action-button button-danger button-main']")).click();


            // capture the monthly payment using findElements with first index
            String monthlyPayment = driver.findElements(By.xpath("//td[@class='big']")).get(0).getText();
            System.out.println("My monthly payment is " + monthlyPayment);

            Thread.sleep(2000);

        } // end of for loop

    } // end of main method
} // end of java class

