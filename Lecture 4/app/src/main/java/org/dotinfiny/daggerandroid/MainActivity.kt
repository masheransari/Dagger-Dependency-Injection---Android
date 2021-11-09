package org.dotinfiny.daggerandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //Suppose that the wheel is thirdParty and we cannnot edit or update their file so in that scenario what will we do?
    @Inject
    lateinit var car: Car


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var carComponent = DaggerCarComponent.create()

        //If we have a multiple inject paramters then we can do with this as well
        carComponent.inject(this)

        car.start()

    }
}