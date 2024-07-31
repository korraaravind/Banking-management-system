package com.qsp.Banking_Managment_system.repo;

import javax.management.Query;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.qsp.Banking_Managment_system.dto.Owner;

public interface OwnerRepo extends JpaRepository<Owner, Integer>{
	
//	user Can create a Method find without id so we need a query
//	creating Custom Query
	
	
	
	@org.springframework.data.jpa.repository.Query("SELECT o FROM Owner o WHERE o.ownerName = :ownerName")
    java.util.Optional<Owner> findByName(@Param("ownerName") String ownerName);

}
