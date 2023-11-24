package kz.just_code.notifications_homework

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val buttonText = intent?.data?.getQueryParameter("btn")
        findViewById<Button>(R.id.button).text = buttonText
    }
}