package com.vlkn;

import com.vlkn.adapterOfAbstractTableModel.Rocket;
import com.vlkn.adapterOfAbstractTableModel.RocketTableModel;
import com.vlkn.compositePattern.Machine;
import com.vlkn.compositePattern.MachineComponent;
import com.vlkn.compositePattern.MachineComposite;
import com.vlkn.objectAdapterPattern.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MachineComponent leaf = new Machine();
        MachineComponent leaf1 = new Machine();
        MachineComponent leaf2 = new Machine();
        MachineComponent leaf3 = new Machine();


        List<MachineComponent> machineComponentList = new ArrayList<>();
        machineComponentList.add(leaf);
        machineComponentList.add(leaf1);
        machineComponentList.add(leaf2);
        machineComponentList.add(leaf3);

        MachineComponent machineComponent = new MachineComposite(machineComponentList);
        machineComponentList.add(machineComponent);

        MachineComposite machineComposite1 = new MachineComposite(machineComponentList);
        System.out.println(machineComposite1.getMachineComponentList().size());
        machineComposite1.getMachineCount();

    }

    private static void adapterPatternExample() {
        // adapt a toycar to use a real car's methods
        ToyCar toyCar = new CarToToycarAdapter(new Tesla());

        // adapt a car to use toycar methods
        Car car = new ToyToCarAdapter(new ToyCarCezeri());

        startCar(car);
        startToyCar(toyCar);

    }

    private static void startToyCar(ToyCar toyCar) {
        toyCar.transformIntoRobot();
    }

    private static void startCar(Car car) {
        car.start();
    }

    private static void runTableModelExample() {
        System.out.println("=========================================================================================");
        // Show Popup with Swing as example for a Object Adapter Patter based on using the abstract class.
        setFonts();
        RocketTableModel rocketTableModel = getRocketTableModel();
        JTable jTable = getjTable(rocketTableModel);
        JScrollPane jScrollPane = getjScrollPane(jTable);
        display(jScrollPane, "Rockets");
    }

    private static void display(JComponent jComponent, String title) {

        JFrame jFrame = new JFrame(title);
        jFrame.getContentPane().add(jComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    private static JScrollPane getjScrollPane(JTable jTable) {
        JScrollPane jScrollPane = new JScrollPane(jTable);
        jScrollPane.setPreferredSize(new Dimension(300, 100));
        return jScrollPane;
    }


    private static JTable getjTable(RocketTableModel rocketTableModel) {
        JTable jTable = new JTable(rocketTableModel);
        jTable.setRowHeight(36);
        return jTable;
    }

    private static RocketTableModel getRocketTableModel() {
        Rocket rocket = new Rocket("Shooter", 3.95, 50.0);
        Rocket rocket1 = new Rocket("Orbit", 29.03, 5000.0);

        Rocket[] rockets = new Rocket[]{rocket, rocket1};

        return new RocketTableModel(rockets);

    }

    private static void setFonts() {
        Font font = new Font("Dialog", Font.PLAIN, 18);
        UIManager.put("Table.font", font);
        UIManager.put("TableHeader.font", font);
    }
}
