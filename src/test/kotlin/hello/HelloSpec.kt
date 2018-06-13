package hello

import kotlin.test.assertEquals
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.jetbrains.spek.api.Spek

class HelloSpec : Spek({

  given("the number x equal 6") {
    val x = 6

    on("add x and 7") {
      val actualAnswer = x + 7

      it("should equal 13") {
        assertEquals(actualAnswer, 13)
      }
    }
  }
})

