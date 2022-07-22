package com.safari.calculatorintentweb_law

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculatoractivity : AppCompatActivity() {

    lateinit var btn_add:Button
    lateinit var btn_sub:Button
    lateinit var btn_divi:Button
    lateinit var btn_multi:Button


    lateinit var edt_fnum:EditText
    lateinit var edt_snum:EditText


    lateinit var txt_ans:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculatoractivity)

        edt_fnum = findViewById(R.id.edt_fnum)
        edt_snum = findViewById(R.id.edt_snum)
        txt_ans = findViewById(R.id.txt_answer)

        btn_add = findViewById(R.id.btn_add)
        btn_add!!.setOnClickListener {
            var firstnum = edt_fnum?.text.toString()
            var secondnum = edt_snum?.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                txt_ans.text = "Please input some numbers!"
            }else{
                var ans = firstnum.toDouble() + secondnum.toDouble()

                txt_ans.text = ans.toString()
            }
        }

        btn_sub = findViewById(R.id.btn_minus)
        btn_sub!!.setOnClickListener {
            var firstnum = edt_fnum?.text.toString()
            var secondnum = edt_snum?.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                txt_ans.text = "Please input some numbers!"
            }else{
                var ans = firstnum.toDouble() - secondnum.toDouble()

                txt_ans.text = ans.toString()
            }

        }

        btn_divi = findViewById(R.id.btn_div)
        btn_divi!!.setOnClickListener {
            var firstnum = edt_fnum?.text.toString()
            var secondnum = edt_snum?.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                txt_ans.text = "Please input some numbers!"
            }else{
                var ans = firstnum.toDouble() / secondnum.toDouble()

                txt_ans.text = ans.toString()
            }

        }

        btn_multi = findViewById(R.id.btn_mult)
        btn_multi!!.setOnClickListener {
            var firstnum = edt_fnum?.text.toString()
            var secondnum = edt_snum?.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                txt_ans.text = "Please input some numbers!"
            }else{
                var ans = firstnum.toDouble() * secondnum.toDouble()

                txt_ans.text = ans.toString()
            }

        }
    }
}