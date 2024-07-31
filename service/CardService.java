package com.qsp.Banking_Managment_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Banking_Managment_system.dao.CardDao;
import com.qsp.Banking_Managment_system.dto.Cards;
import com.qsp.Banking_Managment_system.repo.CardRepo;

@Service
public class CardService {
	
	@Autowired
	CardDao cardDao;
	
	public Cards saveCard (Cards cards) {
		return cardDao.saveCard(cards);
		
	}
	
	public Cards fetchByCardId(int cardId) {
		return cardDao.fetchByCardId(cardId);
	}
	
	public List<Cards>  findAllCard(){
		return cardDao.findAllCard();
	}

}
