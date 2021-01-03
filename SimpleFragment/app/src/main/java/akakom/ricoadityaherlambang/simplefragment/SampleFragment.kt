package akakom.ricoadityaherlambang.simplefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import akakom.ricoadityaherlambang.simplefragment.R

class SampleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_sample, container, false)
        (activity as MainActivity?)!!.fragmentMethod()
        return view
    }
}