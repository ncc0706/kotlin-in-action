package io.arukas

import io.arukas.entity.Article
import io.arukas.entity.User
import io.arukas.service.ArticleService
import io.arukas.service.UserService
import io.qala.datagen.RandomValue
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class SpringBootJpaApplicationTests {

    @Autowired
    lateinit var userService: UserService

    @Autowired
    lateinit var articleService: ArticleService

    @Test
    fun contextLoads() {
        val user = User(username = RandomValue.length(12).alphanumeric())
        userService.createUser(user);

        val title = RandomValue.length(5).alphanumeric()
        val content = RandomValue.length(10).alphanumeric()
        val article = Article(title = title, user = user, content = content)

        articleService.createArticle(article = article)
    }


}
