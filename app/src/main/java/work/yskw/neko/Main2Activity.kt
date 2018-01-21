package work.yskw.neko

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import android.os.Handler

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val cooking_button = findViewById<Button>(R.id.cooking)
        var cook_cnt = 0
        var gyoza_cnt = 0
        val cnt = findViewById<TextView>(R.id.cnt)
        val time = findViewById<TextView>(R.id.time)
        val cook_img = findViewById<ImageView>(R.id.cook)
        val handler = Handler()
        var timeValue = 0
        var maxTime = 10

        val runnable = object : Runnable {
            override fun run() {
                timeValue++
                handler.postDelayed(this, 1000)
                var seconds = maxTime-timeValue
                if(seconds <= 0){
                    time.text = "終了"
                }else {
                    time.text = "$seconds 秒"
                }
            }
        }

        handler.post(runnable)

        cooking_button.setOnClickListener{
            if(timeValue < maxTime ) {
                cook_cnt++
                when (cook_cnt % 10) {
                    0 -> cook_img.setImageResource(R.drawable.kawa)
                    1 -> cook_img.setImageResource(R.drawable.kyabetu)
                    2 -> cook_img.setImageResource(R.drawable.cutkyabetsu)
                    3 -> cook_img.setImageResource(R.drawable.nira)
                    4 -> cook_img.setImageResource(R.drawable.mig)
                    5 -> cook_img.setImageResource(R.drawable.tane)
                    6 -> cook_img.setImageResource(R.drawable.yaku1)
                    7 -> cook_img.setImageResource(R.drawable.yaku2)
                    8 -> cook_img.setImageResource(R.drawable.yaku3)
                    9 -> cook_img.setImageResource(R.drawable.finish)

                    else -> cook_img.setImageResource(R.drawable.kawa)
                }
                if (cook_cnt % 11 == 0) {
                    gyoza_cnt++
                    var cnt_text = "$gyoza_cnt 個"
                    cnt.text = cnt_text
                }
            }
            else{
                handler.removeCallbacks(runnable)
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("Result", gyoza_cnt)
                startActivity(intent)
            }

        }

    }
}
