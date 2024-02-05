package com.bignerdranch.android.geoquiz

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.correct_snack,
                Snackbar.LENGTH_SHORT,
            )
                .show()
        }

        falseButton.setOnClickListener { view: View ->
            Snackbar.make(
                view,
                R.string.incorrect_snack,
                BaseTransientBottomBar.LENGTH_SHORT,
            )
                .show()
        }
    }
}
