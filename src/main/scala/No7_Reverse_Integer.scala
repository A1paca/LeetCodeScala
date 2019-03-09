object No7_Reverse_Integer {
  val threshold = 214748364

  /**
    * 递归＋多层判断溢出
    * @param x:需要调转的数字
    * @return
    */
  def reverse(x: Int): Int = {
    @annotation.tailrec
    def loop(i: Int, acc: Int): Int =
      if (i == 0) if (x < 0) -acc else acc
      else {
        if (acc > threshold) 0 else loop(i / 10, acc * 10 + i % 10)
      }

    if (x == Int.MinValue) 0 else loop(x.abs, 0)
  }

  def main(args: Array[String]): Unit = {
    println(reverse(120930))
    println(2.1%10)
  }
}
