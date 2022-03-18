package com.springboot.blog.model;

public class Post {
    public String title, description, image;

    public Post(String title, String description, String image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }
}
