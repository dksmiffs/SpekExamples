import fizzbuzz.*

fun main(args: Array<String>) {

    val fizzbuzz3 = Fizzbuzz3(DivisibilityBy3Tester(),
                              DivisibilityBy5Tester(),
                              Is15Tester())

    for (i in 1..100) {
        println(fizzbuzz3.toString(i))
    }
}
