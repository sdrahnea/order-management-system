package com.oms.controller;

import com.oms.model.ArticleCategory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sdrahnea
 */
@RestController
@RequestMapping(value = "/article-category")
public class ArticleCategoryController extends AbstractController<ArticleCategory> {
}