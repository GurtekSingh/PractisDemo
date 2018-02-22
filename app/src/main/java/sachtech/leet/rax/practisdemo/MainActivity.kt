package sachtech.leet.rax.practisdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            toast("manish kumar")//Toast.makeText(this,"manish",Toast.LENGTH_LONG).show()
            MYlogcat("manish","you are great")
            startMyActivity(Main2Activity::class)
        }
    }
}
