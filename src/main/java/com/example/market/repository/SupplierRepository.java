package com.example.market.repository;

import com.example.market.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier")
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
