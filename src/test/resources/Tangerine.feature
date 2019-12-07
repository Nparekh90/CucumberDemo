Feature: Validate Logmein button visibility

  @Tangerine
  Scenario: Validate LogMeIn button visibility
    Given I launch Tangerine website
    When I click LogMeIn button
    Then I validate LogIn button is disabled

    When I enter in userNAme field value
    Then I Validate Log Me In button is enabled on the page