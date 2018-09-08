
/**
  * 先用target减去数组中的数字，再在数组中寻找结果
  * zipWithIndex：自动地创建一个计数器，其结构为（x，count）
  * groupBy：将列表进行分组，分组的依据是应用f在元素上后产生的新元素
  * withFilter:过滤函数，参数为真时留下，假则剔除
  * contains:是否有某一元素，参数为常量
  * exists:是否存在某一元素，参数为布尔值
  */
object No1_TwoSum {
  def twoSum(nums: Array[Int], target: Int):Array[Int]= {
    //将出现的数字存储到map中，并记录位置
    val m = nums.zipWithIndex.groupBy(_._1)
    m.foreach(println)
    nums.zipWithIndex.withFilter(pair => {
      println(pair)
      val diff = target - pair._1
      //判断这个数在不在数组内
      m.contains(diff) && m(diff).exists(_._2 != pair._2)
    }).map(_._2)
  }

  def main(args: Array[String]): Unit = {
    val c = Array(2,7,11,15,7)
    for(s <- twoSum(c,9))println(s)
  }
}
