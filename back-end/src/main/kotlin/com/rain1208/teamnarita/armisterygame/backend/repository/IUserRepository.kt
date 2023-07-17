package com.rain1208.teamnarita.armisterygame.backend.repository

import com.rain1208.teamnarita.armisterygame.backend.model.GameUser

interface IUserRepository {
    fun find(): GameUser?
    fun save(): Boolean
    fun existName(): Boolean
}