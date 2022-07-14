package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Product")
 public class ProductEntity {
 @Id
 @GeneratedValue(strategy =GenerationType.SEQUENCE)
 @Column(name="productId")
 private Integer productId;
 @Column(name="productPrice")
 private Double productPrice;
 @Column(name="productName")
 private String productName;


}
