package com.vlkn.adapterAgainstInterface;

public class AdapterCarBehavior extends CarBehaviorThatFitMyNeeds implements Drivable {

    @Override
    public void start() {
        iStart();
    }

    @Override
    public void stop() {
        iStop();
    }
}
