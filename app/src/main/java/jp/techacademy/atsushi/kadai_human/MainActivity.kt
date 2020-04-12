package jp.techacademy.atsushi.kadai_human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("tomi",31,"音楽")
        val human2 = Human("atsushi",33,"旅行")

        human1.say()
        human1.think()

        human2.say()
        human2.think()
    }
}
