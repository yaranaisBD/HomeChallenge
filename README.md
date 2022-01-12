# HomeChallenge
Home Challenge to apply as a QA Engineer for yellowpepper.com

- Home Challenge (Task 1 - Exploratory testing).xlsx file is related to the charters and information of Exploratory testing of Monefy mobile application. 
RESTful API Swagger Petstore automation testing project.

- PetstoreRESTAPI:	This test automation project is created for REST API Swagger Petstore. All the tests were implemented using REST Assured and Java. The test cases proposed for Automation are:

    - Pet Endpoint:
    
          Creating a new pet.
          
          Finding pet by id.
          
          Finding pet by Status.
          
          Finding pet by Tags.
          
          Updating pet by id.
          
          Deleting pet by id.

    - Store Endpoint:

          Getting the inventory status.
          
          Submitting a new order.
          
          Getting an order by id.
          
          Deleting an order.

    - User Endpoint
   
          Creating a new user.
          
          Creating a list of new users.
          
          Getting uses details by username.
          
          Log in to an user.
          
          Log out the active session.
          
          Update users.
          
          Delete an user.

    **How to run Swagger Petstore with maven.**

    Clone this project: https://github.com/swagger-api/swagger-petstore
    To run the server, run this task: mvn package jetty:run. This will start Jetty embedded on port 8080.
    Once started, you can navigate to http://localhost:8080/api/v3/openapi.json to view the Swagger Resource Listing. This tells you that the server is up and ready to demonstrate Swagger.
    
    **How to Run Automated Tests**
    
    Using eclipse: Run any specific test or group of tests. You can use the following Tags:
    Pet: Pet,GETPet, PUTPet, POSTPet,DeletePET.
    Store: Store, GETStore, POSTStore,DeleteStore.
    User: User, GETUser, PUTUser, POSUser, DeleteUser.
    
    **Technology used**
    
    Java
    
    Maven
    
    Junit
    
    REST Assured
    
    Eclipse
    
    Git
    
    **Possible improvements**
    Test reports.
    Dynamic data creation.
    Better logger reports.
