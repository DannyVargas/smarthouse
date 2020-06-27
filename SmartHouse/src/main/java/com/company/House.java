package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class House {
    ArrayList<Sensor> sensors;
    ArrayList <Device> devices;
    private File phase1 = new File("e:/configuration.txt");
    public void load() throws FileNotFoundException {
        sensors = new ArrayList<>();
        devices = new ArrayList<>();
        int index=0;
        Scanner fileScanner = new Scanner(phase1);

        while (fileScanner.hasNextLine()) {
            String string = fileScanner.nextLine();
            String[] separated = string.split(",");
            Sensor item = new Sensor(separated[0],0);
            if (separated[2].equals("E")) {
                devices.add(new Entrance(separated[1]));
            }
            if (separated[2].equals("A")){
                devices.add(new AirConditioner(separated[1],Integer.valueOf(separated[3]),Integer.valueOf(separated[4])));
            }
            if (separated[2].equals("C")){
                devices.add(new Curtains(separated[1],Integer.valueOf(separated[3]),Integer.valueOf(separated[4])));
            }
            item.addObserver(devices.get(index));
            index++;
            sensors.add(item);
        }
    }
    public void simulation(File file)throws FileNotFoundException {
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String string = fileScanner.nextLine();
            String[] separated = string.split(",");
            sensors.get(search(separated[0])).setValue(Integer.valueOf(separated[1]));
        }
    }
    public Integer search(String name){
        Integer counter=0;
        Integer position=0;
        for (Sensor item: sensors){
            if (!item.getName().equals(name)) {
                counter++;
            }
            else {
                position=counter;
            }
        }
        return position;
    }
}

