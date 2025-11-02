package com.metacoding.spring_oauth.post;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PostService {

    private final PostRepository postJPARepository;

    public PostService(PostRepository postJPARepository) {
        this.postJPARepository = postJPARepository;
    }

    public List<PostResponse.ListDTO> 게시글목록() {
        return postJPARepository.findAllWithUser()
                .stream()
                .map(PostResponse.ListDTO::new)
                .toList();
    }
}

