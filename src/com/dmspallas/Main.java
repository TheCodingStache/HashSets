package com.dmspallas;

import java.util.*;

public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody heavenlyBody = new Planet("Mercury", 88);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        planets.add(heavenlyBody);

        heavenlyBody = new Planet("Venus", 225);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        planets.add(heavenlyBody);

        heavenlyBody = new Planet("Earth", 365);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        planets.add(heavenlyBody);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        heavenlyBody.addSatellite(tempMoon);

        heavenlyBody = new Planet("Mars", 687);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        planets.add(heavenlyBody);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBody.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBody.addSatellite(tempMoon); // temp is still Mars

        heavenlyBody = new Planet("Jupiter", 4332);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        planets.add(heavenlyBody);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBody.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBody.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBody.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        heavenlyBody.addSatellite(tempMoon); // temp is still Jupiter

        heavenlyBody = new Planet("Saturn", 10759);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        planets.add(heavenlyBody);

        heavenlyBody = new Planet("Uranus", 30660);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        planets.add(heavenlyBody);

        heavenlyBody = new Planet("Neptune", 165);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        planets.add(heavenlyBody);

        heavenlyBody = new Planet("Pluto", 248);
        solarSystem.put(heavenlyBody.getKey(), heavenlyBody);
        planets.add(heavenlyBody);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey());
        }

        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for (HeavenlyBody moonOfMars : body.getSatellites()) {
            System.out.println("\t" + moonOfMars.getKey());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getKey());
        }

        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
//            System.out.println(planet.getKey() + ": " + planet.getOrbitalPeriod());
        }

        solarSystem.put(pluto.getKey(), pluto);
        System.out.println("\n"+solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println("\n"+solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));
        System.out.println();
        System.out.println("The solar system contains");
        for(HeavenlyBody heavenlyBody1 : solarSystem.values()){
            System.out.println(heavenlyBody1);
        }
    }
}
