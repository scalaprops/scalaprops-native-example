package example

import scalaprops._

object ListTest extends Scalaprops {

  val reverseTest = Property.forAll { xs: List[Int] =>
    xs.reverse.reverse == xs
  }

}
