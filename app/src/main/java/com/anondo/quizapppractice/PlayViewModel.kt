
package com.anondo.quizapppractice

import android.content.Context
import android.content.Intent
import androidx.lifecycle.ViewModel
import kotlin.text.clear

class PlayViewModel : ViewModel() {

    var dataList : MutableList<Quiz> = mutableListOf()
    private var currentIndex = 0
    private var score = 0


    fun getCurrentQues(subject : String) : Quiz{

        when (subject) {
            "Bangladesh" -> dataList.addAll(Bangladesh.question.shuffled())
            "World" -> dataList.addAll(World.question.shuffled())
            "Islam" -> dataList.addAll(Islam.question.shuffled())
            "Science" -> dataList.addAll(Science.question.shuffled())
            "Mathematics" -> dataList.addAll(Mathematics.question.shuffled())
        }

        return dataList[currentIndex]

    }

    fun getNextQuestion() : Quiz?{
        currentIndex++

        return if (currentIndex < dataList.size){
            dataList[currentIndex]
        }else{
            null
        }

    }

    fun checkAnswer(selectedIndex: Int , context: Context) {
        val currentQuiz = dataList[currentIndex]

        if (selectedIndex == currentQuiz.correctAnswerIndex) {
            score++
        }else{
            var resultIntent = Intent(context , ResultActivity::class.java)
            resultIntent.putExtra("score" , getScore())
            context.startActivity(resultIntent)
        }
    }

    fun getScore(): Int {
        return score
    }


}