package randoms

import kotlin.test.assertEquals
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class SimpleGivenSpec : Spek({

  given("the number x equal 6") {
    val x = 6

    on("multiplying x and 7") {
      val actualAnswer = multiply(x, 7)

      it("should equal 42") {
        assertEquals(actualAnswer, 42)
      }
    }
  }
})

fun multiply(a: Int, b: Int) = a * b

