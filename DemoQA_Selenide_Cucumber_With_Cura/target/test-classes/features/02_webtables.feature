@webtables
Feature: Webtables
  This feature includes /WebTables tests
  Background: First and must
    Given open "https://demoqa.com/webtables" page
    And click "Web Tables" button
    When click "Add" button

  Scenario: TC01 Webtables Tests
    Given fill Registration Form
    And click "Submit" button
    And wait 3 seconds
    Then click "Edit" button
    But  fix Registration Form
    And click "Submit" button
    And wait 3 seconds