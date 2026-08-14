@Mythily
Feature: S_MYTHILY_2026_06_01_Applying for Leave Validation - Smart Hospital

  Background:
    Given the user launches the application
    And the user navigates to admin login
    When the user clicks on the Pathologist login button
    Then the user should be redirected to the Pathologist dashboard
    When the user clicks the Human Resource menu
    And the user clicks the Leaves option
    And the user clicks the Apply Leave option

  @AppliedLeaveWithValidCredential
  Scenario Outline: Apply leave with valid details
    When the user selects the leave type
    And the user selects the Leave From Date
    And the user selects the Leave To Date
    And the user enters "<reason>"
    And the user attaches the document
    And the user clicks the Save button
    Then the "Record Saved Successfully" message should appear

    Examples:
      | reason           |
      | Personal Leave   |
      | Medical Emergency|
      | Family Function  |