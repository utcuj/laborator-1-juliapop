package com.station;

import java.util.Comparator;

/**
 * Created by julia on 3/8/2018.
 */
public class Compare implements Comparator<Train> {

    @Override
    public int compare(Train t1, Train t2){

        int hour1 = t1.getHour();
        int hour2 = t2.getHour();

        int min1 = t1.getMin();
        int min2 = t2.getMin();


        if(hour1 == hour2){
            return min1 - min2;
        }
        return hour1 - hour2;
    }

}
