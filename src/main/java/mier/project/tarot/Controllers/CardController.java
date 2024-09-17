package mier.project.tarot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mier.project.tarot.Entities.CardEntity;
import mier.project.tarot.Services.CardService;

@RestController
@RequestMapping(path = "/cards")
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping()
	public List<CardEntity> getCards() {
		return cardService.getCards();
	}


}
