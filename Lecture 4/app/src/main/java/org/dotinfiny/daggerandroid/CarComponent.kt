package org.dotinfiny.daggerandroid

import dagger.Component

@Component(modules = [PetrolEngineModule::class, WheelModule::class])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}