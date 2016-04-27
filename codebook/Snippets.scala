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
        val m = (l+r)/2
        if(m == l || m == r) r
        else {
            if(lt(m)) search(l, m)
            else search(m, r)
        }
    }
}
