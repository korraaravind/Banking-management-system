package com.qsp.Banking_Managment_system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Banking_Managment_system.dto.Owner;
import com.qsp.Banking_Managment_system.service.OwnerService;

@RestController
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;
	
	@PostMapping("/saveOwner")
	public Owner saveOwner(@RequestBody Owner owner) {
		return ownerService.saveOwner(owner);
	}
	
	@GetMapping("/fetchByOwnerId")
	public Owner fetchByOwnerId(@RequestParam int ownerId) {
		return ownerService.fetchByOwnerId(ownerId);
	}
	
	@DeleteMapping("/deleteByOwnerId")
	public Owner deleteByOwnerId(@RequestParam int ownerId) {
		return ownerService.deleteByOwnerId(ownerId);
	}
	
	@PutMapping("/updateByOwnerId")
	public Owner updateByOwnerId(@RequestParam int oldId,@RequestBody Owner newOwner) {
		return ownerService.updateByOwnerId(oldId, newOwner);

	}
	@GetMapping("/fetchAllOwners")
	public List<Owner> fetchAllOwners() {
		return ownerService.fetchAllOwners();
	}
	@GetMapping("/findByName")
	Optional<Owner> findByName(@RequestParam("ownerName") String ownerName){
		return ownerService.findByName(ownerName);
	}

}
