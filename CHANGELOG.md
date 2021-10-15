# Changelog
All notable changes to this project will be documented in this file.

## [2.0.0] - 2021-MM-DD [Unreleased]
### Added
- inventory of project and start to actively to support it. Should come with support and new implementations into few next weeks.
- documentation update
### Fixed
- add H2 dependency

## [1.0.0] - 2021-09-23
### Added 
- all implementation from 0.0.4-SNAPSHOT
- all implementation from 0.0.3-SNAPSHOT
- all implementation from 0.0.2-SNAPSHOT
- all implementation from 0.0.1-SNAPSHOT

## [0.0.4-SNAPSHOT]
### Added
- add liquibase as database migration tool
- default data for article category / type, chart type, inventory status / type, unit type, industry type 

### Fixed
- NPE in case of order creation
- NPE in case of article creation
- NPE in case of client creation

### Removed
Information related to each file:
- article.sql               : should be empty initial. all columns related to article object.
- article_category.sql      : default list with articles category values
- article_type.sql          : default list with articles type values
- chart_type.sql            : default list with chart types. all types are implemented (to not add new ones without implementation)
- dashboard_query.sql       : contains all queries from all reports
- inventory.sql             : the table where all inventories are saved
- inventory_status.sql      : default list of inventory status values 
- inventory_type.sql        : default list of inventory type values
- unit_industry.sql         : the table where all industry units are stored
- unit_of_measure.sql       : default list of unit of measures values
- unit_type.sql             : default list of unit type values
- last_name.sql             : only for testing / demo proposes
- first_name.sql            : only for testing / demo proposes

## [0.0.3-SNAPSHOT] - 2019-11-15
### Fixed
- add gitignore file
- add lombok version 

## [0.0.2-SNAPSHOT] - 2019-04-30
### Removed
- unused CSS files 
### Fixed
- constant names
- removed unused xhtml tags

## [0.0.1-SNAPSHOT] - 2019-01-10
### Added
- README file contains main information about project
- initial commit 
