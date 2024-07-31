package com.qsp.Banking_Managment_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Banking_Managment_system.dao.CardDao;
import com.qsp.Banking_Managment_system.dto.Cards;
import com.qsp.Banking_Managment_system.service.CardService;

@RestController
public class CardConroller {
	@Autowired
	CardService cardService;
	
	@PostMapping("/saveCard")
	public Cards saveCard (@RequestBody Cards cards) {
		return cardService.saveCard(cards);
		
	}
	
	@GetMapping("/fetchByCardId")
	public Cards fetchByCardId(@RequestParam int cardId) {
		return cardService.fetchByCardId(cardId);
	}
	
	@GetMapping("/findAllCard")
	public List<Cards>  findAllCard(){
		return cardService.findAllCard();
	}

}
