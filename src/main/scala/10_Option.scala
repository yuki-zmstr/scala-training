package yukihide.takahashi

object OptionSample {
    def optionQ1(num: Option[Int]): Int = {
        num.getOrElse(0)
    }

    def optionQ2(num: Option[Int]): Option[Int] = {
        // Some の場合は値を関数に渡し、関数によって変換された値を Some として返却
        // None の場合は関数を適用せず、 None を返却
        num.map(i => i + 3)
        // num.map(_ + 3)
    }

    def optionQ3(): Unit = {
        val strOpt: Option[String] = Some("")
        println(strOpt.isEmpty) // final def isEmpty: Boolean = this eq None
        println(strOpt.isDefined) // final def isDefined: Boolean = !isEmpty
    }

    def optionQuestion4(num: Option[Option[Int]]): Option[Int] = {
        num.flatMap(i => i.map(i => i * 2))
        // num.flatMap(_.map(_ * 2))
    }

    def main(args: Array[String]): Unit = {
        println("~~~~Question1~~~~")
        println(optionQ1(Some(10)))
        println(optionQ1(None))

        println("~~~~Question2~~~~")
        println(optionQ2(Some(10)))
        println(optionQ2(None))

        println("~~~~Question3~~~~")
        optionQ3()

        println("~~~~Question4~~~~")
        println(optionQuestion4(Some(Some(5))))
        println(optionQuestion4(None))
    }
}