package example

import scalaprops.Gen

/**
 * print random numbers using scalaprops
 */
object Main {
  def main(args: Array[String]): Unit = {
    val defaultSeed = System.currentTimeMillis.toInt
    val defaultSize = 100

    val (size, seed) = args.toList match {
      case UInt(size0) :: UInt(seed0) :: _ =>
        (size0, seed0)
      case UInt(size0) :: Nil =>
        (size0, defaultSeed)
      case _ =>
        (defaultSize, defaultSeed)
    }

    println(s"size = $size, seed = $seed")

    println(Gen[Int].samples(listSize = size, seed = seed).mkString(","))
  }
}

object UInt {
  def unapply(s: String): Option[Int] =
    try {
      Some(s.toInt).filter(_ > 0)
    } catch {
      case _: NumberFormatException =>
        None
    }
}
