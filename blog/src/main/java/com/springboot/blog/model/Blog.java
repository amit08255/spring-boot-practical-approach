package com.springboot.blog.model;

public class Blog {
    public Post[] getPostList() {
        Post[] list = {
                new Post("Spring Boot 101", "This post introduces you with Spring Boot 101.", "https://generative-placeholders.glitch.me/image?width=600&height=300&colors=72"),
                new Post("How to deal with bitcoin", "This post contains guide on dealing with bitcoin for beginners.", "https://generative-placeholders.glitch.me/image?width=600&height=300&colors=29"),
                new Post("React Mix 101", "Here we are going to build exciting project with React Remix.", "https://generative-placeholders.glitch.me/image?width=600&height=300&colors=49"),
        };

        return list;
    }
}
