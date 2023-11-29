package org.example.entity;

public class Card {
private String nameCard;
private Integer valueCard;

    public Card(String nameCard, Integer valueCard) {
        this.nameCard = nameCard;
        this.valueCard = valueCard;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public Integer getValueCard() {
        return valueCard;
    }

    public void setValueCard(Integer valueCard) {
        this.valueCard = valueCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "nameCard='" + nameCard + '\'' +
                ", valueCard=" + valueCard +
                '}';
    }
}
