package org.example.storage;

import org.example.entity.Card;

import java.util.ArrayList;
import java.util.List;

public class StorageCard {
   private static final List<Card> cards = new ArrayList<>();

    static {
        cards.add(new Card("One Chervi", 1));
        cards.add(new Card("One Bubna", 1));
        cards.add(new Card("One Cross", 1));
        cards.add(new Card("One Pika", 1));
        cards.add(new Card("Two Chervi", 2));
        cards.add(new Card("Two Bubna", 2));
        cards.add(new Card("Two Cross", 2));
        cards.add(new Card("Two Pika", 2));
        cards.add(new Card("Three Chervi", 3));
        cards.add(new Card("Three Bubna", 3));
        cards.add(new Card("Three Cross", 3));
        cards.add(new Card("Three Pika", 3));
        cards.add(new Card("Four Chervi", 4));
        cards.add(new Card("Four Bubna", 4));
        cards.add(new Card("Four Cross", 4));
        cards.add(new Card("Four Pika", 4));
        cards.add(new Card("Five Chervi", 5));
        cards.add(new Card("Five Bubna", 5));
        cards.add(new Card("Five Cross", 5));
        cards.add(new Card("Five Pika", 5));
        cards.add(new Card("Six Chervi", 6));
        cards.add(new Card("Six Bubna", 6));
        cards.add(new Card("Six Cross", 6));
        cards.add(new Card("Six Pika", 6));
        cards.add(new Card("Dama Chervi", 7));
        cards.add(new Card("Dama Bubna", 7));
        cards.add(new Card("Dama Cross", 7));
        cards.add(new Card("Dama Pika", 7));
    }

    public static List<Card> getCards(){
        return cards;
    }
}
