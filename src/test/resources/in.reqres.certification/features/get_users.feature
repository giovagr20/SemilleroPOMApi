# Language: en
  # Author: giovannig.gomez@sqasa.co - Giovanni Gomez R

  Feature: As a product owner
    I want to get users of reqres
    To verify available service

  Scenario: Get users successfully
    Given the user verify internet connection
    When the user request to get users
    Then verify status code 200
