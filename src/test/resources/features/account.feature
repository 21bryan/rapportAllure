Feature: login users
  @open_modal
  Scenario: open modal
    Given user in the home page
    When  user click avatar in navbar
    Then  modal is open
