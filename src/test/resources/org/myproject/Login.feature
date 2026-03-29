Feature: Application login

  Background: Precondition Test case
    Given User is on System
    When User selects browser
    Then Browser opened successfully


  @RegressionTest
  Scenario: Home page valid login
    Given  User is on landing page
    When User login with username "user1" and password "pwd1"
    Then Home page is displayed "true"
    And Cards are displayed "true"

  @SanityTest
  Scenario: Home page invalid login
    Given  User is on landing page
    When User login with username "user2" and password "pwd2"
    Then Home page is displayed "false"
    And Cards are displayed "false"

  @RegressionTest@SmokeTest
  Scenario: Home page datatable login
    Given  User is on landing page
    When User sign up with the following details
    |user3|Bhubaneswar|user3@gmail.com|India|751010|
    Then Home page is displayed "true"
    And Cards are displayed "true"

  @SmokeTest
  Scenario Outline: Home page parameterized login
    Given  User is on landing page
    When User login with username "<Username>" and password "<Password>" parameters
    Then Home page is displayed "true"
    And Cards are displayed "true"
    Examples:
     |Username  |Password|
     |user5     |pwd5    |
     |user6     |pwd6    |
     |user7     |pwd7    |
     |user8     |pwd8    |

