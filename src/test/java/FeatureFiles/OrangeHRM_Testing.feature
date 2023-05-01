@ParallelTest
Feature: OrangeHRM Testing Project
  Scenario: OrangeHRM Recruitment Add Testing
    Given Navigate to Basqar
    When Login with admin username and  password.
    And Clicks on the Recruitment menu.
    And Clicks in the Vacancies field.
    And Clicks the Add button
    And Enters Oihan value in Vacancy name field
    And Enters the value of Software Engineer in the Job Title field.
    And We are looking for a skilled software engineer to join our team. enters the value.
    And Enters John Smith in the Hiring Manager field.
    And Enters the value five in the Number of Positions field.
    And Clicks the Save button.
    Then The user sees that the job posting has been successfully added.
    Then  Account Log out

