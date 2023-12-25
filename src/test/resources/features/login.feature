Feature: Login Functionality

  Background:
    Given The user on the home page
@nn
  Scenario: Basic Login
    When The user enters login credentials
    Then Verify that login is successful