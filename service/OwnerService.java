package com.qsp.Banking_Managment_system.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.qsp.Banking_Managment_system.dao.OwnerDao;
import com.qsp.Banking_Managment_system.dto.Owner;

@Service
public class OwnerService {

	@Autowired
	OwnerDao ownerDao;

	public Owner saveOwner(Owner owner) {

		return ownerDao.saveOwner(owner);
	}

	public Owner fetchByOwnerId(int ownerId) {
		return ownerDao.fetchByOwnerId(ownerId);
	}

	public Owner deleteByOwnerId(int ownerId) {
		return ownerDao.deleteByOwnerId(ownerId);
	}

	public Owner updateByOwnerId(int oldId, Owner newOwner) {
		return ownerDao.updateByOwnerId(oldId, newOwner);

	}

	public List<Owner> fetchAllOwners() {
		return ownerDao.fetchAllOwners();
	}
	
	public Optional<Owner> findByName(@Param("ownerName") String ownerName){
		return ownerDao.findByName(ownerName);
	}

}
