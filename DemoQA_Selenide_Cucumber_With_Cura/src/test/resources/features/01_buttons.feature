@buttons
Feature: Buttons
  This feature includes /Buttons tests
  Background: First and must
    Given open "https://demoqa.com/elements" page
    And click "Buttons" button
    When click "Click Me" button

  Scenario: TC01 Buttons Tests
    Then check dynamic Click Message
    And wait 3 seconds