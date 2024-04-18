package com.javatechie.os.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS_TBL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String category;
    private double quantity;
    private double totalAmount;

    public Order(String name, String category, double quantity, double totalAmount) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }
}
