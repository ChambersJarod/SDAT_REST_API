# Aviation REST API
A REST API designed on the previous databases made for aircraft.
This program is designed to work with MySqlWorkbench,in which it is referred to as "QAP2SDAT."

## Running the Project in Docker

To run this project in Docker:

  1. make sure docker is installed

  2. Clone the repository

  3. Open a terminal and navigate to the project directory.

  4. Build the Docker image using the following command:

    docker build -t sdat_api .

  5. Launch the Docker container using this command:

    docker run sdat_api
    
Once the container is up and running, the API should be accessible at http://localhost:8080.


## Testing the API

  ### Add a City:

    Endpoint: POST http://localhost:8080/cities

Sample JSON:

    {
      "name": "Toronto",
      "province": "ON"
    }

  ### Add a Passenger:

    Endpoint: POST http://localhost:8080/passenger

Sample JSON:

    {
      "firstName": "John",
      "lastName": "Doe",
      "phoneNumber": "123-4567",
    }

### Create an Airport:

    Endpoint: POST http://localhost:8080/airport

Sample JSON:

    {
       "code": "YYT",
       "name": "St.John's International Airport",
    }

### Create an Aircraft:

    Endpoint: POST http://localhost:8080/aircrafts
    
Sample JSON:

    {
      "type": "Boeing 737",
      "airlineName": "WestJet",
      "noOfPassengers": 215
    }


## GET Key Relationships

Note: Replace <city_id>,<passenger_id>,<aircraft_id> with the proper ID number of your search.

### Cities have many airports

    GET http://localhost:8080/cities/<city_id>/airports

### Passengers can fly on many different aircrafts

    GET http://localhost:8080/passenger/<passenger_id>/aircraft

### Aircrafts can travel to/from many different airports

    GET http://localhost:8080/aircrafts/<aircraft_id>/airports

