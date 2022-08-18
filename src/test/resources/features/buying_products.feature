Feature: Use Shopping Cart

  Scenario: Buying different products at SwagLabs
    Given that "Sandra" signed-in SwagLabs app
    When He puts in the cart these products
    And He does the checkout of his purchase
    Then He should see the message "GRACIAS POR SU ORDEN"