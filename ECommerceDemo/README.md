

Project 4 ECommerceDemo; 



- Users can become a member by entering their information into the system. 
- It should be possible to become a member of the system with basic user information, e-mail and password. 
- Basic user information: first name, last name, email, password. 
- Basic information is required. 
- Password must be at least 6 characters. 
- The e-mail must be in e-mail format. (Do it with regex.)
- The e-mail must not have been used before. 
- First and last name must be at least two characters. 
- A confirmation e-mail should be sent to the user as a result of membership. (Simulation)
- When the verification link is clicked, the subscription should be completed. (Simulation)
- In case of fail or success, the user should be informed. 
- Users should be able to sign up to the system with their Google accounts. (Simulation)


- Configure the system as external service integration.
- In case of failure or success, the user should be informed.
- Users should be able to login to the system with their e-mail and password information.
- Email and password are required.
- In case of failure or success, the user should be informed.

Layers;

- business
  - abstracts
      - UserService interface
  - concretes
      - UserManager (implements UserService)
- core
  - abstracts
      - EmailValidationService interface
  - concretes
      - EmailValidationManagerAdapter (implements EmailValidationService)
      - GoogleAccountManager class 
- dataAccess 
  - abstracts
      - UserDao interface
  - concretes
      - HibernateUserDao (implements UserDao)
- entities
  - abstracts
      - Entity interface
  - concretes
      - User (implements Entity)
- Main.java

