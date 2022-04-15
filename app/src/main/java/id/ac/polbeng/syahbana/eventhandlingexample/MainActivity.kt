package id.ac.polbeng.syahbana.eventhandlingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDisplayMessage.setOnClickListener {
            Toast.makeText(
                applicationContext, "Hello World",
                Toast.LENGTH_LONG).show()

            btnDisplayMessage.setOnClickListener(object: View.OnLongClickListener,
                View.OnClickListener {
                override fun onLongClick(p0: View?): Boolean {
                    return true
                }

                override fun onClick(p0: View?) {
                    TODO("Not yet implemented")
                }
            })
        }
    }
}