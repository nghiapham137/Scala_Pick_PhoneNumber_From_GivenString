import scala.util.matching.Regex

object Main {
  def main(args: Array[String]): Unit = {
    val input = "Frank,123 Main,925-555-1943,95122"
    val telephonePattern: Regex = "([0-9a-zA-Z- ]+),([0-9a-zA-Z- ]+),([0-9]{3}-[0-9]{3}-[0-9]{4}+),([0-9]+)".r
    for (patternMatch <- telephonePattern.findAllMatchIn(input)) {
      val output = patternMatch.group(3)
      val splitString = output.split("-")
      val tupleOuput = Tuple3(splitString(0), splitString(1), splitString(2))
      tupleOuput.productIterator.foreach(println)
    }
  }

}
