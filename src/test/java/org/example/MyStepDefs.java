package org.example;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    SuccessfullyRegister successfullyRegister=new SuccessfullyRegister();
    ComputersPage computersPage=new ComputersPage();
    Desktops desktops=new Desktops();
    BuildYourOwnComputerPage buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    ProductEmailAFriend productEmailAFriend=new ProductEmailAFriend();
    AboutNopCommerce aboutNopCommerce=new AboutNopCommerce();
    DigitalStorm digitalStorm=new DigitalStorm();
    ShoppingCart shoppingCart=new ShoppingCart();


    @Given("user is on registration page")
    public void user_is_on_registration_page()
    {

        homePage.clickOnRegisterButton();
    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details()
    {

        registerPage.RegisterForm();
    }
    @When("click on register submit button")
    public void click_on_register_submit_button()
    {

        registerPage.ClickOnRegisterButton();
    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully()
    {

        successfullyRegister.VerifyUserRegisteredSuccessfully();
    }

    @Given("user is on homepage")
    public void userIsOnHomepage() {

        homePage.verifyHomepage();
    }
    @And("user is already registered")
    public void userIsAlreadyRegistered() {

        homePage.clickOnRegisterButton();
        registerPage.RegisterForm();
        registerPage.ClickOnRegisterButton();
        successfullyRegister.ClickOnNopCommerceLogo();
    }

    @When("user click on Computer category")
    public void userClickOnComputerCategory() {

        homePage.ClickOnComputerCategory();
    }

    @And("user click on Desktops sub-category")
    public void userClickOnDesktopsSubCategory() {
        computersPage.ClickonDesktop();
    }

    @And("user click on Build your own computer")
    public void userClickOnBuildYourOwnComputer() {
        desktops.ClickonBuildYourOwnComputer();
    }

    @And("user click on Email a friend button")
    public void userClickOnEmailAFriendButton() {
        buildYourOwnComputerPage.ClickOnEmailafriendButton();
    }


    @And("user should able to see Email a friend page")
    public void userShouldAbleToSeeEmailAFriendPage() {

        productEmailAFriend.VerifyUserIsOnProductEmailAFriendPage();
    }

    @And("use enters required details for email a friend form")
    public void useEntersRequiredDetailsForEmailAFriendForm() {

        productEmailAFriend.EmailAFriedForm();
    }

    @Then("use should be able to send email to friend successfully")
    public void useShouldBeAbleToSendEmailToFriendSuccessfully() {

        productEmailAFriend.ClickOnSendEmailButton();
        productEmailAFriend.verifyMessageSentSuccessfully();
    }

    @When("user click on About nopCommerce")
    public void userClickOnAboutNopCommerce() {

        homePage.ClickOnAboutNopCommerce();

    }

    @And("user should able to see About nopCommerce page")
    public void userShouldAbleToSeeAboutNopCommercePage() {

        aboutNopCommerce.VerifyUserIsOnAboutNopCommercePage();
    }

    @And("user enters required details for comment form")
    public void userEntersRequiredDetailsForCommentForm() {

        aboutNopCommerce.LeaveYourComment();
    }

    @Then("user should be able to post comment successfully")
    public void userShouldBeAbleToPostCommentSuccessfully() {

        aboutNopCommerce.VerifyUserPostedCommentSuccessfully();
    }

    @When("user click on Computers category")
    public void userClickOnComputersCategory() {

        homePage.ClickOnComputerCategory();
    }

    @And("user click on Desktop sub-category")
    public void userClickOnDesktopSubCategory() {

        computersPage.ClickonDesktop();
    }

    @And("user click on Digital Storm VANQUISH Custom Performance PC")
    public void userClickOnDigitalStormVANQUISHCustomPerformancePC() {

        desktops.clickOnDigitalStormDesktop();
    }

    @And("use click on ADD TO CART button")
    public void useClickOnADDTOCARTButton() {

        digitalStorm.ClickOnAddToCart();
        digitalStorm.ClickOnClose();
    }

    @And("user click on shopping cart")
    public void userClickOnShoppingCart() {
        digitalStorm.ClickOnShoppingCart();
    }

    @Then("Verify if Digital Storm VANQUISH Custom Performance PC is added to shopping cart")
    public void verifyIfDigitalStormVANQUISHCustomPerformancePCIsAddedToShoppingCart() {
        shoppingCart.VerifyProductIsInTheCart();
    }
}
