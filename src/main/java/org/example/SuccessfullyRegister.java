package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class SuccessfullyRegister extends Utils{
    private By _SuccessMessage = By.xpath("//div[@class='result']");
    String _expectedText = "Your registration completed";
    public void VerifyUserRegisteredSuccessfully()
    {
        Assert.assertEquals(getTextFromElement(_SuccessMessage), _expectedText);
    }

    private By _HomeButton=By.xpath("//img[@alt=\"nopCommerce demo store\"]");
    public void ClickOnNopCommerceLogo()
    {
        clickOnElement(_HomeButton);
    }
}