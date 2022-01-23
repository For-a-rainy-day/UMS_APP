package Fragment

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.ussdums.R
import kotlinx.android.synthetic.main.fragment_minut_info.view.*
import kotlinx.android.synthetic.main.fragment_tarif_info.view.*

class MinutInfo : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    var REQUEST_PHONE_CALL= 1
    lateinit var root:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_minut_info, container, false)

        var name = arguments?.getString("keyMinut")
        var desc = arguments?.getString("keyMinutDesc")
        var codee = arguments?.getString("keyCodee")


        root.minutNameInfo.text = name
        root.minutDescInfo.text = desc
        root.tarifCodeMinut.text = codee

//        root.img_call2.setOnClickListener {
//            if (context?.let { it1 -> ActivityCompat.checkSelfPermission(it1, Manifest.permission.CALL_PHONE) } != PackageManager.PERMISSION_GRANTED){
//                ActivityCompat.requestPermissions(context as Activity, arrayOf(Manifest.permission.CALL_PHONE), REQUEST_PHONE_CALL)
//            }
//
//            else {
//                var callIntent= Intent(Intent.ACTION_CALL)
//                callIntent.data= Uri.parse("tel:"+ codee+"#")
//                startActivity(callIntent)
//                Toast.makeText(context, "Calling", Toast.LENGTH_SHORT).show()
//            }
//        }


        return root
    }


}