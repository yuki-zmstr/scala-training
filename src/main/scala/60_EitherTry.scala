package yukihide.takahashi
import scala.util.Try

object EitherTrySample {


    def main(args: Array[String]): Unit = {
        val sampleTry: Try[Int]  = Try(2)
        val sampleEither: Either[String, Int] = sampleTry.toEither.left.map(i => i.getMessage)
    }

}