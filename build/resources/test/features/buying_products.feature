Feature: Use Shopping Cart

  Scenario: Buying any product at SwagLabs
    Given that "Sandra" signed-in SwagLabs app
    When She puts in the cart one product
    And She does the checkout of his purchase
    Then She should see the message "GRACIAS POR SU ORDEN"