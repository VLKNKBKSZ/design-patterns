package com.vlkn.classAdapterPattern;

public class AdapterCarBehavior implements Driveable {

    private final CarBehaviorThatFitMyNeeds carBehaviorThatFitMyNeeds;

    public AdapterCarBehavior(CarBehaviorThatFitMyNeeds carBehaviorThatFitMyNeeds) {
        this.carBehaviorThatFitMyNeeds = carBehaviorThatFitMyNeeds;
    }

    @Override
    public void start() {
        carBehaviorThatFitMyNeeds.iStart();
    }

    @Override
    public void stop() {
        carBehaviorThatFitMyNeeds.iStop();
    }
}
