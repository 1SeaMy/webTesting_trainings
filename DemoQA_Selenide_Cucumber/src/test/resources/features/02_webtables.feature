@webtables
Feature: Webtables
  Scenario: TC01 Webtables Tests
    Given open "https://demoqa.com/webtables" page
    And click "Web Tables" button
    When click "Add" button
    And fill Registration Form
    And click "Submit" button
    And wait 3 seconds
    Then click "Edit" button
    And  fix Registration Form
    And click "Submit" button
    And wait 3 seconds
