package vinova.henry.com.findmyage

import android.content.ContentProvider
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Type
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_calcu.setOnClickListener(){
            Log.d("button", "Clicked")
            var yearOFBirth: Int = edt_age.text.toString().toInt()
            var age = Calendar.getInstance().get(Calendar.YEAR) - yearOFBirth
            tv_age.text = age.toString()

        }

    }
}
