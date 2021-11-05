package Week9.yl18.domain;


import java.util.*;
import Week9.yl18.domain.*;

public class Box implements Thing {
    private List<Thing> things;
    private int max;

    public Box(int maximumCapacity) {
        this.things = new ArrayList<Thing>();
        this.max = maximumCapacity;

    }

    public boolean addThing(Thing thing) {

        if (thing.getVolume() + this.getVolume() <= this.max) {
            this.things.add(thing);
            return true;
        }

        return false;
    }

    public int getVolume() {
        int currentVolume = 0;

        for (Thing thing : things) {
            currentVolume += thing.getVolume();
        }

        return currentVolume;
    }

    @Override
    public String toString() {

        return this.getVolume() + " dm^3";
    }
}

