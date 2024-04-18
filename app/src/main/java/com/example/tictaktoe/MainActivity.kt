package com.example.tictaktoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btn0:Button
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var btn7:Button
    lateinit var btn8:Button
    lateinit var btn9:Button
    lateinit var btn10:Button

    var ab=ArrayList<Button>()
    var w=0
    var u=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btn10= findViewById(R.id.btn10)

        ab.add(0,btn0)
        ab.add(1,btn1)
        ab.add(2,btn2)
        ab.add(3,btn3)
        ab.add(4,btn4)
        ab.add(5,btn5)
        ab.add(6,btn6)
        ab.add(7,btn7)
        ab.add(8,btn8)
        ab.add(9,btn9)
        ab.add(10,btn10)

        click(0)
        click(1)
        click(2)
        click(3)
        click(4)
        click(5)
        click(6)
        click(7)
        click(8)
        click(9)
        click(10)
    }
    private fun click(i: Int) {

        ab[i].setOnClickListener {
        if(u==1) {
            val q = ab[i].text
            if (q.isEmpty()) {
                if (w == 0) {
                    ab[i].setText("O")
                    w = 1
                } else {
                    ab[i].setText("X")
                    w = 0
                }
            }
            if ((!btn0.text.isEmpty() && btn0.text.equals(btn1.text) && btn0.text.equals(btn2.text))
                ||(!btn1.text.isEmpty() && btn1.text.equals(btn4.text)&& btn1.text.equals(btn7.text))
                ||(!btn2.text.isEmpty() && btn2.text.equals(btn5.text)&& btn2.text.equals(btn8.text))
                ||(!btn3.text.isEmpty() && btn3.text.equals(btn4.text)&& btn3.text.equals(btn5.text))
                ||(!btn6.text.isEmpty() && btn6.text.equals(btn7.text)&& btn6.text.equals(btn8.text))
                ||(!btn2.text.isEmpty() && btn2.text.equals(btn4.text)&& btn2.text.equals(btn6.text))
                ||(!btn0.text.isEmpty() && btn0.text.equals(btn3.text)&& btn0.text.equals(btn6.text))
                ||(!btn0.text.isEmpty() && btn0.text.equals(btn4.text)&& btn0.text.equals(btn8.text))) {
                if (ab[i].text.equals("O"))
                {
                    btn10.setText("O is win")
                    u=2
                } else {
                    btn10.setText("X is win")
                    u=2
                }
            }
        }
            if(i==9)
            {
                for(j in 0..8)
                {
                    ab[j].setText("")
                    u=1
                    btn10.setText("submit")
                }
            }
        }
    }
}