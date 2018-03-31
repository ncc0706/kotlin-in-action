package io.arukas.service

import io.arukas.entity.Article
import io.arukas.repository.ArticleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ArticleService {

    @Autowired
    lateinit var articleRepository: ArticleRepository

    @Transactional
    fun createArticle(article: Article): Article {
        return articleRepository.save(article)
    }


}