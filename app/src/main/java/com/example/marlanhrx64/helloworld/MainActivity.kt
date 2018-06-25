package com.example.marlanhrx64.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.io.StreamCorruptedException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var scoreTimA = 0
        var scoreTimB = 0

        btnT1Plus3.setOnClickListener(){
            scoreTimA = scoreTimA+3
            txtScoreTeam1.setText("$scoreTimA")
        }

        btnT1Plus2.setOnClickListener(){
            scoreTimA = scoreTimA+2
            txtScoreTeam1.setText("$scoreTimA")
        }

        btnT1Plus1.setOnClickListener(){
            scoreTimA = scoreTimA+1
            txtScoreTeam1.setText("$scoreTimA")
        }

        btnT2Plus3.setOnClickListener(){
            scoreTimB=scoreTimB+3
            txtScoreTeam2.setText("$scoreTimB")
        }

        btnT2Plus2.setOnClickListener() {
            scoreTimB=scoreTimB+2
            txtScoreTeam2.setText("$scoreTimB")
        }

        btnT2Plus1.setOnClickListener(){
            scoreTimB=scoreTimB+1
            txtScoreTeam2.setText("$scoreTimB")
        }

        btnReset.setOnClickListener(){
            scoreTimA = 0
            scoreTimB = 0
            txtScoreTeam1.setText("$scoreTimA")
            txtScoreTeam2.setText("$scoreTimB")
        }
    }
}
