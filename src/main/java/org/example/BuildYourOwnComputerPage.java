package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utils{
    private By _EmailaFriend= By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");

    public void ClickOnEmailafriendButton()
    {
        clickOnElement(_EmailaFriend);
    }
}
