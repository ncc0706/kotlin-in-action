package io.arukas.entity

import org.hibernate.annotations.GenericGenerator
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener::class)
data class User(

        @Id
        @GeneratedValue(generator = "uuid")
        @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(unique = true, length = 36)
        val id: String? = null,

        @Column(unique = true, length = 20)
        val username: String? = null,

        @CreatedDate
        val createAt: Date? = null,

        @LastModifiedDate
        val updateAt: Date? = null

)