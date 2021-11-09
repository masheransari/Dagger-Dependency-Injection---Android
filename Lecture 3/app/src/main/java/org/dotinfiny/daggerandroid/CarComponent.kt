package org.dotinfiny.daggerandroid

import dagger.Component

@Component(modules = [PetrolEngineModule::class])
interface CarComponent {
    //only one module can add at a one have same parent like ENGINE {PetrolEngineModule, org.dotinfiny.daggerandroid.DieselEngineModule}
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}