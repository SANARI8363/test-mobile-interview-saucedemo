Feature: Use Shopping Cart

  Scenario: Buying different products at SwagLabs
    Given that "Sandra" signed-in SwagLabs app
    When He puts in the cart these products
      | products                          |
      | Camisa Sauce Labs Bolt            |
      | Luz de bicicleta Sauce Labs       |
      | Chamarra Sauce Labs               |
    And He does the checkout of his purchase
    Then He should see the message "CHECKOUT: COMPLETE!"