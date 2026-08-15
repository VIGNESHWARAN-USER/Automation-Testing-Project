@Malavicka @Notification
Feature: V_MALAVICKA_2026_08_12_SmartHospital_Notification_Search


  As a hospital staff member
  I want to search notifications
  So that I can quickly find notifications related to IPD


  Background:
    Given the user launches the application
    And the user is on the login page
    When the user clicks the "Doctor" button
    And clicks on the Login button
    Then the user should be navigated to the dashboard page


  Scenario: Search for IPD related notifications
    When the user clicks on the notification option
    And the user searches for "IPD" in the notification search field
    Then the IPD related notification should be displayed