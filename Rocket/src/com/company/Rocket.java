package com.company;

public class Rocket implements Spaceship {

    protected double maxWeight = 1;
    protected double Weight;
    protected int cost;
    protected double launchExplosion ;
    protected double landingCrash  ;
    int carryCost;

    @Override
    public boolean launch() {
        return true;

    }

    @Override
    public boolean landing() {
        return true;
    }

    @Override
    public boolean canCarry(Item a) {

        if (a.Weight > (maxWeight - Weight)) {
            return false;
        }
        else{

            return true;
        }
    }

    @Override
    public void carry(Item a) {
        Weight = Weight + a.Weight;
        carryCost = carryCost + a.Cost;
    }




}
