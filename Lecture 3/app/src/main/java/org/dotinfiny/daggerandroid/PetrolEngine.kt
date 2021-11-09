package org.dotinfiny.daggerandroid

import javax.inject.Inject

class PetrolEngine : Engine {

    @Inject
    constructor() {

    }

    override fun start() {
        System.out.println("Petrol engine started")
    }
}