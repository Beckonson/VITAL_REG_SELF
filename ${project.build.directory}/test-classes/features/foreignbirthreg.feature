Feature:  Foreign birth notification flow

  Background:
  //Given User navigate to VITALREG portal
    When user enter valid email and password
    And clicks on SIGN IN
    Then user is successfully logged in

  @regression
  Scenario: Foreign birth notification
    Given user is successfully logged in to check for foreign birth motification
    When user checks on requirement terms
    And user proceeds with payment

