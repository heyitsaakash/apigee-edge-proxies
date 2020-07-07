@core
Feature:
  Petstore exposes various resources that facilitate and demonstrate APIGEE Integration testing
  As APIGEE client I want to verify that all API resources are working as they should

Scenario: Add New Pet POST request - Success 200 OK
    Given I set body to {"id":"5656","name":"Bela Bardog","photourls":[],"tags":[],"status":"available"}
    And I set headers to 
    | name          | value 		   |
	| Content-Type  | application/json |

    When I POST to /v2/pet
    Then response code should be 200
	And response body path $.id should be 5656
    And response body path $.name should be Bela Bardog
    And response body path $.status should be available



  Scenario: Pet By ID GET request - Success 200 OK
    Given I set Content-type header to application/json
    When I GET /v2/pet/5656
    Then response code should be 200

  Scenario: Pet By ID GET request - Invalid 404 Not Found
    Given I set Content-type header to application/json
    When I GET /v2/pet/56561	
    Then response code should be 400
    And response body path $.message should be Pet not found
    
