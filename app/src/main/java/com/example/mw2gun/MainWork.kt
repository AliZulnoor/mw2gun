package com.example.mw2gun

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.view.View
import kotlinx.android.synthetic.main.activity_main_work.*


 class MainWork : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_work)



         var play= MediaPlayer.create(this, R.raw.change);
        findViewById<ImageView>(R.id.gun);
        findViewById<Button>(R.id.goldButton);

        goldButton.setOnClickListener {
            gun.setImageResource(R.drawable.goldg);
            play.start();
        }
        findViewById<ImageView>(R.id.gun)
        findViewById<Button>(R.id.platButton)
        platButton.setOnClickListener {
            gun.setImageResource(R.drawable.platinumg)
            play.start();
        }
        findViewById<ImageView>(R.id.gun)
        findViewById<Button>(R.id.damasButton)
        damasButton.setOnClickListener {
            gun.setImageResource(R.drawable.damscusg)
            play.start();
        }
        findViewById<ImageView>(R.id.gun)
        findViewById<Button>(R.id.obsiButton)
        obsiButton.setOnClickListener {
            gun.setImageResource(R.drawable.obsidiong)
            play.start();
        }
    }
}
