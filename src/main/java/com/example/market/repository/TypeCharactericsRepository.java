package com.example.market.repository;

import com.example.market.entity.TypeCharacterics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "typeCharacteristics")
public interface TypeCharactericsRepository extends JpaRepository<TypeCharacterics,Integer> {
}
