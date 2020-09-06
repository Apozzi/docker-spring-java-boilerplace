package com.registration.dockerspringjavaboilerplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.dockerspringjavaboilerplace.models.*;

public interface PersonRepository extends JpaRepository<Person, Long> {
	
	
}
