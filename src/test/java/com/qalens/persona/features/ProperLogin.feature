Feature: Login
  As a user i should be able to login with valid credentials only
  Scenario: Login with Inavlid Credentials
    Given I am on Login Page
    When I enter username "atmnk" and password "incorrect" and try to log in
    Then I see error message "Username or Password Entered is incorrect"

  Scenario: Login with Valid Credentials
    Given I am on Login Page
    When I enter username "atmnk" and password "correct" and try to log in
    Then I see Landing Page
