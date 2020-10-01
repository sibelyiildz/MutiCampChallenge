package com.sibelyildiz.muticampchallenge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.sibelyildiz.muticampchallenge.data.RetrofitProvider
import com.sibelyildiz.muticampchallenge.data.model.Community
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launchWhenCreated {
            val response = RetrofitProvider.multiCampApi.getCommunity()
            recyclerViewCommunity.adapter =
                CommunityAdapter(response.toMutableList()) { community: Community, i: Int ->

                    val intent = Intent(this@MainActivity, DetailCommunityActivity::class.java)
                    intent.putExtra("banner", response[i].banner)
                    intent.putExtra("description", response[i].description)
                    intent.putExtra("leaderPhoto", response[i].leader.photo)
                    intent.putExtra("leaderName", response[i].leader.name)
                    intent.putExtra("instagram", response[i].links.instagram)
                    intent.putExtra("twitter", response[i].links.twitter)
                    intent.putExtra("youtube", response[i].links.youtube)
                    intent.putExtra("participation", response[i].links.participation)
                    startActivity(intent)
                }
        }
    }
}