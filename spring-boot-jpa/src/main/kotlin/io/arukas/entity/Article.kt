package io.arukas.entity

import org.hibernate.annotations.GenericGenerator
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "articles")
@EntityListeners(AuditingEntityListener::class)
data class Article(

        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(unique = true, length = 36)
        val id: String? = null,

        @Column(nullable = false, length = 120)
        val title: String? = null,

        @Column(length = 5000)
        val content: String? = null,

        @ManyToOne
//        @JoinColumn(name = "userid", foreignKey = ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
        @JoinColumn(name = "user_id")
        val user: User? = null,

        @CreatedDate
        val createAt: Date? = null,

        @LastModifiedDate
        val updateAt: Date? = null
)