Feature: Application login with Rule

  Rule: rule 1


  Background: Precondition Test case
    Given User is on System
    When User selects browser
    And clears browser cookies
    Then Browser opened successfully
    And it doesn't get hang


  @RegressionTest
  Scenario: Home page valid login with rule 1
    Given  User is on landing page
    * user having valid credentials
    * user having credit card
    When User login with username "user8" and password "pwd8"
    Then Home page is displayed "true"
    And Cards are displayed "true"




  Rule: rule 2

    @RegressionTest
    Scenario: Home page valid login with rule 2
      Given  User is on landing page
      But he doesn't have any credit card
      When User login with username "user9" and password "pwd9"
      Then Home page is displayed "true"
      And Cards are displayed "false"