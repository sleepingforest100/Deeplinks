package kz.just_code.notifications_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = intent?.data?.getQueryParameter("message")
        findViewById<TextView>(R.id.textView).text = message
    }
}

