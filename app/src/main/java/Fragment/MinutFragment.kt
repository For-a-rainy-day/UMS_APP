package Fragment

import Adapter.MinutAdapter
import Model.MinutModel
import android.os.Bundle
import android.transition.Transition
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.LayoutInflater.from
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.transition.TransitionInflater.from
import com.example.ussdums.R
import kotlinx.android.synthetic.main.fragment_minut.view.*


class MinutFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navOption = NavOptions.Builder()
        navOption.setEnterAnim(R.anim.exit_anim)
        navOption.setExitAnim(R.anim.pop_enter_anim)
        navOption.setPopEnterAnim(R.anim.enter_anim)
        navOption.setPopExitAnim(R.anim.pop_exit_anim)
        navOption.build()

   //  sharedElementEnterTransition= Transition.from(context).inflateTransition(android.R.transition.move)
    }

    lateinit var root:View
    lateinit var adapter: MinutAdapter
    lateinit var list: ArrayList<MinutModel>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_minut, container, false)
        val navOption = NavOptions.Builder()
        navOption.setEnterAnim(R.anim.exit_anim)
        navOption.setExitAnim(R.anim.pop_enter_anim)
        navOption.setPopEnterAnim(R.anim.enter_anim)
        navOption.setPopExitAnim(R.anim.pop_exit_anim)
        navOption.build()
        list = ArrayList()

        list.add(MinutModel("20 daqiqa", "*103*60#", "  Paketda 20 daqiqa"))
        list.add(MinutModel("40 daqiqa", "*103*120#", " Paketda 40 daqiqa"))
        list.add(MinutModel("60 daqiqa", "*103*160#", " Paketda 60 daqiqa"))
        list.add(MinutModel("80 daqiqa", "*103*180#", "  Paketda 80 daqiqa"))
        list.add(MinutModel("100 daqiqa", "*103*185#", " Paketda 100 daqiqa"))

        adapter = MinutAdapter(root.context, list)

        root.minutesRecyclerView.adapter = adapter


        return root
    }


}