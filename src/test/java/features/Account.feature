Feature: Portal login

  Background:
    Given Validate the browser
    When Browser is triggered
    Then Check if browser is started

  @PortalTest
  Scenario: Home page default login
    Given User in on Netbanking landing page
    When User login into application with "Eugene" and password "12345"
    Then Home page is populated
    And Cards displayed are "true"

  @PortalTest
  Scenario: Home page default login
    Given User in on Netbanking landing page
    When User login into application with "Roman" and password "54321"
    Then Home page is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario: Home page default login
    Given User in on Netbanking landing page
    When User login into application with "Roman" and password "54321"
    Then Home page is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario: Home page default login
    Given User in on Netbanking landing page
    When User sign up with following details
      | Jenny | abcd | john@gmail.com | Austalia | 0980678900 |
    Then Home page is populated
    And Cards displayed are "false"

  @PortalTest
  Scenario Outline: Home page default login
    Given User in on Netbanking landing page
    When User login in to application with <Username> and password <Password>
    Then Home page is populated
    And Cards displayed are "true"

    Examples:
      | Username | Password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |