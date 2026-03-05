package com.mycompany.main;

public enum Menu {
    UPDATECUSTOMER(1, "updateCustomer", null),
    UNKNOWN(0, "Unknown", null);

    private final int value;
    private final String label;
    private final Object service;

    Menu(int value, String label, Object service) {
        this.value = value;
        this.label = label;
        this.service = service;
    }

    public int getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    public Object getService() {
        return service;
    }
}
