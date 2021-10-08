package com.example.market.repository;

import com.example.market.entity.Characteristics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "characteristics")
public interface CharacteristicsRepository extends JpaRepository<Characteristics,Integer> {
}
