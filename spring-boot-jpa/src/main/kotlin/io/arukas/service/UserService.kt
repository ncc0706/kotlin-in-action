package io.arukas.service

import io.arukas.entity.User
import io.arukas.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    @Transactional
    fun createUser(user: User): User {
        return userRepository.save(user)
    }

}