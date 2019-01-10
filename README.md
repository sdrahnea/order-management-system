# Order Management System

Order Management System helps you to manage the business activity of your entity. The menus are: orders, items, articles, clients, providers, dashboards.
You can create your custom dashboards using native sql scrips. Basic operations for all entities. 

## Getting Started

Clone or download a copy of this project.

### Prerequisites

This project requires Java 1.8, MySQL and Maven.

### Installing

After MySQL instalation, it is required to create a dabase:

```
CREATE DATABSE oms;
```
Execute the content of `.sql` files, such as: 
```
article.sql
article_category.sql
article_type.sql
chart_type.sql
dashboard_query.sql
data.sql
first_name.sql
inventory.sql
inventory_status.sql
inventory_type.sql
last_name.sql
unit_industry.sql
unit_of_measure.sql
unit_type.sql
```
All this files contains initial data. Just copy and paste the file's content Go to downloaded folder and create the build (you should have something similar like the following):
```
SDR:order-management-system sdrahnea$ mvn clean compile package
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.oms:order-management-system >-------------------
[INFO] Building order-management-system 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.6.1:clean (default-clean) @ order-management-system ---
[INFO] Deleting /my-projects/order-management-system/target
[INFO] 
[INFO] --- maven-enforcer-plugin:1.4.1:enforce (enforce-versions) @ order-management-system ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ order-management-system ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 69 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ order-management-system ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 127 source files to /my-projects/order-management-system/target/classes
[INFO] /my-projects/order-management-system/src/main/java/com/oms/controller/AbstractController.java: Some input files use unchecked or unsafe operations.
[INFO] /my-projects/order-management-system/src/main/java/com/oms/controller/AbstractController.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-enforcer-plugin:1.4.1:enforce (enforce-versions) @ order-management-system ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ order-management-system ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 69 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ order-management-system ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ order-management-system ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /my-projects/order-management-system/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ order-management-system ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ order-management-system ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ order-management-system ---
[INFO] Building jar: /my-projects/order-management-system/target/order-management-system-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.5.7.RELEASE:repackage (default) @ order-management-system ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.183 s
[INFO] Finished at: 2019-01-10T10:14:15+02:00
[INFO] ------------------------------------------------------------------------
SDR:order-management-system sdrahnea$ 
```
Once the build (the jar file) is ready the application can be run. Please, use the following command to run the application:
```
SDR:order-management-system sdrahnea$ java -jar target/order-management-system-0.0.1-SNAPSHOT.jar
```
If was used default configurtion then the application should be available at this url: http://localhost:8081/oms/login.xhtml 
Use the following credentials: username: admin, password: 123.

## Running the tests

This project does not have any kind of tests :).

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [PrimeFaces](https://www.primefaces.org/) - The web framework used
* [Spring Framework](https://spring.io/) - The back-end framework used
* [Maven](https://maven.apache.org/) - Dependency Management

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Sergiu Drahnea** - *Initial work* - [LinkedIn](https://www.linkedin.com/in/sergiu-drahnea-563745123)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Donation

* Hat tip to anyone whose code was used
* Inspiration
* etc

