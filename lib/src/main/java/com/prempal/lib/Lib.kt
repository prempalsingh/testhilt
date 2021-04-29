package com.prempal.lib

import javax.inject.Inject

class Lib @Inject constructor(val dependency1: Dependency1, val dependency2: Dependency2){

    fun sayHi(): String = "hi!"
}