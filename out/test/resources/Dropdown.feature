Feature: seleniumeasy select Dropdown

  @Seleniumeasy
  Scenario: Select a day from dropdown
    Given user launch seleniumeasy
    When user select a day from single select dropdown list
    Then  user can see a selected day in message