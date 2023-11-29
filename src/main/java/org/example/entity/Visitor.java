package org.example.entity;

import java.util.List;

public class Visitor extends Player {
    public Visitor(String name, List<Card> cards, Integer numberOfCards, Integer score) {
        super(name, cards, numberOfCards, score);
    }

    public Visitor() {

    }

}
