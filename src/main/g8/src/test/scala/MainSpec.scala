import org.scalatest.matchers.ShouldMatchers
import org.scalatest._

class MainSpec extends FunSpec with ShouldMatchers {
  describe("Example") {
    it("should assert 1 equals 1") {
      1 should equal(1)
    }
  }
}
