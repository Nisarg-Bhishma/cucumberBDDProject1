Feature: Refer a product to friend

  As a registered user, I want to refer a product from desktop page on DemoNopeCommerce website successfully to a friend
  @Test
  Scenario: User should able to refer a product to friend successfully
    Given user is on homepage
    And user is already registered
    When user click on Computer category
    And user click on Desktops sub-category
    And user click on Build your own computer
    And user click on Email a friend button
    And user should able to see Email a friend page
    And use enters required details for email a friend form
    Then use should be able to send email to friend successfully