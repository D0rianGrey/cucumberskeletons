Feature: Application login
  Scenario: Home page default login
    Given User in on Netbanking landing page
    When User login into application with "Eugene" and password "12345"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home page default login
    Given User in on Netbanking landing page
    When User login into application with "Roman" and password "54321"
    Then Home page is populated
    And Cards displayed are "false"