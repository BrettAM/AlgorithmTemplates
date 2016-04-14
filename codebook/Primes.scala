object Primes {
    val primes: Stream[Int] = 2 #:: 3 #:: Stream.from(5,2).filter{ q =>
        getDivisor(q) match {
            case None => true
            case _    => false
        }
    }

    def getDivisor(q: Long): Option[Long] = {
        def searchPrimeList(plist: Seq[Int]): Option[Long] = {
            val p = plist.head.toLong
            if(q%p == 0) Some(p)
            else if(p*p >= q) None
            else searchPrimeList(plist.tail)
        }
        searchPrimeList(primes)
    }
}
