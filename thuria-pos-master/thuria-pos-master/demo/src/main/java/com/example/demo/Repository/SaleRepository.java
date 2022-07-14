package com.example.demo.Repository;

import com.example.demo.Entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Integer> {
}
