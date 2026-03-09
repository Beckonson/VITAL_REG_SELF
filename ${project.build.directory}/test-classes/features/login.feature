Feature: login functionality
  @smoke @regression
  Scenario: Valid login
    //Given User navigate to VITALREG portal
    When user enter valid email and password
    And clicks on SIGN IN
    Then user is successfully logged in


  @regression, @smoke @regression
  Scenario Outline: Validating invalid login
    Then user enters "<email>" and "<password>" and verify the "<errorMessage>"
    Examples:
      |    email       |      password     |      errorMessage |
      | christy16@yopmail.com |passsss11   |Incorrect credentials supplied|
      | admxyz@gmail.com  |@Test12345   |Incorrect credentials supplied|
