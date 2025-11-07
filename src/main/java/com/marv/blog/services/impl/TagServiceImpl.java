package com.marv.blog.services.impl;

import com.marv.blog.domain.entities.Tag;
import com.marv.blog.domain.repositories.TagRepository;
import com.marv.blog.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Override
    public List<Tag> getTags() {
        return List.of();
    }
}
