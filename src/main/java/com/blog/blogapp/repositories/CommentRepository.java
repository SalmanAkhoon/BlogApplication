package com.blog.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blogapp.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
