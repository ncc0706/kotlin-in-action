package io.arukas.repository

import io.arukas.entity.User
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : BaseRepository<User, String> {
}