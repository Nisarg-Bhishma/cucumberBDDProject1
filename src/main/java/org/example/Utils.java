package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Utils extends BasePage{
    public static void waitUntilElementClickable(By by, int Time) {
        //Wait re-usable method, to wait until element is live
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitUntilElementVisible(By by, int Time) {
        //Wait re-usable method, to wait until element is visible
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void clickOnElement(By by) {// click on element re-usable method
        driver.findElement(by).click();
    }

    public static String getTextFromElement(By by) {// re-usable method to get text from element
        return driver.findElement(by).getText();
    }

    public static void typeText(By by, String text) {// re-usable method to type text in text-box
        driver.findElement(by).clear(); // Clears pre-existing text from the element if any existed
        driver.findElement(by).sendKeys(text);
    }

    public static void selectFromDropDownByVisibleText(By by, String value1) {
        // re-usable method to select option from DropDown box by visible option
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value1);
    }

    public static void selectFromDropDownByIndex(By by, int n1) {
        // re-usable method to select option from DropDown box by index value of element
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(n1);
    }

    public static void selectFromDropDownByValue(By by, String value2) {
        // re-usable method to select option from DropDown box
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value2);
    }

    public static long timeStamp() {// re-usable method to get timestamp
        return (System.currentTimeMillis());
    }

    public static void javaScriptClick(By by){//re-usable method to click on element
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", element);
    }
    public static void  takeScreenShot(String ScreenShotName){
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile=new File("src\\test\\java\\ScreenShots\\SS_"+timeStamp()+".png");
        try {
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void ByVisibleElement(By by)
    {
        //re-usable method to scroll the page till element is found
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(by);
        js.executeScript("arguments[0].scrollIntoView();", Element);

    }
}
