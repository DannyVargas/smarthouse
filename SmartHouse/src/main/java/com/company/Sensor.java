package com.company;
import java.util.Observable;
public class Sensor extends Observable{

    private int value;
    private String name;

    public Sensor(String name, int value)
    {
        this.name=name;
        setValue(value);
    }
    public Sensor()
    {

    }
    public void setValue(int value){
        this.value = value;
        setChanged();
        notifyObservers(this.value);
    }
    public String getName(){
        return this.name;
    }

}