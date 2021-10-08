package com.example.market.repository;

import com.example.market.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "comments")
public interface CommentsRepository extends JpaRepository<Comments,Integer> {
}
