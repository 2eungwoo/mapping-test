package com.back2basics.mappingtest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Order {
    @Id @GeneratedValue
    private Long id;

    @OneToMany
    @JoinColumn(name = "order_id")
    private List<OrderItem> items = new ArrayList<>();
}