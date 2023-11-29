package org.example.utils;

import org.example.entity.Card;
import org.example.entity.Diller;
import org.example.entity.Player;
import org.example.storage.StorageCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomCard {
    private static final List<Card> cards = new ArrayList<>(StorageCard.getCards());

    public static Card generateRandomCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No more cards available");
        }

        int randomIndex = new Random().nextInt(cards.size());
        return cards.remove(randomIndex);
    }
}

