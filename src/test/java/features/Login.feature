Feature: Application login
  Scenario: Home page default login
    Given User in on Netbanking landing page
    When User login into application with "Eugene" and password "12345"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home page default login
    Given User in on Netbanking landing page
    When User login into application with username and password
    Then Home page is populated
    And Cards are not displayed