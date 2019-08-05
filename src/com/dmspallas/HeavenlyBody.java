package com.dmspallas;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        satellites = new HashSet<>();

    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }


    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    /*I am overriding the <equals method> to use a parameter object "o" with a reference of the Object Superclass to compare
        if there is a duplicate object which shares the same hashcode from the bucket. Objects that are equal must share the same hashcode*/

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        System.out.println("obj " + o.getClass());
        System.out.println("this" + this.getClass());

        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        String objectName = ((HeavenlyBody) o).getName();
        return this.name.equals(objectName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 58;
    }
}
