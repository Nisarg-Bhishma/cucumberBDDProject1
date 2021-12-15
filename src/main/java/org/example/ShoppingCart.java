package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ShoppingCart extends Utils{
    //LoadProperty loadProperty=new LoadProperty();

    private By _AddedProduct= By.xpath("//tbody/tr[1]/td[3]/a[1]");


    String _expectedText = "Digital Storm VANQUISH 3 Custom Performance PC";

    public void VerifyProductIsInTheCart()
    {
        Assert.assertEquals(getTextFromElement(_AddedProduct), _expectedText);
    }
}