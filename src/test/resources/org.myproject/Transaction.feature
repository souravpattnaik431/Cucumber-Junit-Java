Feature: Perform Credit Card Transaction
  @CardTest
  Scenario: Peform credit card transaction for axis bank
    Given User is on creditcard Page
    When User selects Axis bak
    Then Transaction perform successfully for axis bank

  @CardTest
  Scenario: Peform credit card transaction for hdfc bank
    Given User is on creditcard Page
    When User selects hdfc bak
    Then Transaction perform successfully for hdfc bank

