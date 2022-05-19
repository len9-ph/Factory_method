package com.company;

import com.company.factories.TeamFactory;
import com.company.members.*;

public class Game {
    Assaulter assaulter;
    Defender defender;
    Goalkeeper goalkeeper;
    TeamFactory teamFactory;

    public Game(TeamFactory teamFactory) {
        this.teamFactory = teamFactory;
    }

    public void ready(){
        this.assaulter = teamFactory.createAssaulter();
        this.defender = teamFactory.createDefender();
        this.goalkeeper = teamFactory.createGoalkeeper();
    }

    public void go(){
        assaulter.attack();
        defender.defend();
        goalkeeper.catchPucks();
    }

}
