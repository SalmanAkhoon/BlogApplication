package com.blog.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blogapp.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
