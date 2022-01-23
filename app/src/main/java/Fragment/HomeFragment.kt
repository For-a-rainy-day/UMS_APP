package Fragment

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import com.example.ussdums.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_home, container, false)

      //  val constraintLayout = findViewById<ConstraintLayout>(android.R.id.layout_cond)
//        val animationDrawable = layout_cond.background as AnimationDrawable
//        animationDrawable.setEnterFadeDuration(2000)
//        animationDrawable.setExitFadeDuration(4000)
//        animationDrawable.start()


        root.tariffs_img.setOnClickListener{

            val navOption = NavOptions.Builder()
            navOption.setEnterAnim(R.anim.exit_anim)
            navOption.setExitAnim(R.anim.pop_enter_anim)
            navOption.setPopEnterAnim(R.anim.enter_anim)
            navOption.setPopExitAnim(R.anim.pop_exit_anim)

            root.findNavController().navigate(R.id.tarifFragment)
            navOption.build()
        }

        root.minutes_img.setOnClickListener{
            root.findNavController().navigate(R.id.minutFragment2)
        }

        root.internet_img.setOnClickListener {
            Toast.makeText(context, "Tuzatishlar ketmoqda", Toast.LENGTH_SHORT).show()
        }
        root.services_img.setOnClickListener {
            Toast.makeText(context, "Tuzatishlar ketmoqda", Toast.LENGTH_SHORT).show()
        }
        root.sms_img.setOnClickListener {
            Toast.makeText(context, "Tuzatishlar ketmoqda", Toast.LENGTH_SHORT).show()
        }
        root.new_img.setOnClickListener {
            Toast.makeText(context, "Tuzatishlar ketmoqda", Toast.LENGTH_SHORT).show()
        }


        return root
    }


}