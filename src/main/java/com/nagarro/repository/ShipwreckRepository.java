package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
	
	

}
