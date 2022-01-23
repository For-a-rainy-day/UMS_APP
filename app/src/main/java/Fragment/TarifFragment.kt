package Fragment

import Adapter.TarifAdapter
import Model.TarifModel
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import com.example.ussdums.R
import kotlinx.android.synthetic.main.fragment_tarif.view.*


class TarifFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    lateinit var root: View
    lateinit var adapter: TarifAdapter
    lateinit var list: ArrayList<TarifModel>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_tarif, container, false)


       animatsiya()
        list = ArrayList()

        list.add(TarifModel("Mobi 20", "*111*120#", "20000/1000 sum "))
        list.add(TarifModel("Mobi 30", "*111*128#", "30000/1000 sum "))
        list.add(TarifModel("Mobi 40", "*111*121#", "40000/1000 sum "))
        list.add(TarifModel("Mobi 50", "*111*121#", "40000/1000 sum "))
        list.add(TarifModel("Mobi 60", "*111*121#", "40000/1000 sum "))
        list.add(TarifModel("Mobi 70", "*111*121#", "40000/1000 sum "))

        adapter = TarifAdapter(root.context, list)

        root.tariffsRecyclerView.adapter = adapter

        return root
    }

    fun animatsiya(){
        val navOption = NavOptions.Builder()
        navOption.setEnterAnim(R.anim.exit_anim)
        navOption.setExitAnim(R.anim.pop_enter_anim)
        navOption.setPopEnterAnim(R.anim.enter_anim)
        navOption.setPopExitAnim(R.anim.pop_exit_anim)
        navOption.build()
    }

    override fun onStart() {
        super.onStart()
        val navOption = NavOptions.Builder()
        navOption.setEnterAnim(R.anim.exit_anim)
        navOption.setExitAnim(R.anim.pop_enter_anim)
        navOption.setPopEnterAnim(R.anim.enter_anim)
        navOption.setPopExitAnim(R.anim.pop_exit_anim)
        navOption.build()
    }

}