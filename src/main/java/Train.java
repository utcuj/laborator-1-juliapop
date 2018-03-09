package com.station;

/**
 * Created by julia on 3/7/2018.
 */
public class Train {

    private String code;
    private String destination;
    private int hour;
    private int min;

    public Train(){
        this("---", "---", 00, 00 );
    }


    public Train(String code, String destination, int hour, int min){
        this.code = code;
        this.destination = destination;
        this.hour = hour;
        this.min = min;
    }

    public void setCode(String code){
        this.code = code;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMin(int min){
        this.min = min;
    }

    public String getCode() {
        return code;
    }

    public String getDestination() {
        return destination;
    }

    public int getHour() {
        return hour;
    }

    public int getMin(){
        return min;
    }

    public String info(){
        return "Code: " + code + "Destination: " + destination + "Schedule: " + hour + ":" + min;
    }


}
