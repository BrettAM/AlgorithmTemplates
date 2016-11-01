object Snippets{
    /** create a map of unique values to sequence of all occurances
      * groupBy Partitions this traversable collection into a map of traversable
      *   collections according to some discriminator function
      */
    seq.groupBy(identity)

    /** Do a binary search between l and r
      * Finds the lowest value where lt == false
      */
    def search(l: Int, r: Int)(implicit lt: Int=>Boolean):Int = {
        if(l > r) l
        else {
            val m = (l+r)/2
            if(lt(m)) search(m+1, r)
            else search(l, m-1)
        }
    }

    /** Find the greatest common divisor of two longs */
    def gcd(r: Long, s: Long): Long = {
        if (s == 0) r
        else gcd(s, r%s)
    }

    /** Find the least common multiple of a and b */
    def lcm(a: Long, b: Long): Long = a*b/gcd(a,b)

    /** find the log of a in an arbitrary base */
    def logb(a: Double, b: Double): Double = Math.log(a)/Math.log(b)

}
