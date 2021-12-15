package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends Utils{

    private By _Desktop= By.xpath("//img[@title=\"Show products in category Desktops\"]");

    public void ClickonDesktop()
        {
            clickOnElement(_Desktop);
        }
}
