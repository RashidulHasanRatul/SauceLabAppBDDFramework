Feature: Login Scenario

  Scenario Outline: Login with invalid username

    When I enter  username as "<username>"
    And I enter password as "<password>"
    And I click the login button
    Then Login should fail with an error message "<error>"
    Examples:
      | username      | password    | error                                                        |
      | standard_user | invalidPass | Username and password do not match any user in this service. |


  Scenario Outline: Login with invalid password
    When I enter  username as "<username>"
    And I enter  password as "<password>"
    And I click the login button
    Then  Login should fail with an error message "<error>"
    Examples:
      | username      | password    | error                                                        |
      | standard_user | invalidPass | Username and password do not match any user in this service. |


  Scenario Outline: Login with valid credentials

    When I enter  username as "<username>"
    And I enter  password as "<password>"
    And I click the login button
    Then I should see product page with tittle "<tittle>"
    Examples:
      | username      | password     | tittle   |
      | standard_user | secret_sauce | PRODUCTS |
