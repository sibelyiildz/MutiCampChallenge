package com.sibelyildiz.muticampchallenge

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sibelyildiz.muticampchallenge.data.model.Community


class CommunityAdapter(
    val communityList: List<Community>,
    private val setOnClickListener: (community: Community, position: Int) -> Unit
) : RecyclerView.Adapter<CommunityViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommunityViewHolder {
        return CommunityViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return communityList.size
    }

    override fun onBindViewHolder(holder: CommunityViewHolder, position: Int) {
        holder.bind(communityList[position], setOnClickListener)
    }
}