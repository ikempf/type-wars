import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric._


object Main extends App {

  implicit class Divided(val x: Int) extends AnyVal {
    def divideBy(y: Int Refined Positive): Float = x / y.value
  }

  val a: Int Refined Positive = 3
  val b: Int Refined Positive = 4

  val m: Int Refined Greater[W.`4`.T] = 5
  val n: Int Refined Greater[W.`4`.T] = 5

  val r = m.value + n.value
  println(r)

  val x = 6 divideBy a
  println(x)

}