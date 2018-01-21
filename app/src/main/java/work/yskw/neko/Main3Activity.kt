package work.yskw.neko

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val retry_btn = findViewById<Button>(R.id.retry)
        val txt = findViewById<TextView>(R.id.result_num)

        val data = intent.getSerializableExtra("Result")
        txt.text = "$data 個"
        retry_btn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
