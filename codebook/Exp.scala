object Exp{
    /** Find the floor of the square root of v */
    def bigSqrt(v: BigInt): BigInt = {
        var x = BigInt(0)
        var nx = BigInt(Math.sqrt(v.toDouble).floor.toLong)
        while(x != nx && x!=nx+1){
            x = nx
            nx = (x + v/x)/BigInt(2);
            println(nx)
        }
        nx
    }

    /** Find the floor of the r'th root of v
      * The approximation works until v exceeds ~10^300 (largest double)
      *     Otherwise, start l=0, u=v, and wait
      */
    def bigRoot(v: BigInt, r:Int): BigInt = {
        val approx = Math.pow(v.toDouble, 1.0/r.toDouble)
        var l = BigInt(approx.toLong)-1
        var u = BigInt((approx*(1.0+1e-10)).toLong)+1
        var g = (l+u)/BigInt(2)
        while(g != l && g != u){
            println(g)
            if(g.pow(r) > v){
                u = g
            } else {
                l = g
            }
            g = (l+u)/BigInt(2)
        }
        g
    }

    /** find b^exp in log time */
    def fexp(b: Long, exp: Long): Long = {
        if(exp == 0) 1
        else {
            val s = fexp(b, exp/2)
            if(exp%2 == 0) s*s
            else s*s*b
        }
    }
}
