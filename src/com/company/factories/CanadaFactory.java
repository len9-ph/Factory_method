package com.company.factories;

import com.company.members.*;

public class CanadaFactory implements TeamFactory{
    @Override
    public Assaulter createAssaulter() {
        return new CanadaAssaulter();
    }

    @Override
    public Defender createDefender() {
        return new CanadaDefender();
    }

    @Override
    public Goalkeeper createGoalkeeper() {
        return new CanadaGoalkeeper();
    }
}
