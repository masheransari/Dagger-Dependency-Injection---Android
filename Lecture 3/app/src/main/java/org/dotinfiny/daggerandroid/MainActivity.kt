package org.dotinfiny.daggerandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //Working on a Field injection directly
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