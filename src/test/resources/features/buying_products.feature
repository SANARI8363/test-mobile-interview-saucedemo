Feature: Use Shopping Cart

  Scenario: Buying different products at SwagLabs
    Given that "Sandra" signed-in SwagLabs app
    When He puts in the cart these products
      | products                    |
      | Sauce Labs Backpack         |
      | Sauce Labs Bike Light       |
      | Sauce Labs Fleece Jacket    |
    And He does the checkout of his purchase
    Then He should see the message "CHECKOUT: COMPLETE!"