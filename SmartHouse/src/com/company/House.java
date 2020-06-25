package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class House {
    ArrayList<Sensor> sensors;
    ArrayList <Display> displays;
    private File phase1 = new File("configuration.txt");
    public void load(File file) throws FileNotFoundException {
        sensors = new ArrayList<>();
        displays= new ArrayList<>();
        int index=0;
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String string = fileScanner.nextLine();
            String[] separated = string.split("=");
            Sensor item = new Sensor(separated[0], Integer.parseInt(separated[1]));
            displays.add(new Display());
            item.addObserver(displays.get(index));
            index++;
            item.setValue(Integer.parseInt(separated[1]));
            sensors.add(item);
        }
    }
}
