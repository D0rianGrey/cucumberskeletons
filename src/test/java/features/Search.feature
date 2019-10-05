Feature: Search and place order for vegetables

  @SeleniumTest
  Scenario: Search for items and validate results
    Given User is on Greencart Landing page
    When User searched for Cucumber Vegetable
    Then "Cucumber" results are displayed

  @SeleniumTest1
  Scenario Outline: Search for items and validate results and then move to checkout page
    Given User is on Greencart Landing page
    When User searched for <Name> Vegetable
    And Added items to cart
    And User proceeded to Checkout page for purchase
    Then Verify selected <Name> items are displayed in Check out page

    Examples:
      | Name     |
      | Brinjal  |
      | Beetroot |
