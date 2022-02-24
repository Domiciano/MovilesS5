package edu.co.icesi.moviless3.lists

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.co.icesi.moviless3.R

class PostVH(root: View) : RecyclerView.ViewHolder(root) {

    var commentRow:TextView = root.findViewById(R.id.commentRow)

}