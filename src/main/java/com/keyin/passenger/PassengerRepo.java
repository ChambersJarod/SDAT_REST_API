package com.keyin.passenger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepo extends CrudRepository<Passenger, Long> {
}