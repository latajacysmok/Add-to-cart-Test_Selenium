# new feature
# Tags: optional

Feature: A description

  Scenario Outline: A scenario
    Given User navigate to "http://automationpractice.com/" using "<browser>"
    When User selects a "<category>"
    And User select a "<type of dress>"
    And User select a new "<dress>"
    And User add "<dress>" to cart
    Then User checks the purchase in the cart

    Examples:
      |browser|category|type of dress  |dress        |
      |CHROME | DRESSES|EVENING DRESSES|Printed Dress|
      #|FIREFOX|