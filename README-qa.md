# Test Automation Developer Notes

* The `JUnit` tests in the following application are built using [Leonium](https://www.github.com/git-leon/leonium), a [Selenium]() wrapper framework.
* To run the tests in this application execute the command below
	* `mvn package -Dmaven.test.failure.ignore=true`
* To modify the port that to access the Web Application, modify the `application.properties` file located in the `src/main/resources` directory.
* To switch to a [Headless Browser](), modify the [BrowserDeclaration in the test classes]() to use `PhantomJS`.

## Running Tests
[![](./run-selenium-tests.gif)](./run-selenium-tests.gif)