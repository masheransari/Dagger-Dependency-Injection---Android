package org.dotinfiny.daggerandroid

import javax.inject.Inject

class Car {
    lateinit var wheels: Wheels
    lateinit var engine: Engine

    @Inject
    constructor(wheels: Wheels, engine: Engine) {
        this.wheels = wheels
        this.engine = engine
    }

    fun start() {
        engine.start()
        System.out.println("Driving....")
    }
}