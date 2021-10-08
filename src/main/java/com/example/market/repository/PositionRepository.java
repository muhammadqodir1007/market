package com.example.market.repository;

import com.example.market.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path = "position")
public interface PositionRepository extends JpaRepository<Position,Integer> {
}
