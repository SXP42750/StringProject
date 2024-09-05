object UpperCase {
  def main(args: Array[String]): Unit = {
    var a = "Hello this is kaushik"
    def upperCase(a:String):String ={
      var b = a.toUpperCase()
      b
    }
    println("The uppercase of string is : " +upperCase(a))
  }
}
