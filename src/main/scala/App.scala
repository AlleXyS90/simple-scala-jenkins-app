import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.util.Random

object Main {
  def main(args: Array[String]) = Controllers.startUp()
}

object Controllers {
  def startUp(): Unit = {
    println("APP STARTED")

    val f1 = Future {
      val sum = getSum(randomNumber, randomNumber)
      println(s"Future 1: sum of A and B = ${sum}")
      sum
    }

    val f2 = Future {
      printSeq
    }

    val futures = for {
      f1 <- f1
      f2 <- f2
    } yield (f1, f2)

    // wait for futures to be completed
    val results = Await.result(futures, Duration.Inf)

    println(s"futures result is ${results}")
    Thread.sleep(3000)
    println("APP CLOSED")
  }

  def getSum(a: Int, b: Int) = a + b

  def randomNumber(): Int = 20 + Random.nextInt(10)

  def printSeq() = println(s"Future 2: sequence = ${Seq(1, 2, 3, 4, 5).mkString(", ")}")
}
