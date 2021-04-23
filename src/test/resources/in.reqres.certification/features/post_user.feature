# Language: en
  ## Author: Giovanni G R - gg@sqa.co

  Feature: As a product owner
    I want to post a new user
    To verify if it is created

    Background:
      Given the user verify internet connection

  @Case1
  Scenario: Post user successfully
    When the user creates a new client
    | _name      |  _job                  |
    | Popeye   |  Developer Automation |
    Then verify status code 201
