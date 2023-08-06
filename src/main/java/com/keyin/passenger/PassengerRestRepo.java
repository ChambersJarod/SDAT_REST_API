package com.keyin.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "passenger", path = "passenger")
public interface PassengerRestRepo extends JpaRepository<Passenger, Long> {
}