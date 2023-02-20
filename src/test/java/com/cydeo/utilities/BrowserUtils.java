package com.cydeo.utilities;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class BrowserUtils {
    public static void sleep(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
    public static void switchWindowAndVerify( String expectedInURL, String expectedInTitle){
        Set<String> allWindows = Driver.getDriver().getWindowHandles();

        for (String each : allWindows) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("current url: "+ Driver.getDriver().getCurrentUrl());
            if(Driver.getDriver().getCurrentUrl().contains(expectedInURL)){
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    public static void waitForInvisibilityOf(WebElement element){

        // Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        wait.until(ExpectedConditions.invisibilityOf(element));


    }
}
