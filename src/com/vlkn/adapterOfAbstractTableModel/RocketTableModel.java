package com.vlkn.adapterOfAbstractTableModel;


import javax.swing.table.AbstractTableModel;

public class RocketTableModel extends AbstractTableModel {

    private final Rocket[] rockets;
    private final String[] columnNames = new String[]{"Name", "Price", "Apogee"};

    public RocketTableModel(Rocket[] rockets) {
        this.rockets = rockets;
    }

    @Override
    public int getRowCount() {
        return rockets.length;
    }

    @Override
    public String getColumnName(int name) {
        return columnNames[name];
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return rockets[rowIndex].getName();
            case 1:
                return rockets[rowIndex].getPrice();
            case 2:
                return rockets[rowIndex].getApogee();
            default:
                return null;
        }
    }
}
