It is a RESTful webservice built with java spring boot

Endpoints
Endpoints for every Entity are specified in respective controller in the controller package

Database
the database used is MySQL
the database name configs, username and password is speified in application.properties

Services
all services are in service package in respective class

Entities
Consists of two entities the Area and Shop

Area should be inserted first before inserting a shop

When inserting the shop the object for Area must be provided

when listing the shops in specific area the object of the specific area must be provided

