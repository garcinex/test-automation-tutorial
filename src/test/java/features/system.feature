Feature: Basic System test

  Scenario: Test is initialized
    Given Test is initialized

  Scenario: Im able to get current date
    Then System date is printed

  Scenario: Im able to get current time
    Then System time is printed

  Scenario: Im able to get OS
    Then OS is printed

  Scenario: Im able to get project localization
    Then Project localization is printed