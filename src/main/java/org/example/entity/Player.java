package org.example.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

    protected String name;
    protected List<Card> cards = new ArrayList<>();
    protected int numberOfCards;
    protected int score;

    public Player() {
    }

    public Player(String name, List<Card> cards, int numberOfCards, int score) {
        this.name = name;
        this.cards = cards;
        this.numberOfCards = numberOfCards;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void addToCards(Card card) {
        cards.add(card);
    }

    public Integer getNumberOfCards() {
        return numberOfCards;
    }

    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards = numberOfCards;
    }

    public Integer getScore() {
        return score;
    }

    public void addToScore(int score) {
        if (this.score < 21) {
            this.score += score;
        } else {
            throw new RuntimeException("too much");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", cards=" + cards +
                ", numberOfCards=" + numberOfCards +
                ", score=" + score +
                '}';
    }
}