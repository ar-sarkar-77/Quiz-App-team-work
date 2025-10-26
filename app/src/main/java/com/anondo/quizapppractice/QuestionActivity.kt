package com.anondo.quizapppractice
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.anondo.quizapppractice.databinding.ActivityQuestionBinding
import kotlin.getValue
import kotlin.toString

class QuestionActivity : AppCompatActivity() {

    private val viewModel : PlayViewModel by viewModels()
    lateinit var binding: ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var subject = intent.getStringExtra("subject_op")
        showCurrentQuestion(subject.toString())

    }
    private fun showCurrentQuestion(subject : String) {

        binding.optionsGroup.setOnCheckedChangeListener(null)

        val currentQuestion = viewModel.getCurrentQues(subject)

        binding.question.text = currentQuestion.question
        binding.option1.text = currentQuestion.option[0]
        binding.option2.text = currentQuestion.option[1]
        binding.option3.text = currentQuestion.option[2]
        binding.option4.text = currentQuestion.option[3]
        binding.optionsGroup.clearCheck()

        binding.optionsGroup.setOnCheckedChangeListener { group , checkedId ->
            var checkIdNum = ( binding.optionsGroup.indexOfChild(findViewById(binding.optionsGroup.checkedRadioButtonId)))

            viewModel.checkAnswer(checkIdNum , this)
            setNextQuestion(subject.toString())
        }

    }
    fun setNextQuestion(subject : String) {
        val nextQuestion = viewModel.getNextQuestion()
        if (nextQuestion!= null){
            showCurrentQuestion(subject)
        }else{
            val resultIntent = Intent(this@QuestionActivity, ResultActivity::class.java)
            resultIntent.putExtra("score" , viewModel.getScore())
            startActivity(resultIntent)
        }
    }
}

