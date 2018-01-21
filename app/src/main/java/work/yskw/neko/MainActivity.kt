package work.yskw.neko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            startActivity(Intent(this, Main2Activity::class.java))
        }


        //val button = findViewById<Button>(R.id.button)
//        val cooking_button = findViewById<Button>(R.id.cooking)
//        var cook_cnt = 0
//        val cnt = findViewById<TextView>(R.id.cnt)
//
//
//        button.setOnClickListener {
//            setContentView(R.layout.activity_main2)
//        }

//        cooking_button.setOnClickListener{
//            cook_cnt++
//            var cnt_text = "$cook_cnt 個"
//            cnt.text = Integer.toString(cook_cnt)
//        }
//        fun cooking(){
//    cook_cnt++
//    cnt.text = Integer.toString(cook_cnt)
//        }



    }

}
