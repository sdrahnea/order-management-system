# Order Management System

Order Management System helps you to manage the business activity of your entity. The menus are: orders, items, articles, clients, providers, dashboards.
You can create your custom dashboards using native sql scrips. Basic operations for all entities. 

## Summary
# 1. Screenshots
# 2. Getting Started (Prerequisites, Installing)
# 3. Running the tests
# 4. Deployment
# 5. Built With
# 6. Do you have any issue?
# 7. Contributing
# 8. Versioning
# 9. Authors
# 10. License
# 11. Donations

## 1. Screenshots
<img src = "/src/main/resources/screenshots/oms-login-page.png">
<img src = "/src/main/resources/screenshots/oms-main-page.png">
<img src = "/src/main/resources/screenshots/oms-items-list.png">
<img src = "/src/main/resources/screenshots/oms-item-create.png">
<img src = "/src/main/resources/screenshots/oms-article-create.png">
<img src = "/src/main/resources/screenshots/oms-create-article.png">
<img src = "/src/main/resources/screenshots/oms-create-new-item.png">
<img src = "/src/main/resources/screenshots/oms-inventory-create-page.png">
<img src = "/src/main/resources/screenshots/oms-order-create.png">
<img src = "/src/main/resources/screenshots/oms-person-create.png">
<img src = "/src/main/resources/screenshots/oms-unit-create.png">
<img src = "/src/main/resources/screenshots/oms-unit-of-measure-create.png">
<img src = "/src/main/resources/screenshots/oms-unit-type-create.png">

## 2. Getting Started

Clone or download a copy of this project.
Open the terminal and write the following command:
```
git clone https://github.com/sdrahnea/order-management-system.git
```
Config the git locally, in case you use different git's users:
```
git config --local user.email "your_email@domain.extension"
```

### 2.1. Prerequisites

This project requires Java 1.8, MySQL (or Postgres / H2) and Maven.

### 2.2. Installing

#### 2.2.1 Database operations.
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

##### 2.2.1.1 MySql 
After MySQL installation, it is required to create a database:

```
CREATE DATABSE oms;
```

Note: in case that you run the application starting with MySQL 8.0.4, please execute the following query:
```
ALTER USER '${USER}'@'localhost' IDENTIFIED WITH mysql_native_password BY '${PASSWORD}';
-- where ${USER} and ${PASSWORD} should be provided. 
```

##### 2.2.1.2 Postgres
Install PostgreSQL. It is required to create a database:

Please, run the following commands if it is the case:
```
createuser -U postgres -s Progress
```

Please, run the following command to import a database (if it is the case):
```
pg_restore -d DATABASE_NAME <  PATH/BACKUP_FILE_NAME.sql
```

##### 2.2.1.3 H2
No installation is required.
The `spring.datasource.url` is the one required property which should be set. By default, the
username is `sa` with empty password. Two modes: in memory and file storage. See the `application.properties`
file for more details related configuration.

#### 2.2. Run the application.
In case of this exception: 
```
Unable to make field private com.sun.tools.javac.processing.JavacProcessingEnvironment$DiscoveredProcessors com.sun.tools.javac.processing.JavacProcessingEnvironment.discoveredProcs accessible: module jdk.compiler does not "opens com.sun.tools.javac.processing" to unnamed module
```
Change the project version from java 16 to java 8: Click-right on the project (F4 on Windows) -> Open Module Settings -> Project -> Project SDK.

All this files contains initial data. Just copy and paste the file's content Go to downloaded folder and create the build (you should have something similar like the following):
```
SDR:order-management-system sdrahnea$ mvn clean compile package
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.oms:order-management-system >-------------------
[INFO] Building order-management-system 0.0.3-SNAPSHOT
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
[INFO] Building jar: /my-projects/order-management-system/target/order-management-system-0.0.3-SNAPSHOT.jar
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

## 3. Running the tests

This project does not have any kind of tests :).

## 4. Deployment

The application can be run, once the build (the jar file) is ready t. Please, use the following command to run the application:
```
SDR:order-management-system sdrahnea$ java -jar target/order-management-system-0.0.3-SNAPSHOT.jar
```
If was used default configuration then the application should be available at this url: http://localhost:8081/oms/login.xhtml 
Use the following credentials: username: admin, password: 123.

## 5. Built With

* [Java](https://www.java.com/en/download/) - Java technology allows you to work and play in a secure computing environment. Java allows you to play online games, chat with people around the world, calculate your mortgage interest, and view images in 3D, just to name a few.
* [PrimeFaces](https://www.primefaces.org/) - PrimeFaces is a popular open source framework for JavaServer Faces featuring over 100 components, touch optimized mobilekit, client side validation, theme engine and more.
* [Spring Security](https://spring.io/projects/spring-security) - Spring Security is a powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.
* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
* [Spring Data](https://spring.io/projects/spring-data) - Spring Data’s mission is to provide a familiar and consistent, Spring-based programming model for data access while still retaining the special traits of the underlying data store.
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Spring Data JPA, part of the larger Spring Data family, makes it easy to easily implement JPA based repositories. This module deals with enhanced support for JPA based data access layers. It makes it easier to build Spring-powered applications that use data access technologies.
* [MySQL](https://www.mysql.com/) - MySQL is the world's most popular open source database. Whether you are a fast growing web property, technology ISV or large enterprise, MySQL can cost-effectively help you deliver high performance, scalable database applications.
* [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. 
* [Liquibase](https://www.liquibase.org/) - Liquibase is a database management tool. 

## 6. Do you have any issue?

Please contact via LinkedIn account or drop an email (read [LICENSE.md](LICENSE.md) file) or create an issue into project's space.

## 7. Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## 8. Versioning

We use [SemVer](http://semver.org/) for versioning.

## 9. Authors

* **Sergiu Drahnea** - *Initial work* - [LinkedIn](https://www.linkedin.com/in/sergiu-drahnea-563745123)

## 10. License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## 11. Donations
* [PayPal](https://www.paypal.me/sdrahnea) - any donation is welcomed in case that you was pleased with this work :p
* [EGLD](http://elrond.com/) - Address: `erd1t3t5m8v7862asdh48nq820shsmlmuw9jpm87qw25cvch7djpkapskgq4es`
* [TROY](https://troytrade.com/) - Address: `bnb136ns6lfw4zs5hg4n85vdthaad7hq5m4gtkgf23` and Memo: `100079140`
* [PHB](https://phoenix.global/) - Address: `bnb136ns6lfw4zs5hg4n85vdthaad7hq5m4gtkgf23` and Memo: `100079140`
* [HOT](https://holochain.org/) - Address: `0x1ebfc62e2510f0a0558568223d1d101d0cf074b2`
* [VET](https://www.vechain.org/) - Address: `0x1ebfc62e2510f0a0558568223d1d101d0cf074b2`
* [TRX](https://tron.network/) - Address: `TRe8xSkGqpS73Nhk6bnvW34aiJoRTmZs8N`
* [BTT](https://www.bittorrent.com/token/btt/) - Address: `TRe8xSkGqpS73Nhk6bnvW34aiJoRTmZs8N`
