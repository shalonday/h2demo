package com.springclass.h2demo.repository;

import com.springclass.h2demo.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
