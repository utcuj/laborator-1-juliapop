package com.station;

import java.util.List;

/**
 * Created by julia on 3/7/2018.
 */
public class TrainStation {


    private String name;
    private List<Train> trains;

    public TrainStation(String name, List<Train> trains){
        this.name = name;
        this.trains = trains;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public  List<Train> getTrains() {
        return trains;
    }

    public void setTrains(List<Train> trains) {
        this.trains = trains;
    }

}
