package com.company;

import java.util.Observable;

public class Curtains extends Device{
    String status;
    int thresholdUp;
    int thresholdDown;
    public Curtains(String name, int thresholdUp, int thresholdDown){
        super(name);
        this.thresholdDown=thresholdDown;
        this.thresholdUp=thresholdUp;
        this.status="";
    }
    @Override
    public void update(Observable o, Object arg) {
        this.status="Curtains in the middle";
        Integer value = (Integer) arg;
        if (value > this.thresholdUp)
        {
            this.status="Curtains closed";
        }
        if (value < this.thresholdDown)
            this.status="Curtains totally opened";
        if (value>this.thresholdDown && value<this.thresholdDown )
            this.status="Curtains in the middle";
        showValue(this.name,this.status);

    }
    private void showValue(String name,String status){
        System.out.println(name+ " New Value = " + status);
    }
}

