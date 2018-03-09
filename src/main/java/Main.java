package com.station;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        TrainStation station = new TrainStation("Station 1", addTrains());


        System.out.println("Before sorting");
        for(Train train : station.getTrains()) {
            System.out.println(train.info());
        }

        System.out.println("\n");

        System.out.println("After sorting");
        Collections.sort(station.getTrains(), new Compare());
        // Train t1 = new Train("AC1 ", "Berlin ", 10, 01);
        // String hour1 = t1.getSchedule();
        for(Train train : station.getTrains()) {
            System.out.println(train.info());
        }
        // System.out.println(hour1);
    }


    public static List<Train> addTrains(){
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("AC1 ", "Berlin ", 10, 11));
        trains.add(new Train("AC2 ", "Munchen ", 05,11));
        trains.add(new Train("AC3 ", "Frankfurt ", 16,11));
        trains.add(new Train("AC4 ", "Dusseldorf ", 10,31));
        trains.add(new Train("AC5 ", "Koln ", 13,11));
        return trains;
    }


}
