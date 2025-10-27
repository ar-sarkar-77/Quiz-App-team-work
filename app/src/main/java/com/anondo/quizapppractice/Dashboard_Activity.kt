package com.anondo.quizapppractice

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anondo.quizapppractice.databinding.ActivityDashboardBinding
import com.anondo.quizapppractice.databinding.ActivityMainBinding
import kotlin.jvm.java

class Dashboard_Activity : AppCompatActivity() {
    lateinit var binding: ActivityDashboardBinding
    var highScores =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var dataList = Sub_Option.sub_option

        binding.recyclerView.adapter = MyAdapter(this , dataList as ArrayList<QuizOption>)
        binding.recyclerView.layoutManager = GridLayoutManager(this , 2)

    }

    class MyAdapter(var context: Context , var dataList : ArrayList<QuizOption>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {


        class ViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
            var title : TextView = itemView.findViewById(R.id.text_quizOption)

        }


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            var myView = LayoutInflater.from(parent.context).inflate( R.layout.item , parent , false)
            return ViewHolder(myView)

        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            holder.title.text = ""+(dataList[position].option)

            holder.title.setOnClickListener {

                var intent = Intent(context , QuestionActivity::class.java)
                intent.putExtra("subject_op" , holder.title.text)
                context.startActivity(intent)


            }

        }

        override fun getItemCount(): Int {
            return dataList.size
        }

    }

    override fun onResume() {
        super.onResume()

        val sharedPref = getSharedPreferences("QuizAppPrefs", Context.MODE_PRIVATE)
        val savedHighScore = sharedPref.getInt("highScore", 0)

        val lastScore = intent.getIntExtra("scoress", 0)
        binding.lastScore.text = lastScore.toString()

        if (lastScore > savedHighScore) {
            sharedPref.edit().putInt("highScore", lastScore).apply()
            binding.highScore.text = lastScore.toString()
        } else {
            binding.highScore.text = savedHighScore.toString()
        }
    }

}