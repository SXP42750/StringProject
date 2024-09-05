object LongestWord {
  def main(args: Array[String]): Unit = {
    var a = "Hi My Name is Kaushik"
    var b = a.split(" ")
    def longestWordLength(a: String): Int = {
      var maxLength = 0
      for (i <- 0 to b.length - 1) {
        val word = b(i)
        if (word.length > maxLength) {
          maxLength = word.length
        }
      }

      maxLength
    }

    val result = longestWordLength(a)
    println(s"The length of the longest word is $result")
  }
}