package io.arukas.repository

import io.arukas.entity.Article
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : BaseRepository<Article, String> {
}