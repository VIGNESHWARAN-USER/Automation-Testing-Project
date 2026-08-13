@Under_Development_Mythily
Feature: Blood Issue Validation - Smart Hospital

  Background:
    Given the user launches the application
    And the user navigates to the admin login page
    When the user logs in as a Pathologist
    Then the Pathologist dashboard should be displayed

  @ValidateBloodIssue
  Scenario: Verify the selected blood bag is pre-selected in the Blood Issue form
    When the user clicks the Blood Bank menu
    And the user opens the Blood Status page
    And the user stores the blood bag number from the Blood table
    And the user clicks the Issue button for that blood bag
    Then the Blood Issue form should be displayed