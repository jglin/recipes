# Spring Boot Recipe App
From following Udemy course Spring Framework 5: Beginner to Guru


### Tools and frameworks mentioned in course
* Chrome Developer Tools: 
* Firefox Firebug (seems to no longer be maintained)
* FirefoxDeveloperEdition
* Safari Web Inspector
* Axis TCPMon - A plugin for Eclipse, IntelliJ, and also a standalone version. May no longer be supported, but it's stable. You can listen on a port and see HTTP requests and responses.
* Spring Boot Developer Tools. Added to Gradle via artifact spring-boot-devtools. They are automatically disabled when running a packaged application like a JAR or WAR. Triggers an automatic restart of the Spring Context when classes change. There are also browser plugins to refresh the browser when a change is made.
* JDL-Studio from the JHipster project for data modeling https://www.jhipster.tech/
* H2 database console at http://localhost:8080/h2-console/login.jsp. Set JDBC URL field to jdbc:h2:mem:testdb and use Generic H2 (Embedded) for the saved setting.
* Bootstrap CSS - CSS framework, http://getbootstrap.com
* In lecture 128 he talks about Maven Failsafe Plugin to use to run integration tests ending in 'IT' (I guess only classes ending in 'Test' would be picked up by Maven unless the Failsafe plugin is used). I investigated a little for Gradle, and found this article https://guides.gradle.org/migrating-from-maven that gives some solutions using either profiles or Gradle source sets.