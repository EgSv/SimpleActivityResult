package ru.startandroid.develop.simpleactivityresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText

class NameActivity : AppCompatActivity(), OnClickListener {

    private var etName:EditText? = null
    private var btnOk:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        etName = findViewById<EditText>(R.id.etName)
        btnOk = findViewById<Button>(R.id.btnOk)

        btnOk?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent: Intent = Intent()
        intent.putExtra("name", etName!!.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }
}