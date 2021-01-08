package com.company;

public class Uall extends Rocket {

    public Uall(int carryWeight, double launch, double landing ){
        this.Weight = 10000;
        this.maxWeight = Weight + carryWeight;
        this.launchExplosion = launch;
        this.landingCrash = landing;
        this.lifeCost = 5;


        this.cost = (int) ((((double)carryWeight)/160 + (1/(landingCrash/100)) + 1/(launchExplosion/100)/2.4)* 10000000);

    }
    double probaLanding(){
        return (Math.pow((Weight / maxWeight),3) * landingCrash);
    }
    double probaLaunching(){
        return (Math.pow((Weight / maxWeight),3) * launchExplosion);
    }

    @Override
    public boolean landing() {
        double x = Math.random();
        if (x < probaLanding()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean launch() {
        double x = Math.random();
        if (x < probaLaunching()) {
            return false;
        } else {
            return true;
        }
    }

}

