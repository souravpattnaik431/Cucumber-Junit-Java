Feature: Perform Credit Card Transaction
  @CardTest
  Scenario: Perform credit card transaction for axis bank
    Given User is on credit card Page
    When User selects Axis bak
    Then Transaction perform successfully for axis bank

  @CardTest
  Scenario: Perform credit card transaction for hdfc bank
    Given User is on credit card Page
    When User selects hdfc bak
    Then Transaction perform successfully for hdfc bank

