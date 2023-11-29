package org.example;

import org.example.service.PlayingTable;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please, choose variable:" + "\n" +
                "1: start game" + "\n" +
                "2: one more card" + "\n" +
                "3: stop game");

        PlayingTable playingTable = new PlayingTable();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                playingTable.chooseVariable(scanner.nextInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
