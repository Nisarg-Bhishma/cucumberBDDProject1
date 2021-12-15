package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class AboutNopCommerce extends Utils{

    LoadProperty loadProperty=new LoadProperty();
    private By _ActualTitle= By.xpath("//div[@class=\"page-title\"]");
    String _expectedTitle="About nopCommerce";

    public void VerifyUserIsOnAboutNopCommercePage()
    {
        Assert.assertEquals(getTextFromElement(_ActualTitle), _expectedTitle);
    }
    private By _Title=By.xpath("//input[@class=\"enter-comment-title\"]");
    private By _Comment=By.xpath("//textarea[@class=\"enter-comment-text\"]");
    private By _NewComment=By.xpath("//button[@name=\"add-comment\"]");

    public void LeaveYourComment()
    {
        typeText(_Title,loadProperty.getProperty("Title"));
        typeText(_Comment,loadProperty.getProperty("Comment"));
        clickOnElement(_NewComment);
    }
    private By _SuccessMessage = By.xpath("//div[@Class=\"result\"]");
    String _expectedText = "News comment is successfully added.";

    public void VerifyUserPostedCommentSuccessfully() {
        Assert.assertEquals(getTextFromElement(_SuccessMessage), _expectedText);
    }

}