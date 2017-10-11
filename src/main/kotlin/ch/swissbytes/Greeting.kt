package ch.swissbytes

import java.util.*

/**
 * A function to say hello to given user.
 *
 * @param name user name, optional
 * @return greeting string to given user
 *
 */
fun sayHi(name: String = "World"): String = "Hello $name!"

object Namer {

    val adjectives = listOf("happy", "sad", "mad", "angry", "crying", "lonely", "cheerful", "hungry", "constipated", "eloquent")
    val animals = listOf("tiger", "pig", "chicken", "dog", "cat", "donkey", "monkey", "elephant", "parrot", "rabbit")
    val random = Random()

    @JvmStatic
    fun main(args: Array<String>) {
        while (true) {
            print("What's your name? ")
            val name = readLine()
            name.let {
                val rand = { value: Int, list: List<Any> -> Math.abs(value % list.size) }
                val adj = adjectives[rand(random.nextInt(), adjectives)]
                val anim = animals[rand(random.nextInt(), animals)]
                println("Your new name is : $name, the $adj $anim")
            }
        }
    }
}