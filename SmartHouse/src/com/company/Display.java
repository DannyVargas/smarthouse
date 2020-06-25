package com.company;
import java.util.Observable;
import java.util.Observer;
public class Display implements Observer{
    public void update(Observable o, Object arg) {
        Integer value = (Integer) arg;
        showValue(value); // Mostramos el valor
    }
    private void showValue(int value){
        System.out.println("New Value = " + value);
    }
        }