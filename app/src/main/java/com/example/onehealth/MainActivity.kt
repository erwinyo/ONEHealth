package com.example.onehealth

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.onehealth.ui.theme.ONEHealthTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val id_type = resources.getStringArray(R.array.id_type)
        val spinner_id = findViewById<Spinner>(R.id.spinner_id)

        val gender_type = resources.getStringArray(R.array.gender_type)
        val spinner_gender = findViewById<Spinner>(R.id.spinner_gender)

        val blood_type = resources.getStringArray(R.array.blood_type)
        val spinner_blood_type = findViewById<Spinner>(R.id.spinner_blood_type)


        if(spinner_id != null && spinner_gender != null  && spinner_blood_type != null) {
            val adapter_id = ArrayAdapter(this, android.R.layout.simple_spinner_item, id_type)
            val adapter_gender = ArrayAdapter(this, android.R.layout.simple_spinner_item, gender_type)
            val adapter_blood_type = ArrayAdapter(this, android.R.layout.simple_spinner_item, blood_type)
            // set spinner adapter
            spinner_id.adapter = adapter_id
            spinner_gender.adapter = adapter_gender
            spinner_blood_type.adapter = adapter_blood_type

            // spinner ID settings
            spinner_id.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,"Selected : " + id_type[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }

            // spinner GENDER settings
            spinner_gender.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,"Selected : " + gender_type[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }

            // spinner BLOOD TYPE settings
            spinner_blood_type.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,"Selected : " + blood_type[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }

        }



    }
}