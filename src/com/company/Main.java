package com.company;

import com.company.factories.CanadaFactory;
import com.company.factories.RussiaFactory;

import java.util.Scanner;

public class Main {
    Game game;

    public void goToField(String team) {
        if (team.equals("Russia")){
            game = new Game(new RussiaFactory());
        } else if (team.equals("Canada")) {
            game = new Game(new CanadaFactory());
        } else {
            System.out.println("Третьего не дано");
        }
        game.ready();
        game.go();
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        Main studentSpring = new Main();
        while (true) {
            studentSpring.goToField(inputScanner.nextLine());
        }
    }
}
