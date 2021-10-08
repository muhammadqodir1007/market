package com.example.market.repository;

import com.example.market.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "type")
public interface TypeRepository extends JpaRepository<Type,Integer> {
}
