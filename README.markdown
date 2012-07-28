GWT RPC integration with Spring Demo
================

Presentation
------------------

 This is a demo project for GWT RPC integration with Spring based on the original StockWatcher (http://code.google.com/p/google-web-toolkit/downloads/detail?name=Tutorial-GettingStarted-2.1.zip) tutorial from Google.
 
 This demo is a support for the following article
 
  [Spring MVC part V: Exception handling] (http://doanduyhai.wordpress.com/2012/05/06/spring-mvc-part-v-exception-handling)
 
 
 Installation
------------

- Install [Maven 3](http://maven.apache.org/)
- Compile the project with mvn clean install
- Run Jetty from Maven : mvn jetty:run

 Usage
------------

- Connect to the application at http://127.0.0.1:8080/

 Try to play around with the "Add" and "Randomize" buttons. Each of them is triggering a different service in the backend, handled by Spring