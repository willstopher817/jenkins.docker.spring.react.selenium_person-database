# Test Automation Developer Notes

* The `JUnit` tests in the following application are built using [Leonium](https://www.github.com/git-leon/leonium), a [Selenium](https://www.selenium.dev/) wrapper framework.
* To run the tests in this application execute the command below
	* `mvn package -Dmaven.test.failure.ignore=true`
* To modify the port that to access the Web Application, modify the `application.properties` file located in the `src/main/resources` directory.
* To switch to a [Headless Browser](https://en.wikipedia.org/wiki/Headless_browser), modify the [BrowserDeclaration in the test classes](https://github.com/curriculeon/jenkins.docker.spring.react_person-database/blob/f847a700604b05f48833deb7c606c4562da55e0e/integration-testing-application/src/test/java/com/github/curriculeon/LandingPageTest.java#L32) to use `PhantomJS`.

## Running Tests
* This is an animation of the integration tests running,
	1. the Selenium application navigates to the WebApplication.
	2. the Selenium application fills out the form data.
	3. the Selenium application presses the submit button on the WebApplication.
	4. the WebApplication sends requests from the form-data to the Web Server
	5. the WebServer processes the request by accepting the creation of a new person.
	6. the WebServer sends the data to the database to be persisted as a new record.
	7. the WebServer checks to see if the data has been persisted in the database.
	8. the WebServer responds to the WebApplication with a HTTPStatus 200; OK
	9. the WebApplication updates the list of Users as per the WebServer's database report
	10. the Selenium application verifies that the newly created User is listed on the WebApplication

[![](./run-selenium-tests.gif)](./run-selenium-tests.gif)
