### Part 3 - Creating Pipeline
1. [Running Jenkins from within a Docker Container](https://curriculeon.github.io/Curriculeon/lectures/containerization/docker/dockerizing-jenkins/content.html)
	* This instance of Jenkins should require NO additional plugins as it will be running all builds within a container which has all necessary dependencies for the respective application to run.
2. [My First Maven Pipeline](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/my-first-maven-pipeline/content.html)
	* Create a Jenkins pipeline which
		1. [Pulls a docker _image_ with `Git`, `Java` and `Maven` installed](https://hub.docker.com/r/jamesdbloom/docker-java8-maven)
		2. Creates a docker _container_ from the aforementioned docker _image_.
		3. `git clone`s [a maven Application](https://github.com/curriculeon/jenkins.docker.maven_java-fundamentals) into the container.
		4. `.jar`s the cloned maven application within the container.
		5. runs JUnit tests and ignore failures on `.jar` in container by leveraging command below
			* `mvn package -Dmaven.test.failure.ignore=true`
		6. ensure output of build is displayed by Jenkins
3.

