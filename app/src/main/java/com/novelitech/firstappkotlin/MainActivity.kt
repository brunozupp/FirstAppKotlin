package com.novelitech.firstappkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.novelitech.firstappkotlin.ui.theme.FirstAppKotlinTheme

class MainActivity : ComponentActivity() {

    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById<TextView>(R.id.txt_result)

        val buttonConverter = findViewById<Button>(R.id.btn_converter)

        buttonConverter.setOnClickListener {
            converter()
        }
    }

    private fun converter() {
        val selectedCurrency = findViewById<RadioGroup>(R.id.radio_group)

        val checked = selectedCurrency.checkedRadioButtonId

        val currency = when(checked) {
            R.id.radio_usd -> "USD"
            R.id.radio_eur -> "EUR"
            else -> "CLP"
        }

        val editField = findViewById<EditText>(R.id.edit_field)

        val value = editField.text.toString()

        if(value.isEmpty()) {
            return
        } else {

        }
    }
}