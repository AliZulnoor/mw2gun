package com.example.mw2gun

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main_work.*
import kotlinx.android.synthetic.main.popup.*


class MainWork : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_work)
         val myDialoug = Dialog(this)
         myDialoug.setContentView(R.layout.popup)
         myDialoug.setCancelable(true)
         myDialoug.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
         myDialoug.show()
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
