package com.metacoding.spring_oauth.post;

import java.time.format.DateTimeFormatter;

public class PostResponse {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public record ListDTO(Integer id, String title, String author, String createdAt) {
        public ListDTO(Post post) {
            this(
                    post.getId(),
                    post.getTitle(),
                    post.getUser().getUsername(),
                    post.getCreatedAt() != null ? post.getCreatedAt().format(FORMATTER) : ""
            );
        }
    }
}

