package edu.co.icesi.moviless3.lists

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.co.icesi.moviless3.R

class PostAdapter : RecyclerView.Adapter<PostVH>() {

    var posts = ArrayList<Post>()

    init {
        posts.add(Post("Este es mi primer comentario"))
        posts.add(Post("Este es mi segundo comentario"))
        posts.add(Post("Este es mi segundo comentario"))
        posts.add(Post("Este es mi segundo comentario"))
        posts.add(Post("Este es mi segundo comentario"))
        posts.add(Post("Este es mi segundo comentario"))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.postrow, parent, false)
        return PostVH(view)
    }

    override fun onBindViewHolder(holder: PostVH, position: Int) {
        holder.commentRow.text = posts[position].comment
    }

    override fun getItemCount(): Int {
        return posts.size
    }
}