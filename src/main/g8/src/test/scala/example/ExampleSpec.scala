package example

import org.scalacheck.{ Gen, Properties, Shrink }
import org.scalacheck.Prop.forAll
import org.scalatest._

object ExampleSpec extends Properties("Example") {

  implicit def noShrink[T]: Shrink[T] = Shrink.shrinkAny

  property("is an example") = forAll(exampleGen) { ??? }
}

class ExampleTest extends FlatSpec with Matchers {
  "foo" should "bar" in { ??? }
}

