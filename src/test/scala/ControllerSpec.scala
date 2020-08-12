package test.scala

import main.scala.Controller
import org.scalatest.funspec.AnyFunSpec

class ControllerSpec extends AnyFunSpec {

  describe("## A Set") {
    describe("# when empty") {
      it("should have size 0") {
        assert(Set.empty.size == 0)
      }

      it("should produce NoSuchElementException when head is invoked") {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }

    describe("# sum of elements") {
      it("should be greather than first element") {
        val seq = Seq(1, 2, 3, 4)
        assert(seq.head < seq.sum)
      }
    }
  }

  describe("## Controller") {
    describe("# sum of two elements [test getSum() method]") {
      val x = Controller.randomNumber
      val y = Controller.randomNumber
      val sumOf = Controller.getSum(x, y)
      it("should be equal") {
        assert(sumOf == x + y)
      }
    }
  }
}
