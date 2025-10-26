package com.marv.blog.controllers;

import com.marv.blog.domain.dtos.CategoryDto;
import com.marv.blog.domain.entities.Category;
import com.marv.blog.domain.repositories.CategoryRepository;
import com.marv.blog.mappers.CategoryMapper;
import com.marv.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    //    private final CategoryRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> listCategory() {

        List<CategoryDto> categories = categoryService.listCategories()
                .stream().map(categoryMapper::toDto)
                .toList();
//        List<Category> categories = categoryRepository.findAllWithPostCount();

        return ResponseEntity.ok(categories);
    }
}
