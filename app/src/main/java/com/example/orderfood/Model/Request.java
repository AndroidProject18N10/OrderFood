package com.example.orderfood.Model;

import java.util.List;

/**
 * Created by 123456 on 2017/11/20.
 */

public class Request {
    private String phone;
    private String name;
    private String address;
    private String total;
    private String status;
    private List<Order> foods;
    private String paymentState;
    private boolean partial = false;

    public Request() {
    }

    public Request(String phone, String name, String address, String total, String status, String paymentState,List<Order> foods ) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.total = total;
        this.status= status;
        this.foods = foods;
        this.paymentState = paymentState;
         //Default is 0, 0:Placed, 1: Shipping, 2: Shipped
    }

    public boolean isPartial() {
        return partial;
    }

    public void setPartial(boolean partial) {
        this.partial = partial;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    public String getPaymentState() {
        return paymentState;
    }

    public void setgetPaymentState(String paymentState) {
        this.paymentState = paymentState;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
