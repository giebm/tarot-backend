package mier.project.tarot.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import mier.project.tarot.Entities.CardEntity;

@Service
public class CardService {

    public List<CardEntity> getCards() {
		return List.of(
			new CardEntity(
                1L, 
                "Major Arcana",
                "The Fool", 
                "Beginnings", 
                "The Fool is the first card of the Major Arcana. It represents new beginnings, having faith in the future, being inexperienced, not knowing what to expect, having beginner's luck, improvisation and believing in the universe.", 
                "https://upload.wikimedia.org/wikipedia/en/9/90/RWS_Tarot_00_Fool.jpg")
		);
	}
}
