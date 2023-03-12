package com.curlyloops.uikotlinpractice_mowrado

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        확인버튼이 눌리면? 이벤트 달아주자

        okBtn.setClickListener{

            val inputContent = contentEdt.text.toString()

            resultTxt.text = inputContent

        }


    }
}