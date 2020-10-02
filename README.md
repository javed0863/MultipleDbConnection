Springboot application - MultipleDbConnection
===============================

This repository contains the simple sample Springboot code to show how can we connect to multiple databases.


Introduction
------------

Refer
[Spring JPA – Multiple Databases](https://www.baeldung.com/spring-data-jpa-multiple-databases)
article for more information.

Getting Started
---------------
This project uses the Maven build system and JAVA 8. You can create JAR using `mvn clean package`

Database tables and records provided as `customerdb.sql` (DB1) and `productdb.sql` (DB2)

Running on Docker
-----------------
Run below command for build and run the application on docker

`docker build -t multidbconn .
&& docker run
-p 8080:8080
--name multiple-db-conn-app
multidbconn`

Running on command Line
-----------------------
This is actually slightly faster on startup (depending on the size of the jar) than running from an unexploded archive. At runtime you shouldn’t expect any differences.

* `$ jar -xf myapp.jar`
* `$ java org.springframework.boot.loader.JarLauncher`

DB Connectivity Verification
----------------------------
Open below URLs in browser
* `http://localhost:8080/customer/` will connect customerdb
* `http://localhost:8080/product/` will connect productdb

Or

Run JUnit test cases (Note: Modify expected outputs)
