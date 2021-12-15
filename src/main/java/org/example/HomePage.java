package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage extends Utils{
    private String _ExpectedURL="https://demo.nopcommerce.com/";

    public void verifyHomepage()
    {
        String ActualURL=driver.getCurrentUrl();
        Assert.assertEquals(ActualURL,_ExpectedURL);
    }

    private By _RegisterButton= By.linkText("Register");
    public void clickOnRegisterButton()
    {
        clickOnElement(_RegisterButton);
    }

    private By _Computer=By.linkText("Computers");
    public void ClickOnComputerCategory()
    {
        clickOnElement(_Computer);
    }

    private By _AboutNopCommerce=By.linkText("About nopCommerce");
    public void ClickOnAboutNopCommerce()
    {
        ByVisibleElement(_AboutNopCommerce);
        clickOnElement(_AboutNopCommerce);
    }
}