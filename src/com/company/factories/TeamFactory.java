package com.company.factories;

import com.company.members.Assaulter;
import com.company.members.Defender;
import com.company.members.Goalkeeper;

public interface TeamFactory {
    Assaulter createAssaulter();
    Defender createDefender();
    Goalkeeper createGoalkeeper();
}
