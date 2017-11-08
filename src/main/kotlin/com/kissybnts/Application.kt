package com.kissybnts

import org.jooby.Kooby
import org.jooby.Jooby.run

class Application : Kooby({
    get("/hello") {
        "Hello world!"
    }
})

fun main(args: Array<String>) {
    run(::Application, args)
}