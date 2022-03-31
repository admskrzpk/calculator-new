import org.scalatest.flatspec.AnyFlatSpec
import Calculator23._


class CalculatorSpec23 extends AnyFlatSpec {
  val path = "C:\\projects\\computer-day23\\test.txt"
  val input = Seq("- 2", "+ 1", "PRINT", "* 2", "PRINT", "/", "+ 2","-")

  it should  "check if file is correct" in {
    linesFromFile(path)  == input
  }


  it should "if calculation is correct" in {
    calculate(input) == 1
  }





}


