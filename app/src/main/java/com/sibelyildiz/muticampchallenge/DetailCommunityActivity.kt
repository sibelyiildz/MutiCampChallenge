package com.sibelyildiz.muticampchallenge

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import coil.load
import coil.transform.CircleCropTransformation
import kotlinx.android.synthetic.main.activity_detail_community.*

class DetailCommunityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_community)


        val imageViewBanner = intent.getStringExtra("banner")
        val imageViewLeaderPhoto = intent.getStringExtra("leaderPhoto")
        val textViewLeaderName = intent.getStringExtra("leaderName")
        val textViewDescription = intent.getStringExtra("description")
        val instagram = intent.getStringExtra("instagram")
        val twitter = intent.getStringExtra("twitter")
        val youtube = intent.getStringExtra("youtube")
        val participation = intent.getStringExtra("participation")

        image_view_banner.load(imageViewBanner)
        image_view_leader_photo.load(imageViewLeaderPhoto) {
            transformations(CircleCropTransformation())
        }
        text_view_leader_name.text = textViewLeaderName
        text_view_description.text = textViewDescription


        image_view_instagram.setOnClickListener {
            val linkIntsgram = Uri.parse(instagram)
            val intent = Intent(Intent.ACTION_VIEW, linkIntsgram)
            startActivity(intent)
        }

        image_view_twitter.setOnClickListener {
            val linkTwitter = Uri.parse(twitter)
            val intent = Intent(Intent.ACTION_VIEW, linkTwitter)
            startActivity(intent)
        }

        image_view_youtube.setOnClickListener {
            val linkYoutube = Uri.parse(youtube)
            val intent = Intent(Intent.ACTION_VIEW, linkYoutube)
            startActivity(intent)
        }

        image_view_participation.setOnClickListener {
            val linkParticipation = Uri.parse(participation)
            val intent = Intent(Intent.ACTION_VIEW, linkParticipation)
            startActivity(intent)
        }


    }
}