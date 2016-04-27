import scala.io.Source
import java.io.PrintStream
import Math._

object Solver {
    type Input = Unit
    //return remaining input and one parsed out problem; t will not be Nil
    def parseInput(t: Seq[String]): (Seq[String], Input) = {
        val first = t.head.split(' ').map(x => x.toInt)
        val input = ()
        (t.drop(1), input)
    }

    def doProblem(input: Input) = {
        //...
        //algorithm
        //...
    }

    def display(i :Int, a :Any, os: Seq[PrintStream]) {
        def jamFormat(obj: Any): String = obj match {
            case d: Double => "%1.7f" format d
            case s: Seq[_] => s.map(jamFormat).mkString(" ")
            case a         => a.toString
        }
        os.foreach(_.println(s"Case #$i: ${jamFormat(a)}"))
    }

    def splitInput(l: Seq[String], v: Seq[Input]): Seq[Input] = {
        if(l.length == 0) v.reverse
        else {
            val (remaining, input) = parseInput(l)
            splitInput(remaining, input +: v)
        }
    }

    def main(args: Array[String]) {
        val ifname = if(args.length >= 1) args(0) else "input.txt"
        val ofname = if(args.length >= 2) args(1) else "output.txt"
        val outfs = Seq(System.out, new PrintStream(ofname))
        //dropped line is the "T test cases follow" line
        val source = Source.fromFile(ifname).getLines().drop(1).toSeq
        val input  = splitInput(source, Nil)
        //change to "input.par" to try parallel execution
        val output = input.map(doProblem)
        output.zipWithIndex foreach { case(a,i) => display(i+1, a, outfs) }
    }
}
