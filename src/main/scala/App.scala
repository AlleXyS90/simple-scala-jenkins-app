import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.Random

object Main {
  def main(args: Array[String]) = Controllers.startUp()
}

object Controllers {
  def startUp(): Unit = {
    println("APP STARTED")

    val f1 = Future {
      printMsg
    }

    val f2 = Future {
      printNumber
    }

    val futures = for {
      f1 <- f1
      f2 <- f2
    } yield (f1, f2)

    // wait for futures to be completed
    val results = Await.result(futures, Duration.Inf)

    println(s"futures result is ${results}")
    Thread.sleep(3000)
    println("application closed")
  }

  def printMsg() = {
     Thread.sleep(1000)
    println("future 1: this is a message")
    true
  }

  def printNumber() = {
    println(s"future 2: number ${getRandomNumber}")
    true
  }

  def getRandomNumber(): Int = 20 + Random.nextInt(10)
}
