@buttons
Feature: Buttons
  Scenario: TC01 Buttons Tests
    Given open "https://demoqa.com/elements" page
    And click "Buttons" button
    When click "Click Me" button
    Then check dynamic Click Message
    And wait 3 seconds
