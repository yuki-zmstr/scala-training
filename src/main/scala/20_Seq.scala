package yukihide.takahashi

object SeqSample {

    def seqQ1(numSeq: Seq[Int]): Seq[Int] = {
        numSeq.map(i => if (i % 3 == 0) 0 else i)
    }

    def seqQ2(numSeq: Seq[Int]): Seq[Int] = {
        numSeq.filter(i => i % 3 == 0)
    }

    def seqQ3(numSeqSeq: Seq[Seq[Int]]): Seq[Seq[Int]] = {
        numSeqSeq.filter(seq => seq.exists(i => i % 3 == 0))
    }

    def seqQ4(numSeq: Seq[Int]): Int = {
        val found = numSeq.find(i => i % 2 == 0)
        return found.getOrElse(-1)
    }

    def seqQ5(numOptSeq: Seq[Option[Int]]): Option[Int] = {
        val result: Option[Option[Int]] = numOptSeq.find(i => i.toString.map(_.asDigit).toList.contains(0))
        return result.flatMap(i => i.map(i => i))
    }

    def seqQ6(strSeq: Seq[String]): Seq[String] = {
        strSeq.collect{case str if str.length >= 2 => str + 'x'}
    }

    def seqQ7(numSeq: Seq[Int]): Int = {
        val collected: Option[Int] = numSeq.collectFirst{case i if i >= 100 => i * 2}
        collected.getOrElse(0)
    }

    def seqQ8(numSeq: Seq[Int]): Int = {
        numSeq.headOption.getOrElse(0) + numSeq.lastOption.getOrElse(0)
    }

    def seqQ9(numSeq: Seq[Int]): Seq[Int] = {
        numSeq.init.tail
    }

    def seqQ10(numSeq: Seq[Int]): Int = {
        numSeq match {
            case n1 +: n2 +: t :+ n3 => n1 + n3
            case n1 +: t => 0
            case _ => -1
        }
    }

    def reverse[T](list: Seq[T]): Seq[T] = {
        list.foldLeft(Seq[T]())((acc: Seq[T], n:T) => n +: acc)
    }

    def product(numSeq: Seq[Int]): Int = { 
        numSeq.foldRight(1: Int)((acc: Int, n: Int) => n * acc)
    }

    def product_with_error_handling(numSeq: Seq[Int]): Int = { 
        numSeq.reduce((acc: Int, n: Int) => n * acc)
    }

    def seqQ14and15(): Unit = {
        val seq: Seq[Int] = Seq(3*4, 4*2, 4*1)
        println(seq.max)
        println(seq.min)
    }


    def main(args: Array[String]): Unit = {
        println("~~~~Question1~~~~")
        println(seqQ1(Seq(1,2,3))) // List(1, 2, 0)

        println("~~~~Question2~~~~")
        println(seqQ2(Seq(1,2,3))) // List(3)

        println("~~~~Question3~~~~")
        println(seqQ3(Seq(Seq(1,2,3), Seq(1,2,4), Seq(3,4,5)))) // List(List(1, 2, 3), List(3, 4, 5))

        println("~~~~Question4~~~~")
        println(seqQ4(Seq(1,2,3,4,5,6))) // 2
        println(seqQ4(Seq(1,3,5))) // -11

        println("~~~~Question5~~~~")
        println(seqQ5(Seq(Some(12), Some(102)))) // Some(102)
        println(seqQ5(Seq(Some(12), Some(12)))) // None

        println("~~~~Question6~~~~")
        println(seqQ6(Seq("Hello", "I", "am", "Yuki"))) // List(Hellox, amx, Yukix)

        println("~~~~Question7~~~~")
        println(seqQ7(Seq(1,2,3))) // 0
        println(seqQ7(Seq(1,100,3))) // 200

        println("~~~~Question8~~~~")
        println(seqQ8(Seq(1,2,3))) // 4
        println(seqQ8(Seq(1,2))) // 3
        println(seqQ8(Seq(1))) // 2
        println(seqQ8(Seq())) // 0

        println("~~~~Question9~~~~")
        println(seqQ9(Seq(1,2,3))) // List(2)
        println(seqQ9(Seq(1,2))) // List()

        println("~~~~Question10~~~~")
        println(seqQ10(Seq(1,2,3))) // 4
        println(seqQ10(Seq(1,2))) // 0
        println(seqQ10(Seq(1))) // 0
        println(seqQ10(Seq())) // -1

        println("~~~~Question11~~~~")
        println(reverse(Seq(1,2,3,4,5,6))) // List(6, 5, 4, 3, 2, 1)
        println(reverse(Seq())) // List()

        println("~~~~Question12~~~~")
        println(product(Seq(1,2,3,4,5,6))) // 720
        println(product(Seq())) // 1

        println("~~~~Question13~~~~")
        println(product_with_error_handling(Seq(1,2,3,4,5,6))) // 720
        // println(product_with_error_handling(Seq()))

        println("~~~~Question14 and 15~~~~")
        seqQ14and15() // 12, 4
    }
}