Feature: Showing products functionality

  Background:
    Given The user on the home page


  Scenario Outline: AC1
    When the user hovers over the "<Section>" section and hovers over on the "<Subsection>" subsection
    And clicks on the "<Section>", "<NestedSubsection>" nested subsection
    Then the user should be redirected to the "<NestedSubsection>" nested subsection page

    Examples:
      | Section | Subsection | NestedSubsection |
      | Men     | Tops       | Jackets          |
      | Men     | Tops       | Hoodies          |
      | Men     | Tops       | Tees             |
      | Men     | Tops       | Tanks            |
      | Men     | Bottoms    | Pants            |
      | Men     | Bottoms    | Shorts           |
      | Women   | Tops       | Jackets          |
      | Women   | Tops       | Hoodies          |
      | Women   | Tops       | Tees             |
      | Women   | Tops       | Tanks            |
      | Women   | Bottoms    | Pants            |
      | Women   | Bottoms    | Shorts           |

  Scenario Outline: AC2
    When the user hovers over the "Gear" section
    And the user clicks to the "<Subsection>" section
    Then the user should be redirected to the "<Subsection>" nested subsection page

      Examples:
        | Subsection |
        | Bags       |
        | Fitness    |
        | Watches    |