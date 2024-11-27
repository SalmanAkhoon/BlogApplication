package com.blog.blogapp.models;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();
        private Date createdAt;
    
        public Post(){       
        }
    
        public Post(int id, String title, String content, Date createdAt){
            this.id = (long) id;
            this.title = title;
            this.content = content;
            this.createdAt = createdAt;
        }
    
        // Getters and Setters
        public Long getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = (long) id;
        }
    
        public String getTitle() {
            return title;
        }
    
        public void setTitle(String title) {
            this.title = title;
        }
    
        public String getContent() {
            return content;
        }
    
        public void setContent(String content) {
            this.content = content;
        }
    
        public Date getCreatedAt() {
            return createdAt;
        }
    
        public void setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
    }
}

