package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductEmailAFriend extends Utils{
    LoadProperty loadProperty=new LoadProperty();

    private By _PageHeading = By.xpath("//a[@class=\"product\"]");

    String _expectedText = "Build your own computer";
    public void VerifyUserIsOnProductEmailAFriendPage() {
        Assert.assertEquals(getTextFromElement(_PageHeading), _expectedText);
    }

    private By _FriendEmail=By.xpath("//input[@class=\"friend-email\"]");
    private By _YourEmail=By.xpath("//input[@class=\"your-email\"]");
    private By _PersonalMessage=By.xpath("//textarea[@name=\"PersonalMessage\"]");

    public void EmailAFriedForm()
    {
        typeText(_FriendEmail, loadProperty.getProperty("FriendEmail"));
        typeText(_YourEmail, loadProperty.getProperty("Email")+loadProperty.getProperty("Email1"));
        typeText(_PersonalMessage, loadProperty.getProperty("PersonalMessage"));
    }
    private By _SendEmail=By.xpath("//button[@name=\"send-email\"]");
    public void ClickOnSendEmailButton()
    {
        clickOnElement(_SendEmail);
    }
    private String _ExpectedMessage="Your message has been sent.";
    private By _ActualMessage=By.xpath("//div[@class=\"result\"]");

    public void verifyMessageSentSuccessfully()
    {
        Assert.assertEquals(getTextFromElement(_ActualMessage), _ExpectedMessage);
    }
}
