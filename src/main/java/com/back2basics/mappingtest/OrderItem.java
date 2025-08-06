package com.back2basics.mappingtest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;

}