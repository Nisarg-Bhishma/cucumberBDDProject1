package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils{
    public static LoadProperty loadProperty=new LoadProperty();
    public static final String BrowserName=loadProperty.getProperty("BrowserName");

    public void setupWebBrowser()
    {
        System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(loadProperty.getProperty("url"));
    }
    public void closeBrowser()
    {
        driver.close();
    }
}