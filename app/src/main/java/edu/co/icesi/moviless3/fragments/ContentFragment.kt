package edu.co.icesi.moviless3.fragments


import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import edu.co.icesi.moviless3.R


class ContentFragment : Fragment(){
    //Views
    private lateinit var nameET: EditText
    private lateinit var careerET: EditText
    private lateinit var descriptionET: EditText
    private val profileButtons = ArrayList<ImageButton>();
    private lateinit var editInfoBtn: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_content, container, false)

        //Referenciar views
        nameET = root.findViewById(R.id.nameET)
        careerET = root.findViewById(R.id.careerET)
        descriptionET = root.findViewById(R.id.descriptionET)
        profileButtons.add(root.findViewById(R.id.profilePhotoBtn1))
        profileButtons.add(root.findViewById(R.id.profilePhotoBtn2))
        profileButtons.add(root.findViewById(R.id.profilePhotoBtn3))
        profileButtons.add(root.findViewById(R.id.profilePhotoBtn4))

        editInfoBtn = root.findViewById(R.id.editInfoBtn)

        profileButtons.forEach { it.setOnClickListener(::onClick) }

        editInfoBtn.setOnClickListener(::onClick)
        return root
    }

    fun onClick(v: View) {
        //La variable v que recibe este método es el view al que se le hace click

        profileButtons.forEach { it.setBackgroundColor(Color.BLACK) }
        v.setBackgroundColor(Color.rgb(83, 66,210))

        when (v.id) {
            R.id.profilePhotoBtn1 -> {

            }
            R.id.profilePhotoBtn2 -> {

            }
            R.id.profilePhotoBtn3 -> {

            }
            R.id.profilePhotoBtn4 -> {

            }
            R.id.editInfoBtn -> {

            }
        }
    }

    companion object {
        fun newInstance(): ContentFragment {
            val fragment = ContentFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}