package com.company;

import java.util.Observable;

public class Entrance extends Device {
    String status;
    public Entrance(String name)
    {
        super(name);
        this.status="Closed";
    }
    @Override
    public void update(Observable o, Object arg) {
        if (this.status.equals("Closed"))
        {
            this.status="Opened";
        }
        else
            this.status="Closed";
        showValue(this.name,this.status);
    }
    private void showValue(String name,String status){
        System.out.println(name+ " New Value = " + status);
    }
}

