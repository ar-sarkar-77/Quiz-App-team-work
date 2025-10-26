package com.anondo.quizapppractice

data class Quiz(
    val question: String,
    val option: List<String>,
    val correctAnswerIndex: Int
)
