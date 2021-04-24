package Day12_041121;

import Day9_040321.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TestNG_Assertions {

    @Test
    public void assertions() throws IOException, InterruptedException {

        WebDriver driver = Reusable_Methods.defineTheDriver();

        driver.navigate().to("https://www.google.com");

        // using hard assert verify the google title
        //Assert.assertEquals("google",driver.getTitle());



        // using soft assert verify the google title
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("google",driver.getTitle());


        // enter something on google search
        Reusable_Methods.sendKeysMethod(driver,"//*[@name='q']","Cars","Search");


        // assertAll should be the last step on your test
        softAssert.assertAll();


    } // end of test


} // end of java class
