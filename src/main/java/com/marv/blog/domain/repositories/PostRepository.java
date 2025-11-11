package com.marv.blog.domain.repositories;

import com.marv.blog.domain.PostStatus;
import com.marv.blog.domain.entities.Category;
import com.marv.blog.domain.entities.Post;
import com.marv.blog.domain.entities.Tag;
import com.marv.blog.services.PostService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

    List<Post> findAllByStatusAndCategoryAndTagsContaining(PostStatus status, Category category, Tag tag);
    List<Post> findAllByStatusAndCategory(PostStatus status, Category category);
    List<Post> findAllByStatusAndTagsContaining(PostStatus status, Tag tag);
    List<Post> findAllByStatus(PostStatus status);

}
