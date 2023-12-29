@ab
Feature: Category Function

  Background:
    Given The user on the home page

    Scenario Outline:The user should be able to navigate to NestedSubSection Pages.
      When The user hovers over on the "<Category>"and "<SubCatButton>" and clicks "<NestedSubCatButton>"
      Then Verify that the user is directed to "<NestedSubSection>" page
      Examples:
      |Category|SubCatButton|NestedSubCatButton|NestedSubSection|
      | Women   | Tops       | Jackets          |               |
      | Women   | Tops       | Hoodies          |               |
      | Women   | Tops       | Tees             |               |
      | Women   | Tops       | Tanks            |               |
      | Women   | Bottoms    | Pants            |               |
      | Women   | Bottoms    | Shorts           |               |
      | Men     | Tops       | Jackets          |               |
      | Men     | Tops       | Hoodies          |               |
      | Men     | Tops       | Tees             |               |
      | Men     | Tops       | Tanks            |               |
      | Men     | Bottoms    | Pants            |               |
      | Men     | Bottoms    | Shorts           |               |


Scenario Outline: AB1
  When the user hovers over over the "<GearButton>" and clicks to the "<SubGearButton>"
  Then Verify thet the user is on the "<SubGear>"page
  Examples:
  |SubGearButton|SubGear|
  | Bags       |        |
  | Fitness    |        |
  | Watches    |        |


  Scenario Outline: AB2
    When the user hovers over over the "<TrainingButton>" and clicks to the "<SubTrainingButton>"
    Then Verify thet the user is on the "<SubTraining>"page
    Examples:
      |TrainingButton|SubTraining|
      | Bags       |             |
      | Fitness    |             |
      | Watches    |             |

  Scenario: Naveigate to Sale Page
  When the user clicks on the "<SaleButton>"
  Then Verify that the user is on the "<Sale>" Page


   # User Story: As a user, I should be able to navigate to product pages by clicking each category and sub-category buttons.
   #Acceptance criteria:
   #1-Verify that the user should able to navigate to products pages, by hovering and clicking “Category“ and “Sub-category” buttons.button.


