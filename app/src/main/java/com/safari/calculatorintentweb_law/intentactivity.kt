package com.safari.calculatorintentweb_law

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


class intentactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intentactivity)

        lateinit var buttonSms:Button
        lateinit var buttonCam:Button
        lateinit var buttonMail:Button
        lateinit var buttonCall:Button
        lateinit var buttonDial:Button
        lateinit var buttonStk:Button
        lateinit var buttonShare:Button

        buttonSms = findViewById(R.id.btn_sms)
        buttonCam = findViewById(R.id.btn_cam)
        buttonMail = findViewById(R.id.btn_email)
        buttonCall = findViewById(R.id.btn_call)
        buttonDial = findViewById(R.id.btn_dail)
        buttonStk = findViewById(R.id.btn_stk)
        buttonShare = findViewById(R.id.btn_share)

        buttonCam.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }

        buttonSms.setOnClickListener {
            val uri: Uri = Uri.parse("smsto:Babez")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("aye", "Si you come thru :)")

            startActivity(intent)

        }

        buttonMail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "lawsimiyuu@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Yo Mom")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Alright Yo Mom yeah? ")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))

        }

        buttonCall.setOnClickListener {

            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254720969239"))

            if (ContextCompat.checkSelfPermission(
                    this@intentactivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@intentactivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }

        }

        buttonStk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }

        }

        buttonShare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "wassup, this app is by law")

            startActivity(shareIntent)

        }

        buttonDial.setOnClickListener {
            val phone = "+254715950987"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }

    }
}