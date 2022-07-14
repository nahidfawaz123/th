package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="orderId")
    private  Integer orderId;
    @Column(name="total ")
    private  double total ;

}
