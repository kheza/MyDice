package com.keza.dice.mydice

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

@Suppress("UnnecessaryVariable")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {

    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    //Initialize the views

    /**
     * Declare and initialize the views
     */

    val buttonToast: Button = findViewById(R.id.button_toast)
    val buttonRoll: Button = findViewById(R.id.button_roll)
    //val buttonCount:Button= findViewById(R.id.button_c\ount)

    buttonToast.setOnClickListener{showToast()}
    buttonRoll.setOnClickListener{rollDice()}
    //buttonCount.setOnClickListener{displayCount()}

}
private fun showToast()
{
    Toast.makeText(this,"Talk to me baby!!", Toast.LENGTH_SHORT).show()
}

private fun rollDice()
{
    //create or declare and initialize a variable for storing  generated random number

    val myDiceValue=(1..10).random()
    //Declare and initialize the textview for showing the result
    val textViewResult: TextView = findViewById(R.id.textResult)
    textViewResult.text = myDiceValue.toString()

    fun displayCount()
    {
        val countVal=myDiceValue+1

        val textViewResult:TextView=findViewById(R.id.textResult)
        textViewResult.text=countVal.toString()
    }
    val buttonCount:Button=findViewById(R.id.button_count)
    buttonCount.setOnClickListener{displayCount()}
}
}