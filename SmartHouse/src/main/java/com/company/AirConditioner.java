package com.company;

import java.util.Observable;

public class AirConditioner extends Device{
    String status;
    int thresholdUp;
    int thresholdDown;
    public AirConditioner(String name, int thresholdUp, int thresholdDown){
        super(name);
        this.thresholdDown=thresholdDown;
        this.thresholdUp=thresholdUp;
        this.status="";
    }
    @Override
    public void update(Observable o, Object arg) {
        this.status="Off";
        Integer value = (Integer) arg;
        if (value > this.thresholdUp)
        {
            this.status="Cooling....";
        }
        if (value < this.thresholdDown)
            this.status="Heating...";
        if (value>this.thresholdDown && value<this.thresholdDown )
            this.status="Off";
        showValue(this.name,this.status);

    }
    private void showValue(String name,String status){
        System.out.println(name+ " New Value = " + status);
    }
}

