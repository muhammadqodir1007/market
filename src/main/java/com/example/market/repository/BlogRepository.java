package com.example.market.repository;

import com.example.market.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "blog")
public interface BlogRepository extends JpaRepository<Blog,Integer> {
}
