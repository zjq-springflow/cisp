package com.zbin.cisp.service;

import com.zbin.cisp.domain.Article;
import org.springframework.stereotype.Service;

/**
 * Created by Zbin on 2019-02-16
 */
@Service
public interface ArticleService {

  void create(Article article);
}