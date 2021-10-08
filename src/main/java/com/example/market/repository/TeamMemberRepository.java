package com.example.market.repository;

import com.example.market.entity.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "teamMember")
public interface TeamMemberRepository extends JpaRepository<TeamMember,Integer> {
}
