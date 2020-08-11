import org.scalatest.funspec.AnyFunSpec

class SetSpec extends AnyFunSpec {

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

    describe("# sum of all elements") {
      it("should be greather than first element") {
        val seq = Seq(1, 2, 3, 4)
        assert(seq.head < seq.sum)
      }
    }
  }
}
