package sachtech.leet.rax.practisdemo

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import sachtech.leet.rax.practisdemo.R.id.text
import kotlin.reflect.KClass

/**
 * Created by root on 22/2/18.
 */
fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, message, duration).show()
}fun Context.MYlogcat(message: String,title:String){
    Log.e(title,message)
}fun Context.startMyActivity(activity: KClass<out AppCompatActivity>){
    startActivity(Intent(this,activity.java))
}