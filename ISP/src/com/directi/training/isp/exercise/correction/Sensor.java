package com.directi.training.isp.exercise.correction;

import java.util.Random;

public class Sensor
{
    public void register(Proximity door)
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
