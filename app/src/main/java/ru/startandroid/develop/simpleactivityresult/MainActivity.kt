package ru.startandroid.develop.simpleactivityresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), OnClickListener {

    private var tvName: TextView? = null
    private var btnName: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvName = findViewById<TextView>(R.id.tvName)
        btnName = findViewById<Button>(R.id.btnName)
        btnName?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, NameActivity::class.java)
        startActivityForResult(intent, 1)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data == null) {
            return
        }
        val name = data.getStringExtra("name")
        tvName!!.text = "Your name is  $name"
    }

}

