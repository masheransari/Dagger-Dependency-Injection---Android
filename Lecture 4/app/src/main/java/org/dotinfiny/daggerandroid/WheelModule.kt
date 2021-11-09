package org.dotinfiny.daggerandroid

import dagger.Module
import dagger.Provides

@Module
class WheelModule {

    @Provides
    fun providesRims(): Rims {
        System.out.println("Rims Created")
        return Rims()
    }

    @Provides
    fun providesTires(): Tires {
        System.out.println("Tires Created")
        return Tires()
    }

    @Provides
    fun providesWheels(rims: Rims, tires: Tires): Wheels {
        System.out.println("Wheels module")
        return Wheels(rims, tires)
    }
}