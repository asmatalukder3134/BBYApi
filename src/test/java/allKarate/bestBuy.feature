feature : best buy api test
  @ShTest7
  Scenario: Get demo
    Given url 'https://reqres.in/api/users'
    And request '{"name": "Shamim","job": "Automation eng"}'
    When method POST
    Then status 201
    And print response
    Given url 'https://reqres.in/api/users'
    When method GET
    Then status 200
    Then match response.data[0].email contains "george"
    And print response