Feature: Continue Test
  Scenario: Search products that have been added to the cart then delete 1 product in the cart and continue shopping
    Given User login with valid username "standard_user" and password "secret_sauce"
    And Add to cart button saucelabs backpack is displayed
    When On the product page verify the saucelabs backpack is displayed
    And Click button filter and set Z to A "Name (Z to A)"
    And Verify the product Tshirt Red is Displayed
    And Click add to cart Tshirt Red
    And Click add to cart Tshirt Onesie
    And Click cart icon
    Then Verify the product Tshirt Red & Onesie on the checkout page
    And Remove button on the Tshirt Red
    Then CLick Continue Shopping button
