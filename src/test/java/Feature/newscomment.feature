Feature: Post a comment on one of the news

  As a user of DemoNopeCommerce website, I want to leave a comment on ome of the news of DemoNopeCommerce website
  @Test
  Scenario: User should able to post a comment on DemoNopeCommerce "About nopCommerce" news
    Given user is on homepage
    When user click on About nopCommerce
    And user should able to see About nopCommerce page
    And user enters required details for comment form
    Then user should be able to post comment successfully