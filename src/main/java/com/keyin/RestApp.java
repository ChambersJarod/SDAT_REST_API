// An uncomplicated REST API designed for an aviation-oriented data model.
// Its purpose is to facilitate the administration of cities, passengers, airports, and aircrafts.
// This program is designed to work in conjunction with the MySqlWorkbench database, which is referred to as "QAP2SDAT."
// GitHub Link: https://github.com/darlamward/SDAT_REST_API
// Completed on: July 25, 2023
// Completed by Darla Ward.

package com.keyin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApp {

    public static void main(String[] args) {
        SpringApplication.run(RestApp.class, args);
    }

}