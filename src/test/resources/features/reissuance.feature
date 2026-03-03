Feature:  Certificate Reissuance flow

  Background:
  //Given User navigate to VITALREG portal
    When user enter valid email and password
    And clicks on SIGN IN
    Then user is successfully logged in

  @regression
  Scenario: reissuance of certificate
    Given user is successfully logged in to get certificate reissuace
    When user checks on all requirement terms
    And user proceeds to payment