@a
Feature: Compare Functionality

  Background:
    Given The user on the home page
    And The user enters login credentials
    And The user navigates to Jackets page of Men Category

  Scenario: Verify that the product is added when the user clicks to product's Add to Compare button
    When The user clicks to Add to Compare button of any product
    Then Verify that the addition is successful by the text under Category Title
    When The user navigates to Compare List page
    And The user clicks to remove product button
    Then Verify that the product is removed from Compare List

  Scenario: Verify that the user can add more than one products to Compare List and compare them
    When The user clicks to Add to Compare button for more than one products
    And The user navigates to Compare List page
    Then Verify that more than one products are visible side by side and comparable
    When The user navigates to Jackets page of Men Category
    And The user clicks to clear all button
    Then Verify that compare list is cleaned



    #User Story: As a user, I should be able to search in the search engine.
    #Acceptance Criteria :
    #1- Verify that the product is added when the user clicks to product's Add to Compare button
    #2- Verify that the user can delete the product from Compare List
    #3- Verify that the user can see and compare more than 1 products in the Compare List
    #4- Verify that the user can see the product list at the left side of any category page
    #5- Verify that the user can clear all the compare list from the left side of any category page

