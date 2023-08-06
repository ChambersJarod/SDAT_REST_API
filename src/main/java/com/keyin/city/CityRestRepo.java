package com.keyin.city;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "city", path = "city")
public interface CityRestRepo extends JpaRepository<City, Long> {
    public List<City> findByName(@Param("name")String name);

    //public List<City> findByAirports_code(@Param("code")String code);
}
