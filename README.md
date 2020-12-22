# Jenkins Docker Spring React Cluster Project

* **Objective** - To create a product a Jenkins Pipeline which
	* dockerizes a `Spring` application of `Maven` archetype
	* dockerizes a `React` application
* **Purpose** - To gain familiarity with running multiple docker containers in a single Jenkins pipeline.


### Part 1 - Dockerizing Jenkins
1. [Running Jenkins from within a Docker Container](https://curriculeon.github.io/Curriculeon/lectures/containerization/docker/dockerizing-jenkins/content.html)
	* This instance of Jenkins should require NO additional plugins as it will be running all builds within a container which has all necessary dependencies for the respective application to run.

### Part 1 - Create Dockerized Maven Pipeline with this Project
* Create a Jenkins pipeline which
	1. [Pulls a docker _image_ with `Git`, `Java` and `Maven` installed](https://hub.docker.com/r/jamesdbloom/docker-java8-maven)
	2. Creates a docker _container_ from the aforementioned docker _image_.
	3. `git clone`s [a maven Application](https://github.com/curriculeon/jenkins.docker.spring.react_projecttemplate/tree/master/src) into the container.
	4. `.jar`s the cloned maven application within the container by leveraging command below
		* `mvn package`
	5. runs `Spring` application using the `.jar` in container by leveraging command below
		* `java -jar target/${name-of-jar}.jar`
	6. ensure output of build is displayed by Jenkins
* **Note**
	* Steps `d` and `e` can be done in one step by leveraging the command below
		* `mvn spring-boot:run`
		

### Part 1 - Creating Maven Pipeline with this Project
	* Create a Jenkins pipeline which
		1. Pulls a docker _image_ with `Git`, and `Node` installed
		2. Creates a docker _container_ from the aforementioned docker _image_.
		3. `git clone`s [a maven Application](https://github.com/curriculeon/jenkins.docker.maven_java-fundamentals) into the container.
		4. `.jar`s the cloned maven application within the container.
		5. runs JUnit tests and ignore failures on `.jar` in container by leveraging command below
			* `mvn package -Dmaven.test.failure.ignore=true`
		6. ensure output of build is displayed by Jenkins


### Part 1 - Creating Maven Pipeline with this Project
* Create a Jenkins pipeline which
	1. [Pulls a docker _image_ with `Git`, `Java` and `Maven` installed](https://hub.docker.com/r/jamesdbloom/docker-java8-maven)
	2. Creates a docker _container_ from the aforementioned docker _image_.
	3. `git clone`s [a maven Application](https://github.com/curriculeon/jenkins.docker.spring.react_projecttemplate/tree/master/src) into the container.
	4. `.jar`s the cloned maven application within the container by leveraging command below
		* `mvn package`
	5. runs `Spring` application using the `.jar` in container by leveraging command below
		* `java -jar target/${name-of-jar}.jar`
	6. ensure output of build is displayed by Jenkins
* **Note**
	* Steps `d` and `e` can be done in one step by leveraging the command below
		* `mvn spring-boot:run`
