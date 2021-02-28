package dev.weiqi.resofsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dev.weiqi.resof.asString
import dev.weiqi.resof.stringOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appName1 = stringOf(R.string.app_name)
        Log.v("TAG", "AppName: $appName1 !")

        val appName2 = R.string.app_name.asString()
        Log.v("TAG", "AppName: $appName2 !")
    }
}