Feature: add products to the shopping cart and verify the cart at checkout

  As a user of DemoNopeCommerce website, I want to add products to cart and make sure that they are on the checkout page.
  @Test
  Scenario: User should able to add desktop products to cart
    Given user is on homepage
    When user click on Computers category
    And user click on Desktop sub-category
    And user click on Digital Storm VANQUISH Custom Performance PC
    And use click on ADD TO CART button
    And user click on shopping cart
    Then Verify if Digital Storm VANQUISH Custom Performance PC is added to shopping cart
