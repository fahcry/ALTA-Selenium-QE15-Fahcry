Feature: Product Test
  Scenario: Verify product saucelabs backpack is displayed and remove the product saucelabs backpack
    When User login with valid username "standard_user" and password "secret_sauce"
    Then On the product page verify the saucelabs backpack is displayed
    And Add to cart button saucelabs backpack is displayed
    And Click add to cart saucelabs backpack
    And Remove button on the saucelabs backpack is displayed