object Base {
    def baseString(i: Long, b: Long): Seq[Int] = {
        def rec(s: Long): Seq[Int] = {
            if(s == 0) Seq[Int]()
            else (s % b).toInt +: rec(s / b)
        }
        if(i == 0) Seq(0)
        else rec(i).reverse
    }

    def baseCompose(s: Seq[Int], b: Long): Long = {
        s.foldLeft(0L){ case (r,i) => r*b+i }
    }
}
