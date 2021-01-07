package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Simulation simu;
        ArrayList phase_1 = Simulation.loadItems("src/com/company/Phase-1.txt");
        ArrayList phase_2 = Simulation.loadItems("src/com/company/Phase-2.txt");
        ArrayList U1_phase_1 = Simulation.loadU1(phase_1);
        ArrayList U1_phase_2 = Simulation.loadU1(phase_2);
        ArrayList U2_phase_1 = Simulation.loadU2(phase_1);
        ArrayList U2_phase_2 = Simulation.loadU2(phase_2);
        ArrayList Uall_phase_1 = Simulation.loadUall(phase_1,8000,0.05,0.01);


        int nbrIterations = 100000;
        int i;
        int cost =0 ;
        for(i=0; i<nbrIterations;i++){
            cost+= Simulation.runSimulation(Uall_phase_1);
        }
        System.out.println(cost/nbrIterations);
    }
}
