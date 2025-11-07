package com.marv.blog.services;

import com.marv.blog.domain.entities.Tag;

import java.util.List;

public interface TagService {
    List<Tag> getTags();
}
