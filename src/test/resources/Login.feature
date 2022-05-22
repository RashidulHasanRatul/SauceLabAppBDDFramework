Feature: Login Scenario
  scenario Outline: Login with invalid username

  When I enter  username as "<username>"
  And I enter  password as "<password>"
  And I click the login button
  Then Login should fail with an error message "<error>"

    Example: Login with invalid username
    | username | password | err|
    | standard_user | invalidPass| Username and password do not match any user in this service. |

  scenario Outline: Login with invalid password

    When I enter  username as "<username>"
    And I enter  password as "<password>"
    And I click the login button
    Then  Login should fail with an error message "<error>"

    Example: Login with invalid username
    | username | password | err|
    | invalidUserName | secret_sauce| Username and password do not match any user in this service. |

    scenario Outline: Login with valid credentials

      When I enter  username as "<username>"
      And I enter  password as "<password>"
      And I click the login button
      Then I should see product page with tittle "<tittle>"

    Example: Login with invalid username
    | username | password | tittle|
    | standard_user | secret_sauce| PRODUCTS |