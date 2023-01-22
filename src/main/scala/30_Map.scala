package yukihide.takahashi

object MapSample {

    val fruits = Map("りんご" -> 100, "みかん" -> 80, "ぶどう" -> 300)

    def mapQ1(): Int = {
        fruits.getOrElse("みかん", 0)
    }

    def mapQ2(): Int = {
        fruits.getOrElse("いちご", 0)
    }

    def mapQ3(key: String): Boolean = {
        fruits.contains(key)
    }

    def mapQ3_4(checkSeq:Seq[String]): Boolean = {
        val checked: Option[String] = checkSeq.find(i => fruits.contains(i))
        if (checked eq None) false else true
    }

    def mapQ4(): Map[String, String] = {
        fruits.mapValues(_ + "円")
    }

    val numbers = Seq(1,2,3,4,5)

    def mapQ5(): Map[Int, Seq[Int]] = {
        Map(
            0 -> numbers.filter(i => i % 2 == 0),
            1 -> numbers.filter(i => i % 2 == 1)
        )
    }

    def main(args: Array[String]): Unit = {
        println("~~~~Question1~~~~")
        println(mapQ1()) // 80

        println("~~~~Question2~~~~")
        println(mapQ2()) // 0

        println("~~~~Question3~~~~")
        println(mapQ3("ぶどう")) // true
        println(mapQ3("いちご")) // false

        println("~~~~Question3_4~~~~")
        println(mapQ3_4(Seq("ぶどう", "いちご"))) // true

        println("~~~~Question4~~~~")
        println(mapQ4()) // Map(りんご -> 100円, みかん -> 80円, ぶどう -> 300円)

        println("~~~~Question5~~~~")
        println(mapQ5()) // Map(0 -> List(2, 4), 1 -> List(1, 3, 5))

    }
}