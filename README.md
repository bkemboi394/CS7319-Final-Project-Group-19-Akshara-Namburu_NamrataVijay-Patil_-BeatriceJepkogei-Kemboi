## CS7319-Final-Project-Group-19-Akshara-Namburu_NamrataVijay-Patil_-BeatriceJepkogei-Kemboi

### Client-Server Architecture

The Source code and executables of the application for this architecture were added to the unselected folder.
The Code for this application was developed in Java with spring boot Initialization in the IntellIJ IDEA 2023.3.2 IDE version 17.

JDK and IntellIJ Installation: 
- Visit the official [Oracle](https://www.oracle.com/java/technologies/downloads/#java21) to download the JDK for the appropriate Operating System
- Visit the official IntelliJ IDEA download page at [JetBrains](https://www.jetbrains.com/idea/download/?section=windows) and download the Community or Ultimate version of the platform according to the Operating system
- Download the [PostgreSql](https://www.postgresql.org/download/) and create a database called "SalonLink" . The default port number is 5432.
  

Application setup and configuration

- Download the Project as a whole from the repository
- Upon Successful installation of the platform navigate to the startup screen and select **Open** and load the project as a maven project from the folder where you downloaded it to.
  - **Run** the project
- Upon Successful compilation Navigate to Chrome -> **http://localhost:8080/registration**

Application Execution
- Give the User Details on the registration page -> Register with details
- click on the link below it that redirects to the login page -> Email and password
- On the dashboard page click the "search for service button" and type a service you are interested in such as 'manicure' or 'haircut'
- From the list of salons sorted by distance given back, click on "salon services" for a particular salon to see its services. This will take you to another page where you can see all the services offered by that particular salon listed.
- On the same page, select from a dropdown of list of the services offered by that particular salon and then click on the "make reservation" button next to it to make a reservation.
  


### MicroServices  Architecture

The MicroServices architecture was the selected architecture so the Source code and executables of the application for this architecture were added to the selected folder.
The Code for this application was developed in Java with spring boot Initialization in the IntellIJ IDEA 2023.3.5 IDE 

JDK and IntellIJ Installation: 
- Visit the official [Oracle](https://www.oracle.com/java/technologies/downloads/#java21) to download the JDK for the appropriate Operating System
- Visit the official IntelliJ IDEA download page at [JetBrains](https://www.jetbrains.com/idea/download/?section=windows) and download the Community or Ultimate version of the platform according to the Operating system
- Download the [MySql Server](https://www.mysql.com/downloads/)
- During installation of the server set the **port - 3030, username- root, password- akshara98** 
   
Application setup and configuration

- Download the Project individually from the repository - UserRegistration,SalonDiscovery,ServiceSelect,Reservation
- Upon Successful installation of the platform navigate to the startup screen and select **Open**
- Navigate to the directory where the projects were downloaded to and open them independently in multiple windows
- 
- **Run** each of the projects opened in multiple windows
- Upon Successful compilation Navigate to Chrome -> **http://localhost:8080/registration**

Application Execution
- Give the User Details on the registration page -> Register with details
- Redirection to the Login Page -> Email and password
- Give the zipcode eg:**46815** -> **Search**
- Click the Desired Salon -> user is redirected to the Service Selection page
- Checkbox the services to book for -> **Submit Selected Services**
- Redirection to reservation page -> Input name, contact, Date and Time -> submit
- Redirection to Confirmation page

### Rationale

**Option 1 : Client-Server Architecture**
- Hierarchical Structure: The application is divided into client-side and server-side components, where the client interacts with the server to access data and perform actions.
- Communication: Communication primarily occurs between the client and server, with the server handling data storage and business logic.
- Centralization: Often associated with centralized servers that manage data and logic for multiple clients.
- Scalability: Scaling usually involves upgrading server hardware or implementing load balancing to accommodate increased client demands.

**Option 2 : Microservices**
- Decentralization: The application is segmented into independent services that communicate with each other through APIs, allowing for flexibility and autonomy.
- Autonomy: Each microservice can be developed, deployed, and scaled independently, promoting agility and rapid iteration.
- Scalability: Offers targeted scalability of specific services in response to demand, leading to efficient resource utilization.
- Technology Diversity: Allows for the use of diverse technologies within each microservice, enhancing flexibility and innovation.

The decision between Client-Server and Microservices architecture will depend on various factors such as project size, team expertise, scalability requirements, and the need for flexibility and agility. Hybrid approaches, blending aspects of both architectures, may also be viable depending on the project's needs.


#### Rationales for the Final Decision:

**Project Complexity and Size:**
- Client-Server Architecture: Suitable for smaller projects with straightforward requirements.
- Microservices Architecture: Better suited for larger, more complex applications with diverse functionalities.
  
**Scalability Needs:**
- Client-Server Architecture: Typically requires scaling server resources to accommodate increased client demand.
- Microservices Architecture: Enables selective scaling of individual services based on demand, optimizing resource utilization.
**Flexibility and Agility:**
  
- Client-Server Architecture: May lack the agility needed for rapidly changing environments.
- Microservices Architecture: Offers greater flexibility and agility, allowing for independent evolution and scaling of components.








