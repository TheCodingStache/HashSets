package com.dmspallas;

public class Asteroid extends HeavenlyBody {
    public Asteroid(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.ASTEROID);
    }
}
