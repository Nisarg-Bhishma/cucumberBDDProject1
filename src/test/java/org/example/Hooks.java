package org.example;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utils{
    BrowserManager browserManager=new BrowserManager();
   @Before
    public void setupBrowser()
    {
        browserManager.setupWebBrowser();
    }
   @After
    public void teardownBrowser()
    {
        browserManager.closeBrowser();
    }
}
