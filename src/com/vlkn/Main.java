package com.vlkn;

import com.vlkn.adapterAgainstInterface.AdapterCarBehavior;
import com.vlkn.adapterAgainstInterface.Car;
import com.vlkn.adapterOfAbstractTableModel.Rocket;
import com.vlkn.adapterOfAbstractTableModel.RocketTableModel;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(new AdapterCarBehavior());
        car.start();
        System.out.println("========");
        car.stop();

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
        jScrollPane.setPreferredSize(new Dimension(300,100));
        return jScrollPane;
    }


    private static JTable getjTable(RocketTableModel rocketTableModel) {
        JTable jTable = new JTable(rocketTableModel);
        jTable.setRowHeight(36);
        return jTable;
    }

    private static RocketTableModel getRocketTableModel() {
        Rocket rocket = new Rocket("Shooter",3.95, 50.0);
        Rocket rocket1 = new Rocket("Orbit", 29.03, 5000.0);

        Rocket[] rockets = new Rocket[]{rocket,rocket1};
        RocketTableModel rocketTableModel = new RocketTableModel(rockets);
        return rocketTableModel;
    }

    private static void setFonts() {
        Font font = new Font("Dialog", Font.PLAIN, 18);
        UIManager.put("Table.font", font);
        UIManager.put("TableHeader.font", font);
    }


}
