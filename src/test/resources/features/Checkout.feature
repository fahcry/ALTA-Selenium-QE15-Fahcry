Feature: Checkout test
  @saucedemo1
  Scenario: Checkout product saucelabs backpack until complete
    When User login with valid username "standard_user" and password "secret_sauce"
    And Add to cart button saucelabs backpack is displayed
    And Click add to cart saucelabs backpack
    And Click cart icon
    And Click checkout button
    And Input first name "Fahcry" and last name "Syaputra" and postal code "12345"
    And CLick continue button
    And Click finish button
    Then Should be displayed checkout complete with title "Thank you for your order!"