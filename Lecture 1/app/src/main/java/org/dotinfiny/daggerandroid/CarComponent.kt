package org.dotinfiny.daggerandroid

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
}