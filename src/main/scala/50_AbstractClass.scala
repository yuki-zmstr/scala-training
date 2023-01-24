package yukihide.takahashi

object AbstractClassSample {

    abstract class Shape(
        height: Int
    ) {
        def calculate(): Int
    }

    case class RectangularCuboid(
        height: Int,
        length: Int,
        width: Int
    ) extends Shape(height = height) {
        def calculate(): Int = {
            length * width * height
        }
    }

    case class SquarePyramid(
        height: Int,
        baselength: Int,
    ) extends Shape(height = height) {
        def calculate(): Int = {
            baselength ^ 2 * height * 1/3
        }
    }

    def main(args: Array[String]): Unit = {
        
        val cuboidSample = RectangularCuboid(1,2,3)
        println(cuboidSample.calculate()) // 6

        val pyramidSample = SquarePyramid(1,3)
        println(pyramidSample.calculate()) // 3
    }

}