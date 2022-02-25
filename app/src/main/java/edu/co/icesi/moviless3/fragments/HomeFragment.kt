package edu.co.icesi.moviless3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.co.icesi.moviless3.R
import edu.co.icesi.moviless3.lists.PostAdapter
import edu.co.icesi.moviless3.model.User


class HomeFragment : Fragment(), ContentFragment.OnUserDataChangedListener {

    private lateinit var profileImage: ImageView
    private lateinit var profileName: TextView
    private lateinit var profileCareer: TextView
    private lateinit var profileDescription: TextView
    private lateinit var profilePostsRV: RecyclerView

    //STATE
    var user = User("Andres Andrade","Ingeniero Telemático", 123, 1823, "Lorem Ipsum", R.drawable.face1)



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val root: View = inflater.inflate(R.layout.fragment_home, container, false)
        profileImage = root.findViewById(R.id.profileImage)
        profileName = root.findViewById(R.id.profileName)
        profileCareer = root.findViewById(R.id.profileCareer)
        profilePostsRV = root.findViewById(R.id.profilePostsRV)
        profilePostsRV.adapter = PostAdapter()
        profilePostsRV.layoutManager = LinearLayoutManager(context)
        profilePostsRV.setHasFixedSize(false)

        profileDescription = root.findViewById(R.id.profileDescription)

        //Poblar el estado

        profileName.text = user.name
        profileCareer.text = user.career
        profileDescription.text = user.description
        profileImage.setImageResource(user.photoID)


        return root
    }

    companion object {
        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }

    override fun onUserDataChanged(user: User) {
        //NUNCA !!!!!!!! Usar la UI
        this.user = user

    }
}