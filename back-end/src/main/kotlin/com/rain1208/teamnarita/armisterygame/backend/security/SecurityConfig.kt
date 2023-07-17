package com.rain1208.teamnarita.armisterygame.backend.security

import com.rain1208.teamnarita.armisterygame.backend.repository.IUserRepository
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@Configuration
@EnableWebSecurity
class SecurityConfig(private val userRepository: IUserRepository) {
}