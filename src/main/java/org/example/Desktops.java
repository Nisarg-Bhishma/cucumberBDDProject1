package org.example;

import org.openqa.selenium.By;

public class Desktops extends Utils{

    private By _BYOC= By.linkText("Build your own computer");
    //private By _Desktop=By.linkText("Digital Storm VANQUISH 3 Custom Performance PC ");
    private By _Desktop=By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/h2[1]/a[1]");

    public void ClickonBuildYourOwnComputer()
    {
        clickOnElement(_BYOC);
    }
    public void clickOnDigitalStormDesktop()
    {
        clickOnElement(_Desktop);
    }
}
