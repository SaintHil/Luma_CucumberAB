Feature: Category Function

  Background:
    Given The user on the home page

  @az
  Scenario Outline: Verification for Category Functionality
    When The user navigates to "<category>" and subcategory
    Then Verify that the user is on the selected "<category>" page

    Examples:
      | category   |
      | What's New |
      | Women      |
      | Men        |
      | Gear       |
      | Training   |
      | Sale       |
