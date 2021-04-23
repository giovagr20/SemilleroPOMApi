# Language: en
  ##Author: Giovanni Gomez Restrepo - giovannig.gomez@sqasa.co

  Feature: As a product owner
    I want to get a single user
    To verify service availability

  Background:
    Given the user verify internet connection

  @Case1
  Scenario: Get single user successfully
    When the user requests to single user
    Then the user validates response 200

  @Case2
  Scenario: Get wrong single user
    When the user requests wrong single user
    Then the user validates response 404