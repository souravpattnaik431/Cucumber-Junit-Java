Feature: Buy products on store


  @RegressionTest
  Scenario: Buy mobile on application browser
    Given  User is on browser page
    When User added 1 product to cart
    Then mobile is bought

    @RegressionTest
    Scenario: Buy mobile on application mobile
      Given  User is on mobile page
      When User added 2 products to cart
      Then mobile is bought