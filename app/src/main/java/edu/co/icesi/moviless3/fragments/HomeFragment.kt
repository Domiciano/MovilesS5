package edu.co.icesi.moviless3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import edu.co.icesi.moviless3.R


class HomeFragment : Fragment() {

    private lateinit var profileImage: ImageView
    private lateinit var profileName: TextView
    private lateinit var profileCareer: TextView
    private lateinit var profileDescription: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val root: View = inflater.inflate(R.layout.fragment_home, container, false)
        profileImage = root.findViewById(R.id.profileImage)
        profileName = root.findViewById(R.id.profileName)
        profileCareer = root.findViewById(R.id.profileCareer)
        profileDescription = root.findViewById(R.id.profileDescription)
        return root
    }

    companion object {
        fun newInstance(): HomeFragment {
            val fragment = HomeFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}