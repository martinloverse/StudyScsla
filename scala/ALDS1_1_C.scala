object ALDS1_1_C {
    def main(arg:Array[String]) = {
        // val lines = Iterator.continually(scala.io.StdIn.readLine).takeWhile(_ != null)
        val lines = mocups

        val counter = Stream.from(0).iterator
        println(lines.count(isPrimeNumber(_)))
    }

    def mocups() = {
        List(1, 2, 3, 4, 5, 7, 13, 21, 30, 31, 11273,11279,11287,11299,11311,11317,11321,11329,11355)
    }

    def isPrimeNumber(n:Int):Boolean = n match {
        case 0 => false
        case 1 => false
        case 2 => true
        case odd if (n % 2 == 0) => false
        case _ => {
            // 奇数 -> 試し割り判定
             (3 until n/2).filter(a => a % 2 == 1).forall(n % _ != 0)
        }
    }
}

ALDS1_1_C.main(null)

