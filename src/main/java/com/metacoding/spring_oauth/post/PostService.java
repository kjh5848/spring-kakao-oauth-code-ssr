package com.metacoding.spring_oauth.post;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postJPARepository;

    public List<PostResponse.ListDTO> 게시글목록() {
        return postJPARepository.findAllWithUser()
                .stream()
                .map(PostResponse.ListDTO::new)
                .toList();
    }
}

