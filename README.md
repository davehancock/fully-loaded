# fully-loaded


An example project demonstrating some containerized consumer applications under load.
 
The project is split into iterations of increasing complexity as outlined below:
 
Iteration 1:

    - Docker 1.12 / 13 with native Swarm mode, built in load balancing, routing mesh etc
    - N number of replicas for each service type with divided performance stats
    - CI and Publishing of Docker image using Travis  
    - Gatling load testing tool (Some Consumer)
    - A simple Java 8 Spring boot app (Some Consumer)
    
Iteration 2:

    - Introduction of a Go microserivce
   
    
Iteration 3:

    - Backing store (Redis) w/ Spring data to demonstrate persistence
    - Use of Reactor and performance gain made
   
Iteration 4:

    - Cloud provisioned Terraform example (DigitalOcean)


<p>

See the below diagram for a basic overview.

![alt tag](docs/fully-loaded.png)
