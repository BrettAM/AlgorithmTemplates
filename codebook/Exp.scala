object Exp{
    //BigInt square root

    def fexp(b: Long, exp: Long): Long = {
        if(exp == 0) 1
        else {
            val s = fexp(b, exp/2)
            if(exp%2 == 0) s*s
            else s*s*b
        }
    }
}
