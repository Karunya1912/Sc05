object Fibonacci {
  def fibonacci(num: Int): Int = {
    if (num <= 1)
      num
    else
      fibonacci(num - 1) + fibonacci(num - 2)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number of terms: ")
    val n = scala.io.StdIn.readInt()
    println(s"Fibonacci series up to $n terms:")
    for (i <- 0 until n) {
      print(s"${fibonacci(i)} ")
    }
    println()
  }
}
