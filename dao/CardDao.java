package com.qsp.Banking_Managment_system.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.Banking_Managment_system.dto.Cards;
import com.qsp.Banking_Managment_system.repo.CardRepo;

@Repository
public class CardDao {
	
	@Autowired
	CardRepo cardRepo;
	
	public Cards saveCard (Cards cards) {
		return cardRepo.save(cards);
		
	}
	
	public Cards fetchByCardId(int cardId) {
		return cardRepo.findById(cardId).get();
	}
	
	public List<Cards>  findAllCard(){
		return cardRepo.findAll();
	}

}
