package org.dotinfiny.daggerandroid

import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    fun providesDieselEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }
}