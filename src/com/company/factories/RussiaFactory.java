package com.company.factories;

import com.company.members.*;

public class RussiaFactory implements TeamFactory{
    @Override
    public Assaulter createAssaulter() {
        return new RussianAssaulter();
    }

    @Override
    public Defender createDefender() {
        return new RussianDefender();
    }

    @Override
    public Goalkeeper createGoalkeeper() {
        return new RussianGoalkeeper();
    }
}
