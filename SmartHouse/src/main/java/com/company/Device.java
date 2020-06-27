package com.company;
import java.util.Observable;
import java.util.Observer;
public class Device implements Observer{
    String name;
    public Device(String name) {
        this.name=name;

    }

    public void update(Observable o, Object arg) {
        Integer value = (Integer) arg;
        showValue(value);
    }
    private void showValue(int value){
        System.out.println("New Value = " + value);
    }
        }