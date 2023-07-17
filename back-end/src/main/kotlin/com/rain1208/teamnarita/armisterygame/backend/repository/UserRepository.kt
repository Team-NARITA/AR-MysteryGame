package com.rain1208.teamnarita.armisterygame.backend.repository

import com.rain1208.teamnarita.armisterygame.backend.model.GameUser
import org.springframework.stereotype.Repository

@Repository
class UserRepository: IUserRepository {
    override fun find(): GameUser? {
        TODO("Not yet implemented")
    }

    override fun save(): Boolean {
        TODO("Not yet implemented")
    }

    override fun existName(): Boolean {
        TODO("Not yet implemented")
    }
}