package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_questions.*

class Questions : AppCompatActivity(), View.OnClickListener {

    private var position: Int = 1
    private var questionList: ArrayList<Question>? = null
    private var optionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        questionList = Constant.getQuestion()
        setQuestion()
        optionA.setOnClickListener(this)
        optionB.setOnClickListener(this)
        optionC.setOnClickListener(this)
        optionD.setOnClickListener(this)
        submit.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.optionA -> {
                    optionFunction(optionA, 1)
                }
                R.id.optionB -> {
                    optionFunction(optionB, 2)
                }
                R.id.optionC -> {
                    optionFunction(optionC, 3)
                }
                R.id.optionD -> {
                    optionFunction(optionD, 4)
                }
                R.id.submit -> {
                    if (optionPosition == 0) {
                        when {
                            position <= questionList!!.size -> {
                                setQuestion()
                            }
                            else -> {
                                val intent = Intent(this, MainActivity::class.java)
                                startActivity(intent)
                            }
                        }
                    } else {
                        val question = questionList?.get(position - 1)
                        if (question!!.answer != optionPosition) {
                            answerView(optionPosition, R.drawable.wrong_option_border_bg)
                        }
                        if (question.answer == optionPosition) {
                            answerView(question.answer, R.drawable.correct_option_border_bg)
                            position++
                        }
                        if (position - 1 == questionList!!.size) {
                            submit.text = "Finish"
                        } else {
                            submit.text = "Next Question"

                        }
                        optionPosition = 0
                    }

                }
            }
        }
    }

    fun setQuestion() {
        val question = questionList!!.get(position - 1)
        defaultOptionView()

        if (position == questionList!!.size) {
            submit.text = "Finish"
        }
        progressBar.progress = position
        textprogress.text = "$position" + "/" + progressBar.max
        questionText.text = question.question
        optionA.text = question.optionA
        optionB.text = question.optionB
        optionC.text = question.optionC
        optionD.text = question.optionD
    }

    fun defaultOptionView() {
        val options = ArrayList<TextView>()
        options.add(0, optionA)
        options.add(1, optionB)
        options.add(2, optionC)
        options.add(3, optionD)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.background = ContextCompat.getDrawable(this,
                    R.drawable.default_option_border_bg)
        }

    }

    fun optionFunction(textView: TextView, selectedOption: Int) {
        defaultOptionView()
        optionPosition = selectedOption
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.background = ContextCompat.getDrawable(this,
                R.drawable.selected_option_border_bg)
    }

    fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                optionA.background = ContextCompat.getDrawable(this, drawableView)
            }

            2 -> {
                optionB.background = ContextCompat.getDrawable(this, drawableView)
            }

            3 -> {
                optionC.background = ContextCompat.getDrawable(this, drawableView)
            }

            4 -> {
                optionD.background = ContextCompat.getDrawable(this, drawableView)
            }
        }

    }


}