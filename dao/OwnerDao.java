package com.qsp.Banking_Managment_system.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.qsp.Banking_Managment_system.dto.Owner;
import com.qsp.Banking_Managment_system.repo.OwnerRepo;

@Repository
public class OwnerDao {
	@Autowired
	OwnerRepo ownerRepo;

	public Owner saveOwner(Owner owner) {
		return ownerRepo.save(owner);
	}

	public Owner fetchByOwnerId(int ownerId) {
		return ownerRepo.findById(ownerId).get();
	}

	public Owner deleteByOwnerId(int ownerId) {
		Owner owner = fetchByOwnerId(ownerId);
		ownerRepo.deleteById(ownerId);
		return owner;
	}

	public Owner updateByOwnerId(int oldId, Owner newOwner) {
		newOwner.setOwnerId(oldId);
		return ownerRepo.save(newOwner);

	}

	public List<Owner> fetchAllOwners() {
		return ownerRepo.findAll();
	}
	
	public Optional<Owner> findByName(@Param("ownerName") String ownerName){
		return ownerRepo.findByName(ownerName);
	}
}
