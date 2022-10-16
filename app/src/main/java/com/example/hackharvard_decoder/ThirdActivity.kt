package com.example.hackharvard_decoder

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import java.io.IOException

class ThirdActivity : AppCompatActivity() {
    private lateinit var ImageView2: ImageView
    private lateinit var ImageView3: ImageView
    private lateinit var ImageView4: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        ImageView2 = findViewById(R.id.imageView2)
        ImageView3 = findViewById(R.id.imageView3)
        ImageView4 = findViewById(R.id.imageView4)

        val bitmap1: Bitmap? = assetsToBitmap("chickenkiev.webp")
        val bitmap2: Bitmap? = assetsToBitmap("instant.png")
        val bitmap3: Bitmap? = assetsToBitmap("gochujangchickentenders.jpg")


        bitmap1?.apply {
            ImageView2.setImageBitmap(this)
        }

        bitmap2?.apply {
            ImageView3.setImageBitmap(this)
        }

        bitmap3?.apply {
            ImageView4.setImageBitmap(this)
        }

    }


    fun Context.assetsToBitmap(fileName: String): Bitmap?{
        return try {
            with(assets.open(fileName)){
                BitmapFactory.decodeStream(this)
            }
        } catch (e: IOException) { null }
    }
}