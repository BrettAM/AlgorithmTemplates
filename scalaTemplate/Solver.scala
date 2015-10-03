import scala.io.Source

object Solver {
    type Input = Unit
    //return remaining input and one parsed out problem; t will not be Nil
    def parseInput(t: List[String]): (List[String], Input) = {
        val first = t.head.split(' ').map(x => x.toInt)
        val input = ()
        (t.drop(1), input)
    }

    def doProblem(input: Input) = {
        //...
        //algorithm
        //...
    }

    def display(i :Int, a :Any) {
        println("Case #"+i+": "+(a match {
                case d: Double => "%1.7f" format d
                case a         => a.toString
            }) )
    }

    def main(args: Array[String]) {
        def splitInput(l: List[String], v: Seq[Input]): Seq[Input] = {
            if(l == Nil) v
            else {
                val (remaining, input) = parseInput(l)
                splitInput(remaining, input +: v)
            }
        }
        val ifname = if(args.length >= 1) args(0) else "input.txt"
        //dropped line is the "T test cases follow" line
        val source = Source.fromFile(ifname).getLines().toList.drop(1)
        //get input prepends as it recurses, resulting in a reversed list
        val input  = splitInput(source, Nil).reverse
        //change to "input.par" if you are feeling adventurous
        val output = input.map(problem => doProblem(problem))
        output.seq.zipWithIndex foreach { case(a,i) => display(i+1, a) }
    }
}
