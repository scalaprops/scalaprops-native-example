package example

import scalaprops._

object ListTest extends Scalaprops {

  property("reverse") = Property.forAll { (xs: List[Int]) =>
    xs.reverse.reverse == xs
  }

}
