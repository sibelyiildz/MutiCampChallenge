package com.sibelyildiz.muticampchallenge

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sibelyildiz.muticampchallenge.data.model.Community
import kotlinx.android.synthetic.main.row_item_list.view.*


class CommunityViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(R.layout.row_item_list, container, false)
) {

    fun bind(
        community: Community,
        setOnClickListener: (community: Community, position: Int) -> Unit
    ) {

        itemView.image_view.load(community.banner)

        itemView.setOnClickListener {
            setOnClickListener(community, position)
        }

    }

}