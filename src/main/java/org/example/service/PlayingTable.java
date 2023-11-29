package org.example.service;

import org.example.entity.Card;
import org.example.entity.Diller;
import org.example.entity.Player;
import org.example.entity.Visitor;
import org.example.utils.GenerateRandomCard;

import java.util.Objects;

import static java.lang.System.out;

public class PlayingTable {
    private static final int NUMBER_START_CARDS = 2;
    private static final int MIN_COUNT_SCORE_FOR_DILLER = 16;
    private final Visitor visitor = new Visitor();
    private final Diller diller = new Diller();

    public void startPlay(Player visitor, Player diller) {
        startCardsForPlayerOrDiller(visitor);
        startCardsForPlayerOrDiller(diller);

        for (int i = 1; i < NUMBER_START_CARDS; i++) {
            getOneMore(visitor);
            getOneMore(diller);
        }
    }

    private void startCardsForPlayerOrDiller(Player playerOrDiller) {
        for (int i = 1; i < NUMBER_START_CARDS; i++) {
            Card card = GenerateRandomCard.generateRandomCard();
            playerOrDiller.addToScore(card.getValueCard());
            playerOrDiller.addToCards(card);
        }
        playerOrDiller.setNumberOfCards(NUMBER_START_CARDS);
    }

    public void getOneMore(Player player) {
        Card card = GenerateRandomCard.generateRandomCard();
        player.addToScore(card.getValueCard());
        player.addToCards(card);
        player.setNumberOfCards(NUMBER_START_CARDS);
    }

    public void chooseVariable(int variable) {
        switch (variable) {
            case 1:
                startPlay(visitor, diller);
                checkScore();
                break;
            case 2:
                getOneMore(visitor);
                getOneMore(diller);
                checkAfterGetOneMore();
                break;
            case 3:
                checkScore();
                stopGame();
                break;
            default:
                throw new RuntimeException("exit");
        }
    }

    private void stopGame() {
        takeMoreWhileScoreDillerLessThanSixteen();

        if (visitor.getScore() > diller.getScore() && visitor.getScore() < 22) {
            out.println("you win!!!!!!!!!!!!");
        } else if (Objects.equals(visitor.getScore(), diller.getScore())) {
            out.println("you and diller take common count score");
        } else {
            out.println("you lose....");
        }
        throw new RuntimeException("The End.");
    }

    private void takeMoreWhileScoreDillerLessThanSixteen() {
        while (diller.getScore() <= MIN_COUNT_SCORE_FOR_DILLER) {
            getOneMore(diller);
        }
    }

    public void checkScore() {
        out.println("visitor score: " + visitor.getScore());
        out.println("diller score: " + diller.getScore());
    }

    public void checkAfterGetOneMore() {
        checkScore();
        if (visitor.getScore() > 22) {
            throw new RuntimeException("visitor loses");
        } else if (diller.getScore() > 22) {
            throw new RuntimeException("diller loses");
        }
    }
}