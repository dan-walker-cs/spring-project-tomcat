
THIS PROJECT IS CURRENTLY IN PROGRESS.

This project is a full-stack SpringBoot application. Currently, it is a simple user account registration application.

Spring Dependencies:
- Spring Security
- Spring Thymeleaf
- Spring Data JPA
- Spring Web
- Spring MVC

Other technologies:
- MySQL Workbench
- Apache Maven (leveraged by Spring)
- Apache Tomcat (leveraged by Spring)

Current Functionality:
- Login via Spring Security authenticating with the MySQL database
- Logout via Spring Security, clearing principal from current session
- Register new user via html form, storing the data as a record in the MySQL database
- Display current database contents, via the admin authentication redirect
- Display user "profile" page, which is just a welcome message, at the moment.

Next Steps:
- Add a couple more html pages to try out some more of Thymeleaf's syntax
- Build more robust html templates for a more professional look
- Mess around with CSS to stylize webpages with a more professional look and feel
- Add an error page redirect with useful messages about exceptions
- Write and automate testing for the application
- Select an API with which to add interesting functionality and expand the DB schema

    Ideas:
      - IMDB API - collect previously seen films by each user
                 - use data such as genre, cast, etc. to recommend similar titles
      - 