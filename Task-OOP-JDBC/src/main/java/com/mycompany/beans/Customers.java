package beans;

import java.util.LinkedList;

public class Customers extends Person {
         
    public String city;
    private double creditLimit;
    public String country;
    public LinkedList<OrderDetail> orders;

    public Customers() {
    }

    public Customers(int customerNo, String customerName, String city, double creditLimit, String country, LinkedList<OrderDetail> orders) {
        this.customerNo = customerNo;
        this.customerName = customerName;
        this.city = city;
        this.creditLimit = creditLimit;
        this.country = country;
        this.orders = orders;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedList<OrderDetail> getOrders() {
        return orders;
    }

    public void setOrders(LinkedList<OrderDetail> orders) {
        this.orders = orders;
    }

    
    
    @Override
    public double getCreditLimit() {
        return creditLimit;
    }

}
