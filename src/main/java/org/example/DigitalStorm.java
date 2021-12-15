package org.example;

import org.openqa.selenium.By;

public class DigitalStorm extends Utils{
    private By _AddtoCart= By.xpath("//button[@id=\"add-to-cart-button-2\"]");
    private By _CloseButton=By.xpath("//span[@class=\"close\"]");
    private By _ShoppingCart=By.xpath("//span[@class=\"cart-label\"]");

    public void ClickOnAddToCart()
    {
        clickOnElement(_AddtoCart);
    }
    public void ClickOnClose()
    {
        clickOnElement(_CloseButton);
    }
    public void ClickOnShoppingCart()
    {
        clickOnElement(_ShoppingCart);
    }
}
