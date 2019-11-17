package udit.programmer.co.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = Bundle()

        marvelbtn.setOnClickListener {
            bundle.putString("NAME", "MARVEL")
            val frags = BaseFragment()
            frags.arguments = bundle
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.container, frags
                ).commit()
        }

        dcbtn.setOnClickListener {
            bundle.putString("NAME", "DC")
            val frags = BaseFragment()
            frags.arguments = bundle
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.container, frags
                ).commit()
        }

    }
}
