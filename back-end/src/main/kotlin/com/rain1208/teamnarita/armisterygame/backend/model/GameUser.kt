package com.rain1208.teamnarita.armisterygame.backend.model

class GameUser(val userId: String, val userName: String, val createAt: Long) {
    private val solvedMystery = mutableListOf<String>()
    private val clearedChapter = mutableListOf<String>()
    private val usedCoupon = mutableListOf<String>()

    fun solveMystery(mysteryId: String) {
        solvedMystery.add(mysteryId)
    }

    fun clearChapter(chapterId: String) {
        clearedChapter.add(chapterId)
    }
}